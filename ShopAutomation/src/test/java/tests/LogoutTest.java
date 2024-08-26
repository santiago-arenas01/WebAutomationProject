package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class LogoutTest extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void logout(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.logout();
        softAssert.assertEquals(loginPage.isLoginPage(), true);
        softAssert.assertAll();
    }
}
