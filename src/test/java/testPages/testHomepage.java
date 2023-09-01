package testPages;

import Pages.Homepage;
import TestBase.Base;
import org.testng.annotations.Test;

public class testHomepage extends Base {


@Test
        public void TestLogin(){
   Homepage homePage= new Homepage(driver);
   homePage.clickAppointmentBtn();
}

}
