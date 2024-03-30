package TESTWEB.elements;

import TESTWEB.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddProductElement extends BasePage {
    public AddProductElement(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[@class='logo-wrapper ']")
    public WebElement pathLogoClick;
    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[1]")
    public WebElement pathBagAndBelt;
    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[3]")
    public WebElement pathGlasses;
    @FindBy(xpath = "//section[@class='products-view products-view-grid']/div[@class='row']/div[3]//h3[@class='product-name']/a")
    public WebElement pathProductBag;
    @FindBy(xpath = "//section[@class='products-view products-view-grid']/div[@class='row']/div[3]//h3[@class='product-name']/a")
    public WebElement pathProductBag2;
    @FindBy(xpath = "//section[@class='products-view products-view-grid']/div[@class='row']/div[1]//h3[@class='product-name']/a")
    public WebElement pathProductGlasses;
    @FindBy(xpath = "//button[@title='Cho vào giỏ hàng']")
    public WebElement pathAddToCart;
    @FindBy(xpath = "//span[text()='×']")
    public WebElement pathCloseModalAddCart;
    @FindBy(xpath = "//div[@class='heading-cart']/a")
    public WebElement pathCartHome;
    @FindBy(xpath = "//div[@class='cart-thead']")
    public WebElement pathCheckCart;

    public String pathCLose(){
        return "//span[text()='×']";
    }

}
