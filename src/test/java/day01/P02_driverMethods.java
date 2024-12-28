package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class P02_driverMethods {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.wisequarter.com/");
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //bir üstteki komut Thread.sleep gibi bekleme komutudur.
        // Fakat bu bekleme şu şekildedir.
        // verilen süre kadar bekler o sürede işlem gerçekleşmezse testi durdurur
        // aynı zamanda işlem 10 saniyeden daha kısa sürerse 10 saniye beklemez.
        // kaçıncı saniyede işlem gerçekleşmişse o saniyede bir sonraki satıra geçer

        Thread.sleep(3000); //Thread.sleep her oşulda verilen süre kadar bekler
        driver.quit();

    }
}
