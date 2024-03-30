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


    public void clickLogo(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homePageElement.pathLogo())));

        homePageElement.logoClick.click();
    }

    public void clickMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homePageElement.pathMenuProduct())));
        homePageElement.productHome.click();
        homePageElement.introduceHome.click();
        homePageElement.newsHome.click();

        homePageElement.contactHome.click();
        homePageElement.inputName.sendKeys("Thu Trang");
        homePageElement.inputEmail.sendKeys(("trang@gmail.com"));
        homePageElement.inputPhone.sendKeys("0975 449 273");
        homePageElement.inputMessage.sendKeys("Sản phẩm của các bạn rất tốt cần bán thêm nhiều loại rẻ hơn");
        homePageElement.btnGui.click();
        String alert = homePageElement.alertSuccess.getText().trim();
        if(alert != null && alert.equals("Bạn đã gửi liên hệ thành công")){
            System.out.println("Test pass");
        }
        else {
            System.err.println("Test fail");
        }
        homePageElement.cartHome.click();
    }

}
