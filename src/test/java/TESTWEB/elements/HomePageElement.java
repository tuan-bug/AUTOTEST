package TESTWEB.elements;

import TESTWEB.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.xpath.XPath;

public class HomePageElement extends BasePage {
    public HomePageElement(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[@class='logo-wrapper ']")
    public WebElement logoClick;
    @FindBy(xpath = "//ul[@class='nav nav-left']/li/a/span[text()='Sản phẩm']")
    public WebElement productHome;
    @FindBy(xpath = "//ul[@class='nav nav-left']/li/a/span[text()='Giới thiệu']")
    public WebElement introduceHome;
    @FindBy(xpath = "//ul[@class='nav nav-left']/li/a/span[text()='Tin tức']")
    public WebElement newsHome;
    @FindBy(xpath = "//ul[@class='nav nav-left']/li/a/span[text()='Liên hệ']")
    public WebElement contactHome;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement inputName;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement inputEmail;
    @FindBy(xpath = "//input[@type='tel']")
    public WebElement inputPhone;
    @FindBy(xpath = "//input[@id='comment']")
    public WebElement inputMessage;
    @FindBy(xpath = "//button[text()='Gửi liên hệ']")
    public WebElement btnGui;
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement alertSuccess;
    @FindBy(xpath = "//div[@class='heading-cart']/a")
    public WebElement cartHome;


    public String pathLogo(){
        return "//a[@class='logo-wrapper ']";
    }
    public String pathMenuProduct(){
        return "//ul[@class='nav nav-left']/li/a/span[text()='Sản phẩm']";
    }
    public String pathMenuIntroduce(){
        return "//ul[@class='nav nav-left']/li/a/span[text()='Giới thiệu']";
    }
    public String pathMenuNews(){
        return "//ul[@class='nav nav-left']/li/a/span[text()='Tin tức']";
    }
    public String pathMenuContact(){
        return "//ul[@class='nav nav-left']/li/a/span[text()='Liên hệ']";
    }
    public String pathMenuCart(){
        return "//div[@class='heading-cart']/a";
    }
}
