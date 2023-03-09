package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
        //go to amazon.com
        driver.get("https://www.amazon.com/");
        //get all the links
        //we know that all the links are in tag <a> which is also called anchor tag
        //let's use the locator By tagName for this purpose

       List<WebElement> tags=driver.findElements(By.tagName("a"));
       // in order to print
        // we need iterator
        for(WebElement tag:tags){
           // System.out.println(tag);
            String link = tag.getAttribute("href");//getting the value of the attribute "href"
            System.out.println(link);
        }

    }
}
