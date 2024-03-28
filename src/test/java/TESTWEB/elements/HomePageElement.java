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
    @FindBy(how = How.XPATH, using = "//a[text()='Đăng nhập']" )
   // @FindBy(xpath = "//a[text()='Đăng nhập']")
    public WebElement loginHome;

    public String pathLogin(){
        return "//a[text()='Đăng nhập']";
    }

}
