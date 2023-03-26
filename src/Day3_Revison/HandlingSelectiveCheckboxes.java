package Day3_Revison;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingSelectiveCheckboxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='monday']"));
        List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
        // using an Enhanced for loop
        /*for(WebElement day:days){
            if(day.getAttribute("id").equalsIgnoreCase("tuesday")||day.getAttribute("id").
                    equalsIgnoreCase("thursday")||day.getAttribute("id").equalsIgnoreCase("saturday"));
            day.click();
        }*/
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // using a normal for loop
        for (int i = 0; i <=days.size(); i++) {
            if (days.get(i).getAttribute("id").equalsIgnoreCase("saturday")|| days.get(i).
                    getAttribute("id").equalsIgnoreCase("sunday")) {
                days.get(i).click();
            }
        }
        }
    }

