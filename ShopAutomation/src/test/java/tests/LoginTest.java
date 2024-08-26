package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import pages.LoginPage;
import utils.MyDriver;

public class LoginTest {

    private LoginPage loginPage;

    @BeforeTest
    @Parameters({"CHROMEDRIVER_PATH", "URL"})
    public void setUp(String driverPath, String url) {
        loginPage = new LoginPage(driverPath, url);
    }

    @Test
    @Parameters({"USERNAME", "PASSWORD"})
    public void testLogin(String username, String password) {
        loginPage.login(username, password);
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login was not successful");
    }

}
