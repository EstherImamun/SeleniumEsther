package class02.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       /* navigate to fb.com
        click on create new account
        fill up all the text-boxes
        click on sign up button
        close the pop-up
        close the browser
        TIP for HW2:
        just fill in text boxes or button, no need to deal with other webElements

        also u will need a Thread.sleep after clicking on create new account 🙂
        we will discuss "WHY" in future

        */
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement cookieButton=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        if(cookieButton.isEnabled()) {
            driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        }
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Esther");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Imamun");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("123445FTR@gkdjh");
        Thread.sleep(2000);
        driver.findElement(By.id("password_step_input")).sendKeys("098G");
        Thread.sleep(2000);
        driver.findElement(By.id("month")).sendKeys("April");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_day")).sendKeys("222");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_year")).sendKeys("1992");
        Thread.sleep(2000);
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(2000);
        driver.quit();


















    }
}
