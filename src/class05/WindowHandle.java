package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to SyntaxProjects.com
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-2029772416%3A16791680888" + "41440&conti" +
                "nue=https%3A%2F%2Fpolicies.google.com%2Fterms%3Fgl%3DLU%26hl%3Den&ec=GAZAoQQ&followup=" + "https%3A%" +
                "2F%2Fpolicies.google.com%2Fterms%3Fgl%3DLU%26hl%3Den&hl=en&ifkv=AWnogHcuXkQbtoHWrEb2SwiIBeKuW" +
                "paAguU0thgUIykkEnjV0" + "VYBkJLW-Ex9cVQWyaAtGIlflz44Cg&passive=1209600&flowName=GlifWebSignI" +
                "n&flowEntry=ServiceLogin");
        // click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        // click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        // get the window handle of the parent window
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);
        // get window handles of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles();
        // print all the window handles
        for(String wh:windowHandles){
            // switch the focus of the driver to help window
            driver.switchTo().window(wh);
            // check the title of the window to which our focus is on right now
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        // to verify we switched to the right window
        System.out.println(driver.getTitle());
        // to switch back to the parent window
        driver.switchTo().window(parentWindowHandle);

    }
}
