package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
    public static WebDriver get(DriverType type) {

        switch (type) {
            case CHROME -> {
                return new ChromeDriver();
            }
            case FIREFOX -> {
                return new FirefoxDriver();
            }
            case SAFARI -> {
                return new SafariDriver();
            }
            case EDGE -> {
                return new EdgeDriver();
            }
            default -> throw new RuntimeException();
        }

    }
}
