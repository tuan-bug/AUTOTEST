package tuanTT.testVanHanh;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class QLDM {
    WebDriver driver;

    @BeforeTest
    public void beforTest(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);

//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//
//        driver = new ChromeDriver(options);
    }

    @Test
    public void QLDM () throws InterruptedException {
        driver.navigate().to("https://www.nettruyenup.vn");
        Dimension targetSize = new Dimension(1200, 1100);
        driver.manage().window().setSize(targetSize);
        driver.findElement(By.xpath("//a[text()=\" Tôi Là Tài Xế Xe Công Nghệ Có Chút Tiền Thì Đã Sao? \"]")).click();

        // lấy số chap moi nhất để lặp
        int chapterInt = 0;
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\" Đọc mới nhất\"]")).click();
        WebElement endChap = driver.findElement(By.xpath("//h1[@class='txt-primary']//span"));
        Thread.sleep(3000);
        String endChapter = endChap.getText();
        // Tách lấy số từ chuỗi
        String chapterNumber = endChapter.replaceAll("[^0-9]", "");

        // Chuyển đổi số từ chuỗi sang kiểu int (nếu cần)
        try {
            chapterInt = Integer.parseInt(chapterNumber);
            System.out.println("Chapter Number: " + chapterInt);
        } catch (NumberFormatException e) {
            System.out.println("Không thể chuyển đổi thành số: " + e.getMessage());
        }

//        driver.findElement(By.xpath("//h1[@class=\"txt-primary\"]//a")).click();
//
//        // đọc từ chap đầu
//        driver.findElement(By.xpath("//a[text()=\" Đọc từ đầu\"]")).click();
//
//        int i = 0;

            WebElement spanElement = driver.findElement(By.xpath("//h1[@class='txt-primary']//span"));
            String spanText = spanElement.getText();
            System.out.println("Text of the span element: " + spanText);

            java.util.List<WebElement> imgElements = driver.findElements(By.xpath("//div[@class='page-chapter']/img"));
            System.out.println("DANH SACH ẢNH "+imgElements);
            for (int index = 0; index < imgElements.size(); index++) {
                try {
                    // Lấy giá trị của thuộc tính src
                    String srcValue = imgElements.get(index).getAttribute("src");

                    // In giá trị src
                    System.out.println("Src of image " + (index + 1) + ": " + srcValue);
                    // Chỉ định đường dẫn đầy đủ của thư mục và tên tệp
                    String folderPath = "D:\\image\\Tôi là tài xế xe công nghệ\\" + spanText;
                    // Tạo đối tượng File cho thư mục
                    File folder = new File(folderPath);

                    // Kiểm tra xem thư mục đã tồn tại hay chưa
                    if (!folder.exists()) {
                        // Nếu thư mục chưa tồn tại, tạo nó
                        if (folder.mkdirs()) {
                            System.out.println("Thư mục đã được tạo: " + folderPath);
                        } else {
                            System.out.println("Không thể tạo thư mục: " + folderPath);
                        }
                    }
                    // Tạo đường dẫn đầy đủ trong thư mục mới
                    String fullPath = folder.getAbsolutePath() + File.separator + "file.png";

                    // In ra đường dẫn
                    System.out.println("Full Path: " + fullPath);

                    String fileName = "image" + (index + 1) + ".png";
                    String destinationPath = folderPath + File.separator + fileName;

                    // Tải ảnh về và lưu vào một tệp
                    saveImageToFile(srcValue, destinationPath);
                    driver.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            Thread.sleep(3000);
            //driver.findElement(By.xpath("//*[@id=\"chapterNavBottom\"]/a[2]")).click();


    }

    public void GET_IMG(String src) throws IOException {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.navigate().to(src);
        driver.manage().window().maximize();
        String folderPath = "D:\\image\\Tôi là tài xế xe công nghệ";
        String fileName = "image" + ".png";
        String destinationPath = folderPath + File.separator + fileName;

        // Tải ảnh về và lưu vào một tệp
        saveImageToFile(src, destinationPath);
    }

    private static void saveImageToFile(String imageUrl, String destinationPath) throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(imageUrl);
            byte[] imageBytes = httpClient.execute(httpGet, response -> EntityUtils.toByteArray(response.getEntity()));

            try (FileOutputStream outputStream = new FileOutputStream(destinationPath)) {
                outputStream.write(imageBytes);
            }
        }
    }
}
