package tuanTT.testVanHanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class testRegister {
    WebDriver driver;
    @Test
    public void test1() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/dang-ky");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='name']")).sendKeys("Phạm Tuân");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='email']")).sendKeys("tuan1013@gmail.com");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='re_password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='address']")).sendKeys("Thái Nguyên");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='phone']")).sendKeys("0974897450");
        driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
        driver.findElement(By.xpath("//h4[text()='Đăng ký thành công']"));

        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void test2() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/dang-ky");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='name']")).sendKeys("Phạm Tuân");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='email']")).sendKeys("tuan931@gmail.com");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='re_password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='address']")).sendKeys("Thái Nguyên");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='phone']")).sendKeys("0974897450");
        driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
        driver.findElement(By.xpath("//h4[text()='Đăng ký thành công']"));

        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void test3() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/dang-ky");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='name']")).sendKeys("Phạm Tuân");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='email']")).sendKeys("tuan9311@gmail.com");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='re_password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='address']")).sendKeys("");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='phone']")).sendKeys("0974897450");
        driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
        driver.findElement(By.xpath("//h4[text()='Đăng ký thành công']"));

        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void test4() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/dang-ky");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='name']")).sendKeys("Phạm Tuân");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='email']")).sendKeys("tuan@gmail.com");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='re_password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='address']")).sendKeys("");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='phone']")).sendKeys("");
        driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
        driver.findElement(By.xpath("//h4[text()='Đăng ký thành công']"));

        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void test5() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/dang-ky");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='name']")).sendKeys("Phạm Tuân");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='email']")).sendKeys("tuan5@gmail.com");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='re_password']")).sendKeys("");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='address']")).sendKeys("Thái Nguyên");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='phone']")).sendKeys("0974897450");
        driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
        driver.findElement(By.xpath("//h4[text()='Đăng ký thành công']"));

        Thread.sleep(5000);
        driver.close();
    }



    @Test
    public void test6() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/dang-ky");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='name']")).sendKeys("Phạm Tuân");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='email']")).sendKeys("tuan@gmail.com");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='password']")).sendKeys("");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='re_password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='address']")).sendKeys("Thái Nguyên");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='phone']")).sendKeys("0974897450");
        driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
        driver.findElement(By.xpath("//h4[text()='Đăng ký thành công']"));

        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void test7() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/dang-ky");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='name']")).sendKeys("Phạm Tuân");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='email']")).sendKeys("");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='re_password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='address']")).sendKeys("Thái Nguyên");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='phone']")).sendKeys("0974897450");
        driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
        driver.findElement(By.xpath("//h4[text()='Đăng ký thành công']"));

        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void test8() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.get("http://localhost/MaleFashion/dang-ky");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='name']")).sendKeys("");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='email']")).sendKeys("tuan@gmail.com");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='re_password']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='address']")).sendKeys("Thái Nguyên");
        driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='phone']")).sendKeys("0974897450");
        driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
        driver.findElement(By.xpath("//h4[text()='Đăng ký thành công']"));

        Thread.sleep(5000);
        driver.close();
    }
}
