package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to SyntaxProjects.com
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        // sleep
        Thread.sleep(2000);
        // go to Input forms first
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        // go to Radio Buttons Demo
        driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).click();
        //sleep
        Thread.sleep(1000);

        //click on the radio button Male
       // WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Female']"));

        // find all the age group radio buttons
        // the Xpath here is common to all the webElements that have age group
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        // iterate over the list to see your desired one
        for(WebElement radioBtn:radioBtns){
            String age = radioBtn.getAttribute("value");
            if(age.equalsIgnoreCase("0 - 5")){
                radioBtn.click();
            }
        }




    }
}
