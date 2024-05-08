package tests;

import data.product.Product;
import data.product.ProductFactory;
import data.product.ProductType;
import data.user.UserFactory;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPageController;
import pages.ProductsPageController;

public class TestProductTitlesAndDescriptions {
    private final WebDriver driver = new ChromeDriver();
    private final LoginPageController loginPageController = new LoginPageController(driver);
    private final ProductsPageController productsPageController = new ProductsPageController(driver);
    private final SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void validateProductTitlesAndDescriptions() {
        driver.get("https://www.saucedemo.com/");
        loginPageController.login(UserFactory.getUserWithValidCredentials());
        String actualBikeTitle = productsPageController.getSauceLabsBikeLightTitleText();
        String actualBikeDescription = productsPageController.getSauceLabsBikeLightDescriptionText();
        String actualBackpackTitle = productsPageController.getSauceLabsBackpackTitleText();
        String actualBackpackDescription = productsPageController.getSauceLabsBackpackDescriptionText();

        String expectedBikeTitle = "Sauce Labs Bike Light";
        String expectedBikeDescription = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
        String expectedBackpackTitle = "Sauce Labs Backpack";
        String expectedBackpackDescription = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";

        softAssertions.assertThat(actualBikeTitle).isEqualTo(expectedBikeTitle);
        softAssertions.assertThat(actualBikeDescription).isEqualTo(expectedBikeDescription);
        softAssertions.assertThat(actualBackpackTitle).isEqualTo(expectedBackpackTitle);
        softAssertions.assertThat(actualBackpackDescription).isEqualTo(expectedBackpackDescription);
    }

    @Test
    public void validateProductTitlesAndDescriptionsUsingProductObjects() {
        driver.get("https://www.saucedemo.com/");
        loginPageController.login(UserFactory.getUserWithValidCredentials());
        Product actualBikeProduct = new Product();
        actualBikeProduct.setTitle(productsPageController.getSauceLabsBikeLightTitleText());
        actualBikeProduct.setDescription(productsPageController.getSauceLabsBikeLightDescriptionText());

        Product actualBackpackProduct = new Product();
        actualBackpackProduct.setTitle(productsPageController.getSauceLabsBackpackTitleText());
        actualBackpackProduct.setDescription(productsPageController.getSauceLabsBackpackDescriptionText());

        Product expectedBikeProduct = ProductFactory.getExpectedProduct(ProductType.BIKE);
        Product expectedBackpackProduct = ProductFactory.getExpectedProduct(ProductType.BACKPACK);

        softAssertions.assertThat(actualBackpackProduct.getTitle()).isEqualTo(expectedBackpackProduct.getTitle());


    }

    @AfterEach
    public void tearDown() {
        driver.quit();
        softAssertions.assertAll();
    }
}
