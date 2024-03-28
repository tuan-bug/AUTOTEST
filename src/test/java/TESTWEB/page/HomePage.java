package TESTWEB.page;

import TESTWEB.core.BasePage;
import TESTWEB.elements.HomePageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//các hành động hay action ở đây
public class HomePage extends BasePage {
    HomePageElement homePageElement = new HomePageElement(driver);
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLogin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homePageElement.pathLogin())));

        homePageElement.loginHome.click();
    }

}
