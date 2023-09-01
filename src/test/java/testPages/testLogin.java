package testPages;

import Pages.Homepage;
import Pages.loginPage;
import TestBase.Base;
import org.testng.annotations.Test;

public class testLogin extends Base {
    @Test
    public void testLogin(){
        Homepage homepage=new Homepage(driver);
        homepage.clickAppointmentBtn();
        loginPage Login=new loginPage(driver);
        Login.doLogin("John Doe","ThisIsNotAPassword");

    }
}
