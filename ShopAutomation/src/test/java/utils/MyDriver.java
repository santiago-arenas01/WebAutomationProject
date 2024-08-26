package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
    private static WebDriver driver;

    private MyDriver() {
    }

    public static WebDriver getDriver(String driverPath){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        return driver;
    }
}
