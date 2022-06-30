package selenium.project.pages;

import org.openqa.selenium.By;
import selenium.framework.browser.Browser;
import selenium.framework.elements.AbstractElement;

import javax.xml.namespace.QName;

public class HomePage extends BasePage {
    private FormElement buttonJSalert = new FormElement(By.xpath("/button[@onclick='jsAlert()'] "),"buttonJSAlert");
    private FormElement buttonJSConfirm = new FormElement(By.xpath("/button[@onclick='jsConfirm()'] "),"buttonJSConfirm");
    private FormElement buttonJSPrompt = new FormElement(By.xpath("/button[@onclick='jsPrompt()'] "),"buttonJSPrompt");
    private FormElement textResult = new FormElement(By.xpath("//p[@id='=result']"), "text Result");

    public  void open() {
        Browser.BROWSER.open();

    }
    public void clickJSAlert() {
        buttonJSalert.click();
    }
     public void clickConfirm() {
        buttonJSConfirm.click();
     }
     public void clickPrompt() {
        buttonJSPrompt.click();
     }
     public

}
