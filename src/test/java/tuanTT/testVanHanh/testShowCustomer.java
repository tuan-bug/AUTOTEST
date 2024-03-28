package tuanTT.testVanHanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class testShowCustomer {
    WebDriver driver;
    @Test
    public void test1() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/dang-nhap");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pvtuan2707@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Đăng nhập']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pvtuan2707@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[3]")).click();
        driver.findElement(By.xpath("//a[text()='Tài khoản']")).click();
        driver.findElement(By.xpath("//h3[text()='Thông tin tài khoản']"));
        Thread.sleep(5000);
        driver.close();
    }
}
