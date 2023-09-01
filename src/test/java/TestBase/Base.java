package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {


   protected WebDriver driver;
    @BeforeTest
    public void setup() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("Start-maximized");
        option.addArguments("incognito");
        driver = new ChromeDriver(option);
            driver.get("https://katalon-demo-cura.herokuapp.com/");

    }
@AfterTest
    public void close(){
        driver.close();
    }

}