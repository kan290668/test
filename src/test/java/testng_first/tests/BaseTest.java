package testng_first.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.framework.browser.Browser;

public class BaseTest {
    private Browser browser = Browser.BROWSER;
     @BeforeMethod
    public void setUp() {
         browser.maximize();
     }

     @AfterMethod
    public void tearDown(){

     }
}
