package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03_firstTest {
    public static void main(String[] args) {
   /*
        1- Bir driver oluşturun
        2- Driver'ı maximize yapıp bekleme süresini ayarlayın
        3- driver'da https://www.testotomasyonu.com adresine gidiniz
        4-Sayfanın başlığında "Test" kelimesinin yer aldığını doğrulayın
        5-Sayfanın başlığını yazdırın
        6-Sayfayı kapatın
    */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.testotomasyonu.com");
        String expectedWord = "Test";
        String actualTitle = driver.getTitle();

        assert actualTitle.contains(expectedWord);
       //if (actualTitle.contains(expectedWord)) {
       //    System.out.println("Title Test Passed");
       //} else {
       //    System.out.println("Title Test Failed. Please Check Word");
       //}
        System.out.println(driver.getTitle());

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.testotomasyonu.com/";
        System.out.println(driver.getCurrentUrl());

        assert actualUrl.contains(expectedUrl);
       // if (actualUrl.equals(expectedUrl)) {
       //     System.out.println("Url Test Passed");
       // } else {
       //     System.out.println("Url Test Failed. Please Check Url");
       // }



        driver.quit();


    }

}