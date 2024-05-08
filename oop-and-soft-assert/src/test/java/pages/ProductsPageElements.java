package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class ProductsPageElements {
    @FindBy(xpath = "//a[@data-test='item-4-title-link']/div")
    protected WebElement sauceLabsBackpackTitle;
    @FindBy(xpath = "//a[@data-test='item-4-title-link']/following-sibling::div[@data-test='inventory-item-desc']")
    protected WebElement sauceLabsBackpackDescription;
    @FindBy(xpath = "//a[@data-test='item-0-title-link']")
    protected WebElement sauceLabsBikeLightTitle;
    @FindBy(xpath = "//a[@data-test='item-0-title-link']/following-sibling::div[@data-test='inventory-item-desc']")
    protected WebElement sauceLabsBikeLightDescription;

    public ProductsPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
