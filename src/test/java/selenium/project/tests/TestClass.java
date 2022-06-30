package selenium.project.tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.framework.cookies.ManagerCookie;
import selenium.project.pages.HomePage;
import selenium.project.pages.MainPage;
import testng_first.tests.BaseTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass extends BaseTest {
    private WebDriver driver;


    @Test
    public void test() {

        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickJSAlert();
        Assert.assertEquals ManagertAlert/g();
        homePage.clickConfirm();
        homePage.clickPrompt();


    }
    @AfterMethod
    public void tearDown() {
        if (driver!= null) {
            driver.quit();
        }
    }

}
