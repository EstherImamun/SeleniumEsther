package learningSeleniumBasicsReview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       // driver.navigate().to("https://google.com/");
        driver.get("https://google.com/");
       // driver.manage().window().maximize();
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);
       // Thread.sleep(2000);
    }
}
