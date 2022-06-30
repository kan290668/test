package selenium.framework.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.


public class BrowserFactory {
    public static WebDriver getDriwer(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;

    }

}