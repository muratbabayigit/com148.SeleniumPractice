package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01_driverMethods {
    /*
  /....Exercise-1:...
  +Create a chrome driver
  +Maximize window
  +Open google home page https://www.google.com
  +On the same class, navigate to amazon home page https://www.wiseqaurter.com
  and navigate back to google
  +Wait about 4 sn
  +Navigate forward to wiseqaurter
  +Refresh page
  +quit the browser
  And Last step print "All is well" on console
*/
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
        Thread.sleep(2500);
        driver.navigate().to("https://www.wisequarter.com");
        Thread.sleep(2500);
        driver.navigate().back();
        Thread.sleep(2500);
        driver.navigate().forward();
        Thread.sleep(2500);
        driver.navigate().refresh();
        Thread.sleep(2500);
        driver.quit();
        System.out.println("All is well");


    }
}
