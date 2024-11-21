package Pages;

import Utilities.GWD;
import Utilities.GWD_New;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {
    WebDriverWait wait=new WebDriverWait(GWD_New.getDriver(), Duration.ofSeconds(20));

    public void mySendKeys(WebElement element ,String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void myClick(WebElement element){
       wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) GWD_New.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element,String value){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"Giriş başarısız");
    }
    //örnek olarak bırakıldı
    public void verifyMessageContainsTextInceleme(String value){
        //Problem : mesajın hızlı çıkıp kaybolması dolayısıyla getTExt in oluşamaması ve assert yapamamamız
        //Amaç : mesajın çıktığı noktadaki elementin bu mesajını başka nasıl assert yapabilirim
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
//        for (WebElement e :messageBoxElement ){
//            System.out.println("->" +e.getText()+"<->"+e.getAccessibleName()+"<->"+e.getTagName());
//        }
        WebElement messageBoxParent2=GWD_New.getDriver().findElement(By.tagName("mat-panel-description"));
//        System.out.println("messageBoxParent2.getText() = " + messageBoxParent2.getText()); // ekranda gözüken text
//        System.out.println("messageBoxParent2.getAccessibleName() = " + messageBoxParent2.getAccessibleName()); // ekrandan ulaşılabilen her bilgisi , sana html den veriyor
//        System.out.println("messageBoxParent2.getTagName() = " + messageBoxParent2.getTagName()); // tag name
//        System.out.println("messageBoxParent2.getAttribute(\"innerHTML\") = " + messageBoxParent2.getAttribute("innerHTML")); // taglerinin arasındaki html kodu

        Assert.assertTrue(messageBoxParent2.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));
    }
}
