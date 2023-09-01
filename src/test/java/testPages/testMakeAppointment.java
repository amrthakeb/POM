package testPages;

import Pages.Homepage;
import Pages.confirmationPage;
import Pages.loginPage;
import Pages.makeAppointmentPage;
import TestBase.Base;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testMakeAppointment extends Base {
@Test
    public void testApppointment(){
        Homepage homepage=new Homepage(driver);
        homepage.clickAppointmentBtn();
        loginPage Login=new loginPage(driver);
        Login.doLogin("John Doe","ThisIsNotAPassword");

        makeAppointmentPage makeApp=new makeAppointmentPage(driver);
        makeApp.selectFacility("Hongkong CURA Healthcare Center");
        makeApp.checkRadioBtn();
        makeApp.checkInsurance();
        makeApp.chooseDate("25/12/1996");
        makeApp.confirmAppointment();

        confirmationPage confirm=new confirmationPage(driver);
        Assert.assertEquals(confirm.findText(),"Appointment Confirmation");
}

}
