package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to syntaxProjects.com
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
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Female']"));
        //check if the radio button is enabled
        boolean isEnabledMale = maleBtn.isEnabled();
        System.out.println("The radio button male is enabled "+isEnabledMale);
        // check if the radio button is Displayed
        boolean isDisplayedMale = maleBtn.isDisplayed();
        System.out.println("The radio button male is Displayed "+isDisplayedMale);
        // check if the radio button is Selected
        boolean isSelectedMale = maleBtn.isSelected();
        System.out.println("The radio button male is Selected "+isSelectedMale);
        // if the radio button is not selected click on it
        if(!isSelectedMale){
            maleBtn.click();
        }
        //check if the radio button is selected after the click
        isSelectedMale=maleBtn.isSelected();
        System.out.println("The status of selection is "+isSelectedMale);



    }
}
