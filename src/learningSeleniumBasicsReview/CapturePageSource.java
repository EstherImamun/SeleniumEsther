package learningSeleniumBasicsReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePageSource {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        WebElement cookieButton=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        if(cookieButton.isEnabled()){
            driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        }
        driver.manage().window().maximize();
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }
}
