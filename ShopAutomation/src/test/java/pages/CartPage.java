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
        this.isElementDisplayed(checkoutBtn);
        checkoutBtn.click();
        return new UserInfoPage(this.driver);
    }

    public void removeProducts() {
        this.isElementDisplayed(removeFirstProBtn);
        removeFirstProBtn.click();
        this.isElementDisplayed(removeSecondProBtn);
        removeSecondProBtn.click();
        this.isElementDisplayed(removeThirdProBtn);
        removeThirdProBtn.click();
    }

    public boolean isCartEmpty(){
        return cartContainer.isEmpty();
    }
}
