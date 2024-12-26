import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.orangehrm.com/");

        Actions actions = new Actions(driver);

//        actions.moveToElement(driver.findElement(By.id("Why OrangeHRM")))
//                        .moveToElement(driver.findElement(By.className("sub-menu-title menu-title-row pt-2 pb-2")))
//                        .moveToElement(driver.findElement(By.linkText("HR Administration")))
//                        .click()
//                        .build()
//                        .perform();
//        Thread.sleep(2000);

//        actions.moveToElement(driver.findElement(By.id("Why OrangeHRM")))
////                        .moveToElement(driver.findElement(By.className("sub-menu-title menu-title-row pt-2 pb-2")))
////                        .moveToElement(driver.findElement(By.linkText("HR Administration")))
////                        .click()
////                        .build()
////                        .perform();
////        Thread.sleep(2000);


        driver.findElement(By.linkText("OrangeHRM")).click();
       // Homework -- do the hw using city bank site








    }
}
