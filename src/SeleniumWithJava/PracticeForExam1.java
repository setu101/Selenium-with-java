import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class PracticeForExam1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.orangehrm.com/");


       WebElement iframe = driver.findElement(By.className("demo-frame"));

         //driver.switchTo().frame(iframe);
        //driver.switchTo().frame("0");


        Actions actions1 = new Actions(driver);
        actions1.clickAndHold(driver.findElement(By.id("draggable")))
                .moveToElement(driver.findElement(By.id("droppable")))
                .release()
                .build()
                .perform();
        Thread.sleep(2000);


        List<WebElement> youFrames = driver.findElements(By.tagName("iframe"));
        System.out.println("Total number of iframes are: " + youFrames.size());

        for(WebElement youFrame : youFrames){
            String source = youFrame.getDomAttribute("src");
            System.out.println("The url of the iframe is " + source);
        }


        Thread.sleep(2000);


       


    }
}
