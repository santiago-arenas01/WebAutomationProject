package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class RemoveProductsTest extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void removeProducts(){
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = homePage.addThreeProducts();
        cartPage.removeProducts();
        softAssert.assertEquals(cartPage.isCartEmpty(), true);
        softAssert.assertAll();
    }
}
