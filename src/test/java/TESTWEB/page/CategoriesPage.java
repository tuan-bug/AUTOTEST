package TESTWEB.page;

import TESTWEB.core.BasePage;
import TESTWEB.elements.ListCategoriesElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoriesPage extends BasePage {
    ListCategoriesElement categoriesElement = new ListCategoriesElement(driver);
    public CategoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickCategoryBag(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathBagAndBelt.click();
        String checkBag = categoriesElement.pathCheckBagAndBelt.getText().trim();
        if(checkBag != null && checkBag.equals("Túi, ví, thắt lưng") && checkBag.contains("Túi, ví, thắt lưng")){
            System.out.println("Test passed. " + checkBag.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }
    public void clickCategoryFunctionalFoods(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathFunctionalFoods.click();
        String checkBag = categoriesElement.pathCheckFunctionalFoods.getText().trim();
        if(checkBag != null && checkBag.equals("Thực phẩm chức năng") && checkBag.contains("Thực phẩm chức năng")){
            System.out.println("Test passed. " + checkBag.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }
    public void clickCategoryGlasses(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathGlasses.click();
        String checkGlasses = categoriesElement.pathCheckGlasses.getText().trim();
        if(checkGlasses != null && checkGlasses.equals("Kính mắt, gọng kính")){
            System.out.println("Test passed. " + checkGlasses.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }
    public void clickCategoryCosmetics(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathCosmetics.click();
        String checkGlasses = categoriesElement.pathCheckCosmetics.getText().trim();
        if(checkGlasses != null && checkGlasses.equals("Mỹ phẩm trang điểm")){
            System.out.println("Test passed. " + checkGlasses.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void clickCategoryProducts(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathProducts.click();
        String checkProduct = categoriesElement.pathCheckProducts.getText().trim();
        if(checkProduct != null && checkProduct.equals("Hàng tiêu dùng")){
            System.out.println("Test passed. " + checkProduct.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void clickCategoryCleans(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathCleansing.click();
        String checkCleans = categoriesElement.pathCheckCleansing.getText().trim();
        if(checkCleans != null && checkCleans.equals("Tẩy trang, chống nắng")){
            System.out.println("Test passed. " + checkCleans.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void clickCategoryHair(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathHair.click();
        String checkHair = categoriesElement.pathCheckHair.getText().trim();
        if(checkHair != null && checkHair.equals("Chăm sóc tóc")){
            System.out.println("Test passed. " + checkHair.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void clickCategoryBody(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathBody.click();
        String checkBody = categoriesElement.pathCheckBody.getText().trim();
        if(checkBody != null && checkBody.equals("Chăm sóc tóc")){
            System.out.println("Test passed. " + checkBody.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void clickCategoryPerfume(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathPerfume.click();
        String checkPerfume = categoriesElement.pathCheckPerfume.getText().trim();
        if(checkPerfume != null && checkPerfume.equals("Nước Hoa")){
            System.out.println("Test passed. " + checkPerfume.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }

    public void clickCategoryLotion(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathLotion.click();
        String checkLotion = categoriesElement.pathCheckLotion.getText().trim();
        if(checkLotion != null && checkLotion.equals("Mỹ phẩm dưỡng da")){
            System.out.println("Test passed. " + checkLotion.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }
    public void clickCategoryClock(){
        categoriesElement.pathLogoClick.click();
        categoriesElement.pathClock.click();
        String checkClock = categoriesElement.pathCheckClock.getText().trim();
        if(checkClock != null && checkClock.equals("Mỹ phẩm dưỡng da")){
            System.out.println("Test passed. " + checkClock.contains("Vui lòng nhập Mật khẩu"));
        } else {
            System.out.println("Test failed. ");
        }
    }
}
