package learningSeleniumBasicsReview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
       public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\spano\\Desktop\\SeleniumBatch10\\Drivers\\chromedriver.exe");
        //1. Open the Browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");




    }
}
