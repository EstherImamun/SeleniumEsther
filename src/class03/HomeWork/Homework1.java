package class03.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {

       /*
       HW
       use xpath to complete this
       goto http://practice.syntaxtechs.net/basic-first-form-demo.php
        enter the message in the text box
        click on show message
        Enter value of a
        Enter value of B
        click on the button get total
        also please print the value of the attribute type of the button GET TOTAL
        */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
        // go to page
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        //        enter the message in the text box
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Hi! I'm Esther");
        // show message
        driver.findElement(By.xpath("//button[@type='button']")).click();
        // enter value of a
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("20");
        //enter value of b
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("50");
        // click on the button to get total
        WebElement Total = driver.findElement(By.xpath("//button[text()='Get Total']"));
        Total.click();
        // also please print the value of the attribute type of the button GET TOTAL
        String Attribute = Total.getAttribute("type");
        System.out.println(Attribute);

    }
}
