package pages;

import org.openqa.selenium.WebDriver;

public class ProductsPageController extends ProductsPageElements {
    public ProductsPageController(WebDriver driver) {
        super(driver);
    }

    public String getSauceLabsBackpackTitleText() {
        return sauceLabsBackpackTitle.getText();
    }
    public String getSauceLabsBackpackDescriptionText() {
        return sauceLabsBackpackDescription.getText();
    }
    public String getSauceLabsBikeLightTitleText() {
        return sauceLabsBikeLightTitle.getText();
    }
    public String getSauceLabsBikeLightDescriptionText() {
        return sauceLabsBikeLightDescription.getText();
    }
}
