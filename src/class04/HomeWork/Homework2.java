package class04.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
       /* Hw2:
       goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        1. u need to write down the code that can select  1 check box out of 4 mentioned,
         e.g option1 , option2 , option 3, option 4

        Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
        */

        // set Property
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to SyntaxProjects.com
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        // sleep

        Thread.sleep(2000);
        // use a locator to find the 4 webElements and store them in a list
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //iterate through the 4 webElements one at a time
        for (WebElement checkB : checkBoxes) {
            // get the value of their attributes and store them in a String variable name (attribute)
            String attribute = checkB.getAttribute("value");
            //print the value of the attributes
            System.out.println(attribute);
            //choose which checkbox you want to click by choosing the value of an attribute that is particular to the webElement.
            if (attribute.equalsIgnoreCase("Option-1")) {
                checkB.click();
            }

        }


    }
}