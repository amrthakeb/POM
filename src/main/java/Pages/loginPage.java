package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
   private WebDriver driver;
    public loginPage(WebDriver driver){this.driver=driver;}
    private By userName=By.id("txt-username");
    private By passWord=By.id("txt-password");
    private By loginBtn=By.id("btn-login");

    public makeAppointmentPage doLogin(String username, String password)
    {
        driver.findElement(userName).sendKeys(username);
        driver.findElement(passWord).sendKeys(password);
        driver.findElement(loginBtn).click();
            return new makeAppointmentPage(driver);
    }
}
