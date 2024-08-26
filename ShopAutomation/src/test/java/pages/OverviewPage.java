package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends BasePage {

    @FindBy(id ="finish")
    private WebElement finishBtn;

    public OverviewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CheckoutCompletePage clickOnFinish(){
        this.isElementDisplayed(finishBtn);
        finishBtn.click();
        return new CheckoutCompletePage(this.driver);
    }
}
