package tuanTT.testASP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupPage {
    WebDriver driver;
//    @BeforeTest
//    public void beforTest(){
//        EdgeOptions options = new EdgeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new EdgeDriver(options);
//        driver.get("http://localhost:3000/signup");
//        driver.manage().window().maximize();
//    }

    // dang ki ok
    @Test
    public void test1() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost:3000/signup");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//input"));
        email.sendKeys("pvtuann01112@gmail.com");
        driver.findElement(By.xpath("//div[@class='form']/button")).click();
        driver.findElement(By.xpath("//div[@class='form']/input[@name='password']")).sendKeys("1253456");
        driver.findElement(By.xpath("//div[@class='body flex column a-center j-center']/button")).click();
        Thread.sleep(5000);
        WebElement check = driver.findElement(By.xpath("//h1[text()='Trending Now']"));
        String test = check.getText();
        Assert.assertEquals("Trending Now",test);
        driver.close();
    }

    // that bai
    @Test
    public void test2() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost:3000/signup");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//input"));
        email.sendKeys("pvtuann00811@gmail.com");
        driver.findElement(By.xpath("//div[@class='form']/button")).click();
        driver.findElement(By.xpath("//div[@class='form']/input[@name='password']")).sendKeys("");
        driver.findElement(By.xpath("//div[@class='body flex column a-center j-center']/button")).click();
        Thread.sleep(5000);
        WebElement check = driver.findElement(By.xpath("//h1[text()='Trending Now']"));
        String test = check.getText();
        Assert.assertEquals("Trending Now",test);
        driver.close();
    }

    // that bai
    @Test
    public void test3() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost:3000/signup");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//input"));
        email.sendKeys("");
        driver.findElement(By.xpath("//div[@class='form']/button")).click();
        driver.findElement(By.xpath("//div[@class='form']/input[@name='password']")).sendKeys("etyrtyhrtrt");
        driver.findElement(By.xpath("//div[@class='body flex column a-center j-center']/button")).click();
        Thread.sleep(5000);
        WebElement check = driver.findElement(By.xpath("//h1[text()='Trending Now']"));
        String test = check.getText();
        Assert.assertEquals("Trending Now",test);
        driver.close();
    }
    //that bai
    @Test
    public void test4() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost:3000/signup");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//input"));
        email.sendKeys("");
        driver.findElement(By.xpath("//div[@class='form']/button")).click();
        driver.findElement(By.xpath("//div[@class='form']/input[@name='password']")).sendKeys("");
        driver.findElement(By.xpath("//div[@class='body flex column a-center j-center']/button")).click();
        Thread.sleep(5000);
        WebElement check = driver.findElement(By.xpath("//h1[text()='Trending Now']"));
        String test = check.getText();
        Assert.assertEquals("Trending Now",test);
        driver.close();
    }

    // thaats bai
    @Test
    public void test5() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost:3000/signup");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//input"));
        email.sendKeys("tuan123");
        driver.findElement(By.xpath("//div[@class='form']/button")).click();
        driver.findElement(By.xpath("//div[@class='form']/input[@name='password']")).sendKeys("dgfdg");
        driver.findElement(By.xpath("//div[@class='body flex column a-center j-center']/button")).click();
        Thread.sleep(5000);
        WebElement check = driver.findElement(By.xpath("//h1[text()='Trending Now']"));
        String test = check.getText();
        Assert.assertEquals("Trending Now",test);
        driver.close();
    }
}
