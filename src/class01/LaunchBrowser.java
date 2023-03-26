package class01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webdriver is located
        //for Mac users please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
       // ChromeOptions options=new ChromeOptions();
       // options.addArguments("--remote-allow-origins=*");

        //create an instance of webDriver
        WebDriver driver = new ChromeDriver();

        //open the Website facebook.com
        driver.get("https://www.facebook.com/");

        // get the current url that is there in the browser
        String URL = driver.getCurrentUrl();
        // print out the url
        System.out.println(URL);

        // get the title of the webpage
        String title = driver.getTitle();
        System.out.println("the title of page is "+title);
       // slow down for 3 seconds
        Thread.sleep(3000);
        WebElement cookieButton=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        if(cookieButton.isEnabled()){
            driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        }
        driver.manage().window().maximize();
        // close the browser
        //driver.quit();


    }
}
