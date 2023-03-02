package class02.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       /* HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
        */

        // navigate to the website
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        // maximize the webpage
        driver.manage().window().maximize();

        // fill out the form
        driver.findElement(By.id("customer.firstName")).sendKeys("Esther");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Imams");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.street")).sendKeys("14, Williams street");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.city")).sendKeys("Lagos");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.state")).sendKeys("Lagos");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("1253Y");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123456789");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.ssn")).sendKeys("98764332221");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).sendKeys("1234Lux");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.password")).sendKeys("TheBest!");
        Thread.sleep(2000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("TheBest!");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(4000);
        driver.close();




















    }
}
