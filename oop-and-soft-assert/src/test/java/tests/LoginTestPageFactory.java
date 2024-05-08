package tests;


import data.user.UserFactory;
import data.user.UserRecord;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPageController;
import util.DriverFactory;
import util.DriverType;


public class LoginTestPageFactory {
    private final WebDriver driver = DriverFactory.get(DriverType.CHROME);
    private final LoginPageController loginPage = new LoginPageController(driver);
    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login(UserFactory.getUserWithValidCredentials());
    }

    @Test
    public void invalidPasswordLoginTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login(UserFactory.getUserWithInvalidPassword());
    }

    @Test
    public void invalidUsernameLoginTest() {
        driver.get("https://www.saucedemo.com/");
        UserRecord userRecord = new UserRecord("standard_user", "secret_sauce");
        userRecord.username();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

