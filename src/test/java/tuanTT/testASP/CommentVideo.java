package tuanTT.testASP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommentVideo {
    WebDriver driver;
    @BeforeTest
    public void beforTest() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost:3000/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tuan@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[text()='Login to your account']")).click();
        Thread.sleep(5000);
        WebElement check = driver.findElement(By.xpath("//h1[text()='Trending Now']"));
        String test = check.getText();
        Assert.assertEquals("Trending Now",test);

    }
    @Test
    public void test1() throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='sc-jTQDnj kcwjUl'][6]")).click();
        driver.findElement(By.xpath("//input[@class=\"comment-input\"]")).sendKeys("Phim chẳng ra cái gì");


    }
}
