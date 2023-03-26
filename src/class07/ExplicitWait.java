package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        //go to Syntax projects.com
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");

        //click on the start button
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        // as the element that contains text becomes visible after some time, so we need to first implement the
        //Explicit wait

        WebDriverWait wait=new WebDriverWait(driver,20);//The 20 seconds means maximum waiting time before it throws an exception
        // for selenium 4 only
       // WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

        // once the element is visible then get the text
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText = text.getText();
        System.out.println(WelcomeText);


    }
}
