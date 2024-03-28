package tuanTT.testVanHanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSearch {
    WebDriver driver;
    @Test
    public void test1() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"seach_info\"]")).sendKeys("áo thun");
        driver.findElement(By.xpath("//button[@class=\"btn-search_info\"]")).click();
        driver.findElement(By.xpath("//a[text()='Áo thun nam Cotton Compact phiên bản Premium']")).click();
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void test2() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"seach_info\"]")).sendKeys("656565");
        driver.findElement(By.xpath("//button[@class=\"btn-search_info\"]")).click();
        driver.findElement(By.xpath("//h3[text()='Kết quả tìm kiếm ( 0 sản phẩm)']")).click();
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void test3() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"seach_info\"]")).sendKeys("");
        driver.findElement(By.xpath("//button[@class=\"btn-search_info\"]")).click();
        driver.findElement(By.xpath("//a[text()='Áo thun nam Cotton Compact phiên bản Premium']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
