import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.get("https://demo.automationtesting.in/Frames.html");

        //driver.get("https://demo.automationtesting.in/Register.html");

        //driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.get("https://demo.automationtesting.in/Alerts.html#CancelTab");
//        System.out.println(driver.findElements(By.tagName("iframe")).size());
//
//        driver.switchTo().frame("singleframe");
//
//        driver.findElement(By.cssSelector("body > section > div > div > div > input[type=text]")).sendKeys("Hello iframe");
//
//        Thread.sleep(2000);


        //      driver.findElement(By.linkText("Home")).click();
//        Thread.sleep(2000);
//
//        //driver.switchTo().frame("email");
//
//        driver.findElement(By.id("email")).sendKeys("Test.test.com");
//
//        driver.findElement((By.id("enterimg"))).click();
//
//        Thread.sleep(2000);


        //driver.findElement(By.linkText("Register")).click();
//        driver.findElement(By.id("imagesrc")).sendKeys("/Users/setu/Documents/git note correction.docx");
//        Thread.sleep(2000);
//        driver.quit();

        driver.switchTo().frame("Alert with OK & Cancel");
        //driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li.active > a"));
       //Actions actions = new Actions(driver);
      // actions.moveToElement(driver.findElement(By.className("analystic"))).click();

        //driver.quit();

    }
}

