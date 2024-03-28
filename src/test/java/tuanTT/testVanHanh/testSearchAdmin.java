package tuanTT.testVanHanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class testSearchAdmin {
    WebDriver driver;
    @Test
    public void test1() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/admin/transaction");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()=' Sản phẩm']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("áo thun");
        driver.findElement(By.xpath("//button[@class='btn text-right']")).click();
        driver.findElement(By.xpath("//strong[text()='Áo Thun Trơn Nam Ngắn tay Có Cổ Áo Polo ']")).click();
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void test2() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/admin/transaction");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()=' Sản phẩm']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("");
        driver.findElement(By.xpath("//button[@class='btn text-right']")).click();
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//div[@class='alert bg-danger']"));
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void test3() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/admin/transaction");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()=' Sản phẩm']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("fđhfgf");
        driver.findElement(By.xpath("//button[@class='btn text-right']")).click();
        driver.findElement(By.xpath("//div[@class='alert bg-danger']"));
        Thread.sleep(5000);
        driver.close();
    }
}
