package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
       // driver.findElement(By.xpath("(//input[@name='chkSelectRow[]'])[1]")).click();

        List<WebElement> column = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
        for (int i = 0; i <column.size(); i++) {
        String text = column.get(i).getText();
        System.out.println(text);
        if (text.equalsIgnoreCase("52381A")) {
          System.out.println("The List ID is "+i);
        System.out.println("The Table ID on the website is "+i+1);
        WebElement number = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
        number.click();

            }

        }
    }
}

