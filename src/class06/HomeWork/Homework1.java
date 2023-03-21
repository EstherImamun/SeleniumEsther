package class06.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {

        /*
        HW
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.Verify that the text "Hello World!" is now displayed on the page

         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // implement the implicit Wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[text()='Start']")).click();
        driver.findElement(By.xpath("//div[@id='finish']")).click();

        WebElement helloW = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        String gottenText = helloW.getText();
        System.out.println(helloW.isDisplayed());

        if(helloW.isDisplayed()){
            System.out.println(gottenText+"The text is displayed ");
        }else{
            System.out.println(gottenText+ "The Text is not displayed ");
        }









    }
}
