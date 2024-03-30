package TESTWEB.elements;

import TESTWEB.core.BasePage;
import TESTWEB.core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListCategoriesElement extends BasePage {
    public ListCategoriesElement(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[@class='logo-wrapper ']")
    public WebElement pathLogoClick;
    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[1]")
    public WebElement pathBagAndBelt;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Túi, ví, thắt lưng']")
    public WebElement pathCheckBagAndBelt;

    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[2]")
    public WebElement pathFunctionalFoods;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Thực phẩm chức năng']")
    public WebElement pathCheckFunctionalFoods;
    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[3]")
    public WebElement pathGlasses;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Kính mắt, gọng cận']")
    public WebElement pathCheckGlasses;

    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[4]")
    public WebElement pathCosmetics;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Mỹ phẩm trang điểm']")
    public WebElement pathCheckCosmetics;

    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[5]")
    public WebElement pathProducts;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Hàng tiêu dùng']")
    public WebElement pathCheckProducts;

    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[6]")
    public WebElement pathCleansing;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Tẩy trang, chống nắng']")
    public WebElement pathCheckCleansing;

    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[7]")
    public WebElement pathHair;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Chăm sóc tóc']")
    public WebElement pathCheckHair;

    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[8]")
    public WebElement pathBody;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Chăm sóc cơ thể']")
    public WebElement pathCheckBody;

    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[9]")
    public WebElement pathPerfume;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Nước Hoa']")
    public WebElement pathCheckPerfume;
    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[10]")
    public WebElement pathLotion;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Mỹ phẩm dưỡng da']")
    public WebElement pathCheckLotion;
    @FindBy(xpath = "//section[@id=\"list-collections\"]//a[11]")
    public WebElement pathClock;
    @FindBy(xpath = "//ul[@class='breadcrumb']//span[text()=' Đồng hồ, trang sức']")
    public WebElement pathCheckClock;
}
