package TESTWEB.tests;

import TESTWEB.core.BaseTest;
import TESTWEB.page.AddProductPage;
import TESTWEB.page.CategoriesPage;
import org.testng.annotations.Test;

public class AddProductTest extends BaseTest {
    @Test
    public void Test1(){
        AddProductPage addProductPage = new AddProductPage(getDriver());
        addProductPage.AddProductToCart();
    }
    @Test
    public void Test2(){
        AddProductPage addProductPage = new AddProductPage(getDriver());
        addProductPage.AddManyProductToCart();
    }
}
