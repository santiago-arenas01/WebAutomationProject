package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    @Parameters({"CHROMEDRIVER_PATH", "URL", "USERNAME", "PASSWORD"})
    public void setUp(String driverPath,String url, String username, String password) {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        loginPage.isLoginSuccessful();
    }

    /*@AfterTest
    public void closeNavigator(){
        driver.close();
    }*/
}
