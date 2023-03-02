package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // maximize
        driver.manage().window().maximize();
        // got to amazon.com
        driver.get("https://www.amazon.com/");
        //print all the links in the amazon.com
        driver.findElements(By.tagName("a"));
        // to be continued in the next class
    }
}
