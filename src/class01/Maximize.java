package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // go to google.com
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='de']")).click();
        driver.findElement(By.xpath("//li[contains(text(),'\u202AEnglish (United Kin')][1]")).click();
       // driver.findElement(By.xpath("//div[text()='Accept all']")).click();
        // maximize
        //driver.manage().window().maximize();
        WebElement acceptBtn = driver.findElement(By.xpath("//div[text()='Accept all']"));
        if(acceptBtn.isEnabled()){
            driver.findElement(By.xpath("//div[text()='Accept all']")).click();
        }
        driver.manage().window().maximize();

    }
}
