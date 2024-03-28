package tuanTT.testVanHanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class testOrderCustomer {
    WebDriver driver;
    @Test
    public void test1() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("https://atkadmin.vnptthainguyen.vn/category");
        driver.manage().window().maximize();
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
        driver.findElement(By.xpath("//a[text()=' Khách hàng']")).click();
        driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-list-alt'])[5]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-list-alt']")).click();
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
        driver.findElement(By.xpath("//a[text()=' Khách hàng']")).click();
        driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-list-alt'])[5]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-list-alt']")).click();
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void test4() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/admin/transaction");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()=' Khách hàng']")).click();
        driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-list-alt'])[5]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-list-alt']")).click();
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void test5() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/admin/transaction");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()=' Khách hàng']")).click();
        driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-list-alt'])[5]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-list-alt']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
