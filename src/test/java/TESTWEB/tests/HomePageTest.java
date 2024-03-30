package TESTWEB.tests;

import TESTWEB.core.BaseTest;
import TESTWEB.page.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void testClickLogo(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickLogo();
    }

    @Test
    public void testCLickMennuBar(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickMenu();
    }
}
