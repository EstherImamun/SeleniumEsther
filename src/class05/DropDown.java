package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to SyntaxProjects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        //locate the webElement
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));
        // use select class because this drop down has a select tag
        Select sel=new Select(dropDown);
        // using select class, we have different methods to select the desired option
        // select by index
        sel.selectByIndex(2);
        Thread.sleep(2000);
        // select by value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        // select by visible text
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);


    }
}
