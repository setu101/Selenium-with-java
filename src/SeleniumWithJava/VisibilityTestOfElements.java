import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class VisibilityTestOfElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://accounts.lambdatest.com/login");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id(""))

        boolean toCheckIsDisplayed = driver.findElement(By.id("login-button")).isDisplayed();
        System.out.println(toCheckIsDisplayed);

        boolean toCheckIsEnabled = driver.findElement(By.id("login-button")).isDisplayed();
        System.out.println(toCheckIsEnabled);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        boolean toCheckIsSelected = driver.findElement(By.id("login-button")).isSelected();
        System.out.println(toCheckIsSelected);

        driver.get("https://demo.automationtesting.in/Register.html");

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        boolean toCheckIsSelected = driver.findElement(By.id("login-button")).click();
        System.out.println(toCheckIsSelected);

        //driver.quit();



    }
}
