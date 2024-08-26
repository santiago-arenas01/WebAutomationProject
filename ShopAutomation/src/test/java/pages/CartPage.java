package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CartPage extends BasePage{

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeFirstProBtn;

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    private WebElement removeSecondProBtn;

    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    private WebElement removeThirdProBtn;

    @FindBy(className = "cart_item")
    private List<WebElement> cartContainer;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public UserInfoPage checkoutCart(){
        checkoutBtn.click();
        return new UserInfoPage(this.driver);
    }

    public void removeProducts() {
        if (removeFirstProBtn.isDisplayed()) {
            removeFirstProBtn.click();
        }
        if (removeSecondProBtn.isDisplayed()) {
            removeSecondProBtn.click();
        }
        if (removeThirdProBtn.isDisplayed()) {
            removeThirdProBtn.click();
        }
    }

    public boolean isCartEmpty(){
        return cartContainer.isEmpty();
    }
}
