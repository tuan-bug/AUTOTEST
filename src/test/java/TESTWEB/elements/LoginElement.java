package TESTWEB.elements;

import TESTWEB.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElement extends BasePage {
    public LoginElement(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//ul[@class='list-inline f-right']/li/a[text()='Đăng nhập']")
    public WebElement pathLogin;
    @FindBy(xpath = "//input[@id='customer_email']")
    public WebElement pathEmail;
    @FindBy(xpath = "//input[@id='customer_password']")
    public WebElement pathPassword;
    @FindBy(xpath = "//input[@value='Đăng nhập']")
    public WebElement btnLogin;
    @FindBy(xpath = "//h5[text()='Tài khoản của tôi']")
    public WebElement pathmyAcount;
    @FindBy(xpath = "//form[@id='customer_login']/div[@class='form-signup']")
    public WebElement pathErrorLogin;
    @FindBy(xpath = "//form[@id='customer_login']/div[1]")
    public WebElement pathErrorPassword;
    @FindBy(xpath = "//form[@id='customer_login']/div[@class='form-signup']")
    public WebElement pathErrorAllNull;
    @FindBy(xpath = "//form[@id='customer_login']/div[@class='form-signup']")
    public WebElement pathErrorEmail;

    public String strPathLogin(){
        return "//ul[@class='list-inline f-right']/li/a[text()='Đăng nhập']";
    }
}
