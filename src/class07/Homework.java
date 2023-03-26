package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to Syntax projects.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        //click on alert button
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        //change text to Selenium Webdriver
        driver.findElement(By.xpath("//button[text()='Change Text to Selenium Webdriver']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        WebElement element = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        String text = element.getText();
        System.out.println(text);

        //click on display button after 10 seconds
        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        System.out.println(driver.findElement(By.xpath("//button[@id='hidden']")).isDisplayed());

        // enable button after 10 seconds
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']"))).click();
        boolean enabledBtn = driver.findElement(By.xpath("//button[@id='disable']")).isEnabled();
        System.out.println(enabledBtn);

       // select the checkbox after 10 seconds
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='ch']")));
        System.out.println(driver.findElement(By.xpath("//input[@id='ch']")).isSelected());

















    }
}
