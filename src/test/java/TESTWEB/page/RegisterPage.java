package TESTWEB.page;

import TESTWEB.core.BasePage;
import TESTWEB.core.BaseTest;
import TESTWEB.elements.RegisterElement;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BasePage {
    RegisterElement registerElement = new RegisterElement(driver);
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void TestRegister(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathRegister())));
        registerElement.pathRegister.click();
        registerElement.pathInputLastName.sendKeys("Trần");
        registerElement.pathInputFistName.sendKeys("Trang");
        registerElement.pathInputEmail.sendKeys("trang12@gmail.com");
        registerElement.pathInputPassword.sendKeys("trang1234");
        registerElement.pathBtnRegister.click();
        registerElement.pathLogout.click();
    }
    public void TestRegisterEmailAlreadlyExists(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathRegister())));
        registerElement.pathRegister.click();
        registerElement.pathInputLastName.sendKeys("Trần");
        registerElement.pathInputFistName.sendKeys("Trang");
        registerElement.pathInputEmail.sendKeys("trang12@gmail.com");
        registerElement.pathInputPassword.sendKeys("trang1234");
        registerElement.pathBtnRegister.click();
        registerElement.pathErrorEmail.getText();
        if(registerElement.pathErrorEmail.getText().equals("Email đã tồn tại.")){
            System.out.println("PASS email tồn tại");
        }

    }
    public void TestRegisterInvalidEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathRegister())));
        registerElement.pathRegister.click();
        registerElement.pathInputLastName.sendKeys("Trần");
        registerElement.pathInputFistName.sendKeys("Trang");
        registerElement.pathInputEmail.sendKeys("trang12546f");
        registerElement.pathInputPassword.sendKeys("trang1234");
        registerElement.pathBtnRegister.click();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathLogout())));
            System.out.println("Logout button is displayed, registration might have failed.");
        } catch (TimeoutException e) {
            // Nếu không tìm thấy nút logout, coi test là pass
            System.out.println("Logout button is not displayed, registration succeeded. Test passed.");
        }
    }

    public void TestRegisterWithWeakPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathRegister())));
        registerElement.pathRegister.click();
        registerElement.pathInputLastName.sendKeys("Trần");
        registerElement.pathInputFistName.sendKeys("Trang");
        registerElement.pathInputEmail.sendKeys("trang125@gmail.com");
        registerElement.pathInputPassword.sendKeys("trang");
        registerElement.pathBtnRegister.click();
        String errorMessage = registerElement.pathErrorPassword.getText();

        // Kiểm tra xem văn bản có chứa chuỗi "Mật khẩu yếu" hay không
        if(errorMessage.contains("Mật khẩu dài từ 6 đến 50 ký tự")) {
            System.out.println("Test passed. Weak password error message is displayed.");
        } else {
            System.out.println("Test failed. Weak password error message is not displayed.");
        }
    }

    public void TestRegisterEmailNull(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathRegister())));
        registerElement.pathRegister.click();
        registerElement.pathInputLastName.sendKeys("Trần");
        registerElement.pathInputFistName.sendKeys("Trang");
        registerElement.pathInputEmail.sendKeys("");
        registerElement.pathInputPassword.sendKeys("trang1234");
        registerElement.pathBtnRegister.click();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathLogout())));
            System.out.println("Test fail, Logout button is displayed, registration might have failed.");
        } catch (TimeoutException e) {
            // Nếu không tìm thấy nút logout, coi test là pass
            System.out.println("Test passed, Logout button is not displayed, registration succeeded. ");
        }
    }
    public void TestRegisterAllNull(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathRegister())));
        registerElement.pathRegister.click();
        registerElement.pathInputLastName.sendKeys("");
        registerElement.pathInputFistName.sendKeys("");
        registerElement.pathInputEmail.sendKeys("");
        registerElement.pathInputPassword.sendKeys("");
        registerElement.pathBtnRegister.click();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathLogout())));
            System.out.println("Test fail, Logout button is displayed, registration might have failed.");
        } catch (TimeoutException e) {
            // Nếu không tìm thấy nút logout, coi test là pass
            System.out.println("Test passed, Logout button is not displayed, registration succeeded. ");
        }
    }
}
