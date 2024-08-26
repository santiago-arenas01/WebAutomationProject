package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPage extends BasePage{

    @FindBy(id = "first-name")
    private WebElement firstNameField;

    @FindBy(id = "last-name")
    private WebElement lastNameField;

    @FindBy(id = "postal-code")
    private WebElement zipCodeField;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    public UserInfoPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public OverviewPage sendUserInfo(String firstName, String lastName, String zipCode) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        zipCodeField.sendKeys(zipCode);
        continueBtn.click();
        return new OverviewPage(this.driver);
    }
}
