package TESTWEB.page;

import TESTWEB.core.BasePage;
import TESTWEB.elements.AddProductElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProductPage extends BasePage {
    AddProductElement addProductElement = new AddProductElement(driver);
    public AddProductPage(WebDriver driver) {
        super(driver);
    }

    public void AddProductToCart(){
        addProductElement.pathBagAndBelt.click();
        addProductElement.pathProductBag.click();
        addProductElement.pathAddToCart.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addProductElement.pathCLose())));
        addProductElement.pathCloseModalAddCart.click();
        addProductElement.pathCartHome.click();
        boolean isProductInCart = addProductElement.pathCheckCart.isDisplayed();

        // Hiển thị thông báo tương ứng
        if(isProductInCart) {
            System.out.println("Có sản phẩm trong giỏ hàng.");
        } else {
            System.out.println("Không có sản phẩm trong giỏ hàng.");
        }
    }
    public void AddManyProductToCart(){
        addProductElement.pathLogoClick.click();
        /// sản phẩm 1 vào giỏ hàng
        addProductElement.pathBagAndBelt.click();
        addProductElement.pathProductBag2.click();
        addProductElement.pathAddToCart.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addProductElement.pathCLose())));
        addProductElement.pathCloseModalAddCart.click();

        addProductElement.pathLogoClick.click();
        /// sản phẩm 2 vào giỏ hàng
        addProductElement.pathGlasses.click();
        addProductElement.pathProductGlasses.click();
        addProductElement.pathAddToCart.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addProductElement.pathCLose())));
        addProductElement.pathCloseModalAddCart.click();

        addProductElement.pathCartHome.click();
        boolean isProductInCart = addProductElement.pathCheckCart.isDisplayed();

        // Hiển thị thông báo tương ứng
        if(isProductInCart) {
            System.out.println("Có sản phẩm trong giỏ hàng.");
        } else {
            System.out.println("Không có sản phẩm trong giỏ hàng.");
        }
    }
}
