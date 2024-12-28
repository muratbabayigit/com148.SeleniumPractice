package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class P05_SeleniumTest {
     /*
    https://google.com/ adresine gidip adres çubuğuna
    1-Vizontele aratıp sonuç sayısını yazdırın
    2-12 Angry men aratıp sonuç sayısını yazdırın
    3-Saving Private Ryan aratıp sonuç sayısını yazdırın
    4-3 Idiots aratıp sonuç sayısını yazdırın

     */
     public static void main(String[] args) {
         String filmadi="";
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // driver.get("https://www.google.com");
       // filmadi="Vizontele";
       // driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(filmadi+ Keys.ENTER);
       //// Keys.ENTER kullanılmazsa aşağıdaki kod ile arama butonuna tıklanır
       /// driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]").click();
       // driver.findElement(By.id("hdtb-tls")).click();
       // String result=driver.findElement(By.id("result-stats")).getText();
       // System.out.println(filmadi+" araması sonucu: "+result);
       // System.out.println("--------------------------------------------------");

       // filmadi="12 Angry Men";
       // driver.get("https://www.google.com");
       // driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(filmadi+ Keys.ENTER);
       // driver.findElement(By.id("hdtb-tls")).click();
       // result=driver.findElement(By.id("result-stats")).getText();
       // System.out.println(filmadi+" araması sonucu: "+result);
       // System.out.println("--------------------------------------------------");
       // filmadi="Saving Private Ryan";
       // driver.get("https://www.google.com");
       // driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(filmadi+ Keys.ENTER);
       // driver.findElement(By.id("hdtb-tls")).click();
       // result=driver.findElement(By.id("result-stats")).getText();
       // System.out.println(filmadi+" araması sonucu: "+result);
       // System.out.println("--------------------------------------------------");

       // filmadi="3 Idiots";
       // driver.get("https://www.google.com");
       // driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(filmadi+ Keys.ENTER);
       // driver.findElement(By.id("hdtb-tls")).click();
       // result=driver.findElement(By.id("result-stats")).getText();
       // System.out.println(filmadi+" araması sonucu: "+result);

         List<String> filmler=new ArrayList<>();
         filmler.add("Vizontele");
         filmler.add("12 Angry Men");
         filmler.add("Saving Private Ryan");
         filmler.add("3 Idiots");
         filmler.add("Neşeli Günler");
         filmler.add("Güldür Güldür");
         filmler.add("Arog");

         for (String film : filmler) {
             filmadi=film+Keys.ENTER;
             driver.get("https://www.google.com");
             driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(filmadi+ Keys.ENTER);
             driver.findElement(By.id("hdtb-tls")).click();
             String result=driver.findElement(By.id("result-stats")).getText();
             System.out.println(filmadi+" araması sonucu: "+result);
             System.out.println("------------------------------------------------");

         }
         driver.quit();


 }
}
