package TESTWEB.page;

import TESTWEB.core.BasePage;
import TESTWEB.elements.LoginElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    LoginElement loginElement = new LoginElement(driver);
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void TestLogin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.pathLogin.click();
        loginElement.pathEmail.sendKeys("testemail11@gmail.com");
        loginElement.pathPassword.sendKeys("123456");
        loginElement.btnLogin.click();
        String Log = loginElement.pathmyAcount.getText();
        if(Log.contains("Tài khoản của tôi")) {
            System.out.println("Test passed. ");
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void TestLoginWithPasswordError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.pathLogin.click();
        loginElement.pathEmail.sendKeys("testemail11@gmail.com");
        loginElement.pathPassword.sendKeys("12345678");
        loginElement.btnLogin.click();
        String Log = loginElement.pathErrorLogin.getText().trim();
        if(Log.contains("Thông tin đăng nhập không chính xác.")) {
            System.out.println("Test passed. ");
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void TestLoginWithPasswordNull(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.pathLogin.click();
        loginElement.pathEmail.sendKeys("testemail11@gmail.com");
        loginElement.pathPassword.sendKeys("");
        loginElement.btnLogin.click();
        String Log = loginElement.pathErrorPassword.getText().trim();
        if(Log.contains("Vui lòng nhập Mật khẩu")) {
            System.out.println("Test passed. ");
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void TestLoginWithAllNull(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.pathLogin.click();
        loginElement.pathEmail.sendKeys("");
        loginElement.pathPassword.sendKeys("");
        loginElement.btnLogin.click();
        String Log = loginElement.pathErrorAllNull.getText().trim();
        System.out.println(Log);
        if(Log.contains("Vui lòng nhập Email Vui lòng nhập Mật khẩu")) {
            System.out.println("Test passed. ");
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void TestLoginWithEmailError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.pathLogin.click();
        loginElement.pathEmail.sendKeys("trangtt@gmail.com");
        loginElement.pathPassword.sendKeys("");
        loginElement.btnLogin.click();
        String Log = loginElement.pathErrorEmail.getText().trim();
        System.out.println(Log);
        if(Log.contains("Vui lòng nhập Mật khẩu")) {
            System.out.println("Test passed. " + Log.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }
}
