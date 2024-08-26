package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class PurchaseTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    @Parameters({"FIRST_NAME", "LAST_NAME", "ZIP_CODE"})
    public void addProductToCart(String firstName, String lastName, String zipCode){
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = homePage.purchaseProduct();
        UserInfoPage userInfoPage = cartPage.checkoutCart();
        OverviewPage overviewPage = userInfoPage.sendUserInfo(firstName, lastName, zipCode);
        CheckoutCompletePage checkoutCompletePage = overviewPage.clickOnFinish();
        softAssert.assertEquals(checkoutCompletePage.expectedResult(), "Thank you for your order!");
        softAssert.assertAll();
    }
}
