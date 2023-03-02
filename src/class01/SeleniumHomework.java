package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class SeleniumHomework {
    public static void main(String[] args) throws InterruptedException {

        /**
         * 1. launch the browser
         * 2. navigate to amazon web-site
         * 3. print out the title and the url in the console
         * 4. close the browser
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.amazon.com/");
        String title = driver.getTitle();
        System.out.println("This is the Title of the page "+" "+title);
        String URL = driver.getCurrentUrl();
        System.out.println("This is the url "+URL);
       System.out.println(driver.getTitle());
        //closing the page...
        Thread.sleep(2000);
        driver.close();


    }
}
