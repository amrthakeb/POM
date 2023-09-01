package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmationPage {
     WebDriver driver;
    public confirmationPage(WebDriver driver){
        this.driver=driver;
    }

private By confirmTitle= By.xpath("//*[@id=\"summary\"]/div/div/div[1]/h2");
public String findText(){
   String x= driver.findElement(confirmTitle).getText();
 return x;
}



}
