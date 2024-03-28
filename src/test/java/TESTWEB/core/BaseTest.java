package TESTWEB.core;

// file base, khởi ta web

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

// base test là befortesst và afftertest
public class BaseTest {

    protected WebDriver driver;
    @BeforeTest
    public void beforTest(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://sammynguyen.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void affterTest(){
        driver.close();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
