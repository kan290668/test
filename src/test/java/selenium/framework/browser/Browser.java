package selenium.framework.browser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import selenium.utils.ConfigFileReader;

public class Browser {

    private WebDriver driver;
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    public static final Browser BROWSER = new Browser();

    private Browser() {
        driver = BrowserFactory.getDriwer(config.getBrowserName());
    }


    public void open () {
        driver.get(config.getApplicationUrl());
    }

    public void clous() {

            driver.quit();

    }

    public void maximize () {
        driver.manage().window().maximize();
        }


        public WebDriver getDriver() {
            return driver;

        }


    }
