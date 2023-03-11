package class04.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
       /*
        HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the check box    "click on this check box" is Selected
        if no  Select the check box
        check gain if the checkbox is Selected or not*/

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to SyntaxProjects.com
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        // sleep
        Thread.sleep(2000);
        // find element using a locator
        WebElement ageBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        //check if element is selected
        boolean ageBoxIsSelected = ageBox.isSelected();
        System.out.println(ageBoxIsSelected);
        // if not select the element
        if(!ageBoxIsSelected){
            ageBox.click();
        }
        // check again if element is selected or not
        ageBoxIsSelected=ageBox.isSelected();
        System.out.println("The radio button is Selected "+ageBoxIsSelected);



    }
}
