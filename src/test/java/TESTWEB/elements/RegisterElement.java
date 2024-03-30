package TESTWEB.elements;

import TESTWEB.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterElement extends BasePage {
    public RegisterElement(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='list-inline f-right']/li/a[text()='Đăng ký']")
    public WebElement pathRegister;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement pathInputLastName;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement pathInputEmail;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement pathInputFistName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement pathInputPassword;
    @FindBy(xpath = "//button[text()='Đăng ký']")
    public WebElement pathBtnRegister;
    @FindBy(xpath = "//ul[@class='list-inline f-right']/li/a[text()='Đăng xuất']")
    public WebElement pathLogout;
    @FindBy(xpath = "//div[@class='errors']//ul//li")
    public WebElement pathErrorEmail;
    @FindBy(xpath = "//div[@class='errors']/ul/li[text()='Mật khẩu dài từ 6 đến 50 ký tự']")
    public WebElement pathErrorPassword;

    public String strpathRegister(){
        return "//ul[@class='list-inline f-right']/li/a[text()='Đăng ký']";
    }
    public String strpathLogout(){
        return "//ul[@class='list-inline f-right']/li/a[text()='Đăng xuất']";
    }

}
