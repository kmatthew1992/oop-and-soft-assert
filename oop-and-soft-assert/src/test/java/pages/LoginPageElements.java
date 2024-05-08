package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class LoginPageElements {
    @FindBy(xpath = "//input[@data-test='username']")
    WebElement usernameField;
    @FindBy(xpath = "//input[@data-test='password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@data-test='login-button']")
    WebElement loginButton;

    public LoginPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
