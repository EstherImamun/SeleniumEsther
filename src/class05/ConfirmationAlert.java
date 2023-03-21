package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to SyntaxProjects.com
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        // click on the button for simple prompt alert
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        // use switchTo
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        // hey click on the prompt alert button
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        // switch the focus to alert
         alert.sendKeys("abracadabra");
         // accept it
        alert.accept();
    }
}
