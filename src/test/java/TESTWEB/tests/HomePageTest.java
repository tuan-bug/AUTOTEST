package TESTWEB.tests;

import TESTWEB.core.BaseTest;
import TESTWEB.page.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void test1(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickLogin();

    }
}
