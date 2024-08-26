package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePage extends BasePage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement firstProductBtn;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement secondProductBtn;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement thirdProductBtn;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartBtn;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CartPage purchaseProduct() {
        firstProductBtn.click();
        cartBtn.click();
        return new CartPage(this.driver);
    }

    public CartPage addThreeProducts(){
        firstProductBtn.click();
        secondProductBtn.click();
        thirdProductBtn.click();
        cartBtn.click();
        return new CartPage(this.driver);
    }

    public LoginPage logout(){
        menuBtn.click();
        logoutBtn.click();
        return new LoginPage(this.driver);
    }
}
