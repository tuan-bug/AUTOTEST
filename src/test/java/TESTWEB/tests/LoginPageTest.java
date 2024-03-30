package TESTWEB.tests;

import TESTWEB.core.BaseTest;
import TESTWEB.page.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void Test1(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.TestLogin();
    }

    @Test
    public void Test2(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.TestLoginWithPasswordError();
    }
    @Test
    public void Test3(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.TestLoginWithPasswordNull();
    }
    @Test
    public void Test4(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.TestLoginWithAllNull();
    }
    @Test
    public void Test5(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.TestLoginWithEmailError();
    }
}
