import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class PracticeLesson {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
//        driver.get("https://demo.automationtesting.in/Alerts.html");
         driver.get("https://demo.automationtesting.in/Register.html");
//        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("CancelTab")).click();
//        Thread.sleep(2000);
//
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//        Thread.sleep(2000);

//      FirstName:
//        driver.findElement(By.xpath("//form[1]/div[1]/div[1]/input")).sendKeys("Sara");
//        Thread.sleep(1000);

//      LastName:
        driver.findElement(By.xpath("//form[1]/div[1]/div[2]/input")).sendKeys("Jacob");
        Thread.sleep(1000);

//      Address:
        driver.findElement(By.xpath("//div[1]/textarea[1]")).sendKeys("2000 Hollywood Ave, CA");
        Thread.sleep(1000);

 //     email:
        driver.findElement(By.xpath("//div[3]/div[1]/input[1]")).sendKeys("sara.jacob@gmail.com");
        Thread.sleep(1000);

//      Phone:
        driver.findElement(By.xpath("//div[4]/div[1]/input[1]")).sendKeys("188-222-3343");
        Thread.sleep(2000);

//      Gender:
        driver.findElement(By.xpath("//label[2]/input[1]")).click();
        Thread.sleep(2000);

//      Hobbies:
        driver.findElement(By.id("checkbox2")).click();
        Thread.sleep(2000);

//      Language:
//      WebElement option = driver.findElement(By.id("Skills"));
//       List<WebElement> availableOption = select.getOptions();
//        driver.findElement(By.id("msdd")).click();
//        WebElement option = driver.findElement(By.id("msdd"));
//        Select select = new Select(option);
//        //select.selectByVisibleText("Arabic").
//        driver.findElement(By.xpath("//div[4]/div[1]/input[1]")).click();
//        Thread.sleep(2000);

//      Skills:
        //WebElement option = driver.findElement(By.id("Skills"));
        //driver.findElement(By.id("Skills")).click();
        //select select1= new Select(option);
        //select1.selectByVisibleText("C");
        //Thread.sleep(2000);

//      Country:



//      Select Country:
        //driver.findElement(By.className("select2-selection__arrow")).click();
        new WebDriverWait(driver, Duration.ofSeconds(20)).ignoring(StaleElementReferenceException.class)
                        .until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("select2-selection__arrow"))))
                                .click();

        Thread.sleep(2000);

        driver.findElement(By.className("select2-search__field")).sendKeys("Bangladesh");
        Thread.sleep(2000);


 //     Date of Birth: year
        WebElement options = driver.findElement(By.id("yearbox"));

        Select select= new Select(options);
        select.selectByVisibleText("2002");
        Thread.sleep(2000);

 //     Date of Birth: month

        WebElement monthbox = driver.findElement(By.xpath("//div[2]/select[1]"));
        Select forMonthBox = new Select(monthbox);
        forMonthBox.selectByVisibleText("July");
        Thread.sleep(2000);

//      Date of Birth: Day
        WebElement daybox = driver.findElement(By.id("daybox"));
        Select forDayBox = new Select(daybox);
        forDayBox.selectByVisibleText("10");
        Thread.sleep(2000);

//      Password:
        driver.findElement(By.id("firstpassword")).sendKeys("abc123");
        Thread.sleep(2000);



//      Confirm password:
        driver.findElement(By.id("secondpassword")).sendKeys("abc123");
        Thread.sleep(2000);

        //Submit button:
        driver.findElement(By.id("submitbtn")).click();
        Thread.sleep(2000);

//      Refresh button:
//        driver.findElement(By.id("Button1")).click();
//        Thread.sleep(5000);
        driver.quit();

    }
}
