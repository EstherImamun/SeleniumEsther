package JavaSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaWebdriver {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //creating an instance of the ChromeDriver
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        try{
        driver.get("https://google.com/");
        Thread.sleep(3000);
        System.out.println(10/0);
        Thread.sleep(2000);
        driver.findElement(By.name("s")).sendKeys("Java Tutorials");}
        catch (NoSuchElementException e){
            System.out.println("Please check your locators");
        }finally {
            // no matter what happens inside the try block or any of the catch blocks, this code that we write
            // inside the finally is always executed
            driver.close();
        }
    }
}
