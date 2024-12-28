package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06_SelenimTest {
    /*
      1- http://babayigit.net/test/ adresine gidilir ve pencere maximize edilir
      2- INFO FORM butonuna tıklanır
      3- Form verileri girilir
      4- Save butonuna tıklanır
      5- Sonuç yazdırılır
       */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://babayigit.net/test/");
        driver.findElement(By.xpath("//img[@src='img/info.png']")).click();
        driver.findElement(By.id("firstName")).sendKeys("Murat");
        driver.findElement(By.id("lastName")).sendKeys("Yiğit");
        driver.findElement(By.id("email")).sendKeys("muratyi@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("905992112345");
        driver.findElement(By.id("age")).sendKeys("44");
        driver.findElement(By.id("occupation")).sendKeys("Insrtuctor");
        driver.findElement(By.id("male")).click();
        driver.findElement(By.id("city")).sendKeys("İstanbul");
        driver.findElement(By.id("country")).sendKeys("Türkiye");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String expectedMessage = "Your information has been successfully saved:";
        String actualMessage = driver.findElement(By.id("resutMessage")).getText();
        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Kayıt Başarıyla Oluşturuldu");
        }else{
            System.out.println(expectedMessage+"\n Kayıt Oluşturulamadı");
        }

        driver.quit();


    }
}