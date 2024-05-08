package pages;

import data.user.User;
import org.openqa.selenium.WebDriver;

public class LoginPageController extends LoginPageElements {
    public LoginPageController(WebDriver driver) {
        super(driver);
    }
    private LoginPageController fillUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    private LoginPageController fillPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    private void clickLogin() {
        loginButton.click();
    }

    public void login(User user) {
        fillUsername(user.getUsername());
        fillPassword(user.getPassword());
        clickLogin();
    }
}
