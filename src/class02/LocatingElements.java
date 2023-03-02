package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //creating an instance of the ChromeDriver
        WebDriver driver=new ChromeDriver();
        //open up facebook.com
        driver.get("https://www.facebook.com/");
        // send in the username
       // driver.findElement(By.id("email")).sendKeys("Esther");
        // send the password
       // driver.findElement(By.name("pass")).sendKeys("1234H@");
        //to expand
        //driver.manage().window().fullscreen();
        //click on the button create new account
        WebElement cookieButton=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
            if(cookieButton.isEnabled()){
                driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
            }
        driver.findElement(By.linkText("Create new account")).click();
            Thread.sleep(3000);

        //click on forgotten password
       // driver.findElement(By.partialLinkText("password?")).click();

       // driver.quit();



    }
}
