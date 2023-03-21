package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDopDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to SyntaxProjects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        // get the drop-down
        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));
        // use the select class
        Select sel=new Select(DD);
        //select by value
        sel.selectByValue("New Jersey");
        // select by visible text
        sel.selectByVisibleText("Ohio");
        // to slow it down
        Thread.sleep(2000);
        // when it comes to MultiSelect Drop Down, we can also deselect
        sel.deselectByValue("New Jersey");

        sel.deselectByVisibleText("Ohio");
        System.out.println("The drop Down is multiple "+sel.isMultiple());
        sel.selectByIndex(0);

    }
}
