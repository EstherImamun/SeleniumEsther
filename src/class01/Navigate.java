package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //initiate the instance of Webdriver
        WebDriver driver=new ChromeDriver();
        //open google.com
        driver.get("https://www.google.com/");
        //slow down
       Thread.sleep(2000);
        // now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        //slow down
        Thread.sleep(2000);
        WebElement cookieButton=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        if(cookieButton.isEnabled()){
            driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        }
        // go back
        driver.navigate().back();
        //slow down
        Thread.sleep(2000);
        //go to facebook
        driver.navigate().forward();
        // slow down
        Thread.sleep(2000);
        // refresh the page
        driver.navigate().refresh();
        driver.manage().window().maximize();
        // close the browser
       // driver.close();
    }
}
