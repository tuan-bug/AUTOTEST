package TESTWEB.tests;

import TESTWEB.core.BaseTest;
import TESTWEB.page.CategoriesPage;
import TESTWEB.page.HomePage;
import org.testng.annotations.Test;

public class CategoriesPageTest extends BaseTest {
    @Test
    public void Test1(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryBag();
    }
    @Test
    public void Test2(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryFunctionalFoods();
    }
    @Test
    public void Test3(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryGlasses();
    }
    @Test
    public void Test4(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryCosmetics();
    }
    @Test
    public void Test5(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryProducts();
    }
    @Test
    public void Test6(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryCleans();
    }
    @Test
    public void Test7(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryHair();
    }
    @Test
    public void Test8(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryBody();
    }
    @Test
    public void Test9(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryPerfume();
    }
    @Test
    public void Test10(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryLotion();
    }
    @Test
    public void Test11(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryClock();
    }
}
