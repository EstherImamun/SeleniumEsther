package learningSeleniumBasicsReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='de']")).click();
        driver.findElement(By.xpath("//li[contains(text(),'\u202AEnglish (United Kin')][1]")).click();
        driver.findElement(By.xpath("//div[text()='Accept all']")).click();
        driver.manage().window().fullscreen();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        WebElement cookieButton=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        if(cookieButton.isEnabled()){
            driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        }
        driver.manage().window().fullscreen();
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is : "+pageTitle);
        

    }
}
