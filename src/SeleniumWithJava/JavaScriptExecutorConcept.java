import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorConcept {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.citi.com/");

        WebElement signOn = driver.findElement((By.id("signInBtn")));
        WebElement openAnAccount = driver.findElement(By.id("navOpenAccmainAnchor8"));
        flash(signOn, driver);
        flash(openAnAccount, driver);

        driver.quit();

    }


        public static void flash(WebElement element, WebDriver driver ){
            //JavascriptExecutor js =((JavascriptExecutor) driver);

            String bgcolor = element.getCssValue("backgroundColor");
            for(int i =0; i<5; i++){
               changeColor("rgb(0, 200, 0)", element,driver);
                changeColor(bgcolor, element,driver);

            }
        }

        public static  void changeColor(String color, WebElement element, WebDriver driver){
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }


    }

