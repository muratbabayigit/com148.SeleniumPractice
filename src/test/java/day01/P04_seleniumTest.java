package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class P04_seleniumTest {
    /*
      1-Driver oluşturalim
      2-Java class'imiza chnomedriver ı tanitalim
      3-Driver'in tum ekranı kaplamasini saglayalim
      4-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklesini
        söyleyelim. Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
      5-"https://www.google.com" adresine gidelim
      6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
      7-Title'ın ve url inin Google kelimesinin içerip icermedigini kontrol edelim
      8-Ardindan "https://wisequarter.com/" adresine gidip
      9-Bu adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
      10-Bir onceki sayfamiza geri donelim
      11-Sayfayı yenileyelim
      12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
      */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.google.com");
        String actualTitle=driver.getTitle();
        String actualUrl=driver.getCurrentUrl();

        if (actualTitle.contains("Google")){
            System.out.println("Google Title test passed!");
        }else{
            System.out.println("Google Title test failed!");
        }

        if (actualUrl.contains("Google")){
            System.out.println("Google Url test passed!");
        }else{
            System.out.println("Google Url test failed!");
            System.out.println(driver.getCurrentUrl());
        }

        driver.navigate().to("https://wisequarter.com/");
        String actualTitle2=driver.getTitle();
        String actualUrl2=driver.getCurrentUrl();

        if (actualTitle2.contains("Quarter")){
            System.out.println("Wise Quarter Title test passed!");
        }else{
            System.out.println("Wise Quarter Title test failed!");
        }

        if (actualUrl2.contains("Quarter")){
            System.out.println("Wise Quarter Url test passed!");
        }else{
            System.out.println("Wise Quarter Url test failed!");
            System.out.println(driver.getCurrentUrl());
        }
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();






    }
}
