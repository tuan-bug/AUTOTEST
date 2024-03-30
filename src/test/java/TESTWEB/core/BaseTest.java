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
        String chromeDriverPath = "E:\\ATOS2023_R01\\chromedriver.exe";

        // Thiết lập cấu hình cho ChromeDriver
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        driver.navigate().to("https://sammynguyen.com/");
        // Khởi tạo WebDriver với Chrome
        driver = new ChromeDriver();

        // Mở trang web
        driver.get("https://sammynguyen.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void affterTest(){
        //driver.close();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
