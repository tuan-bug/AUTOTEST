package tuanTT.testVanHanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class testFixCart {
    WebDriver driver;
    @Test
    public void test1() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
        driver.findElement(By.xpath("//a[text()=' Giỏ Hàng']")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='-'])[1]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-trash']")).click();
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
        driver.findElement(By.xpath("(//button[@class='btn btn-info'])[4]")).click();
        driver.findElement(By.xpath("//a[text()=' Giỏ Hàng']")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='-'])[1]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-trash']")).click();
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
        driver.findElement(By.xpath("(//button[@class='btn btn-info'])[5]")).click();
        driver.findElement(By.xpath("//a[text()=' Giỏ Hàng']")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='-'])[1]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-trash']")).click();
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void test4() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
        driver.findElement(By.xpath("//a[text()=' Giỏ Hàng']")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='+'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='-'])[1]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-trash']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
