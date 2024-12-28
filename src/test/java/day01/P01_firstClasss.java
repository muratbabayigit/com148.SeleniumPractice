package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_firstClasss {
   public static void main(String[] args) throws InterruptedException {

     WebDriver driver=new ChromeDriver();
     driver.get("https://www.wisequarter.com/");
     Thread.sleep(5000); //bir sonraki işlemi yapmak için 2000 ms yani 2 sn bekler
     driver.quit();
   }
}
