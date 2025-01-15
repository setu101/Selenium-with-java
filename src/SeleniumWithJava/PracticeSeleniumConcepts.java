import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PracticeSeleniumConcepts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.citi.com");

        //username
        //clearing send keys
        driver.findElement(By.id("username")).sendKeys("Sara");
        driver.findElement(By.id("password")).sendKeys("Abc123");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();
        Thread.sleep(5000);
        //driver.quit();

        //getText

        WebElement el= driver.findElement(By.id("register_acc"));
        System.out.println(el.getText());
        driver.quit();
    }
}
