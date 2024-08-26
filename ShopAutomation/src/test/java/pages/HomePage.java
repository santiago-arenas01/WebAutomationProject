package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        this.isElementDisplayed(firstProductBtn);
        firstProductBtn.click();
        this.isElementDisplayed(cartBtn);
        cartBtn.click();
        return new CartPage(this.driver);
    }

    public CartPage addThreeProducts(){
        this.isElementDisplayed(firstProductBtn);
        firstProductBtn.click();
        this.isElementDisplayed(secondProductBtn);
        secondProductBtn.click();
        this.isElementDisplayed(thirdProductBtn);
        thirdProductBtn.click();
        this.isElementDisplayed(cartBtn);
        cartBtn.click();
        return new CartPage(this.driver);
    }

    public LoginPage logout(){
        this.isElementDisplayed(menuBtn);
        menuBtn.click();
        this.isElementDisplayed(this.logoutBtn);
        logoutBtn.click();
        return new LoginPage(this.driver);
    }
}
