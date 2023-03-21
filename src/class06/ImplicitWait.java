package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // go to facebook.com
        driver.get("https://www.facebook.com/");
        // click on accept cookies
        WebElement cookieButton=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        if(cookieButton.isEnabled()){
            driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        }
        // click on the create new account
        driver.findElement(By.linkText("Create new account")).click();
        // send your firstname
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");
    }
}
