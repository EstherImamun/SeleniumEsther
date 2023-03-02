import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImportantCodes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/%22");
                driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Leo");
        driver.findElement(By.name("lastname")).sendKeys("Lovefish");
        driver.findElement(By.name("reg_email")).sendKeys("leo@gmail.com");
        driver.findElement(By.name("reg_email_confirmation")).sendKeys("leo@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("leo1234");


        Select select=new Select(driver.findElement(By.id("month")));
        select.selectByVisibleText("May");
        select =new Select(driver.findElement(By.id("day")));
        select.selectByVisibleText("14");
        select=new Select(driver.findElement(By.id("year")));
        select.selectByVisibleText("2015");

        WebElement male= driver.findElement(By.xpath("//input[@value='2']"));
        male.click();


        Thread.sleep(5000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);

        driver.close();



    }
}
