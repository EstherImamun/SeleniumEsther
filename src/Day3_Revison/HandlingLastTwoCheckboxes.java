package Day3_Revison;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingLastTwoCheckboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       // driver.findElement(By.xpath("//input[@id='monday']")).click();
        List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
        for (int i = 5; i < days.size(); i++) {
            days.get(i).click();
        }

    }
}
