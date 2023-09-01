package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class makeAppointmentPage {
    private WebDriver driver;
   public makeAppointmentPage(WebDriver driver){this.driver=driver;}

    private By dropDownBtn=By.id("combo_facility");
   private By radioBtn=By.className("checkbox-inline");
   private By insuranceBtn=By.cssSelector(".radio-inline:nth-child(2)");
   private By calendar=By.id("txt_visit_date");
   private By book=By.id("btn-book-appointment");
   public void selectFacility(String option){
       driver.findElement(dropDownBtn).click();
       Select dropDown=new Select(driver.findElement(dropDownBtn));
       dropDown.selectByValue(option);
   }

public void checkRadioBtn(){
       driver.findElement(radioBtn).click();
}
public void checkInsurance(){
       driver.findElement(insuranceBtn).click();
}
public void chooseDate(String date){
       driver.findElement(calendar).sendKeys(date);
}
public confirmationPage confirmAppointment(){
       driver.findElement(book).click();
    return new confirmationPage(driver);
   }
}
