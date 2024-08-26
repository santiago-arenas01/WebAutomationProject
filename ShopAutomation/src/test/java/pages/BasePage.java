package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.MyDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(String driverPath, String url) {
        this.driver = MyDriver.getDriver(driverPath);
        driver.get(url);
        PageFactory.initElements(driver, this);
    }
}
