package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;
    }
    private By makeAppointmentBtn= By.id("btn-make-appointment");
    public loginPage clickAppointmentBtn(){
        driver.findElement(makeAppointmentBtn).click();
        return new loginPage(driver); // Create and return a LoginPage instance

    }

}
