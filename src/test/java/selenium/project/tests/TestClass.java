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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass {
    private WebDriver driver;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }



    @Test
    public void test() {

        HomePage homePage = new HomePage();
        homePage.open();

        ManagerCookie.addCookie("example_key_1","example_value_1");
        ManagerCookie.addCookie("example_key_2","example_value_2");
        ManagerCookie.addCookie("example_key_3","example_value_3");

        Assert.assertEquals(ManagerCookie.getAmountCookies(),3,"amount of cookies is incorrect");

        ManagerCookie.deleteCookie("example_key_1");

        ManagerCookie.deleteCookie("example_key_1");

        MainPage mainPage = new MainPage();
        mainPage.open();
        Assert.assertEquals(homePage.getText(),"\n");

        mainPage.clickLogIn();

        WebElement login1 = driver.findElement(By.xpath("//input[@name='login']"));
        WebElement login2 = driver.findElement(By.name("login" ));
        login1.sendKeys("login");
        WebElement secondLogin = driver.findElement(By.id("passp:sign-in"));
        secondLogin.click();
        List<WebElement> elements = driver.findElements(By.xpath(""));

        Assert.assertEquals(elements.size(), 26, "");
        int random = (int) (Math.random() * elements.size());

    }
    @AfterMethod
    public void tearDown() {
        if (driver!= null) {
            driver.quit();
        }
    }

}
