package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // got to facebook.com
        driver.get("https://www.facebook.com/");
        WebElement cookieButton=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        if(cookieButton.isEnabled()){
            driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        }
        //click on the button create account using css selector
        WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button']"));
        //click on the button
        createNewBtn.click();
        // put a sleep statement so that the browser can open up the window which contains the element
        Thread.sleep(2000);
        //fill in the first name
        WebElement firstName = createNewBtn.findElement(By.xpath("//input[contains(@name,'firstna')]"));
        firstName.sendKeys("Esther");

    }
}
