import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DropDownListLesson {
    public static void main(String[] args) throws InterruptedException {
        //Step 1: declare a webdriver
        WebDriver driver = new ChromeDriver();

        //to maximize the browser
        driver.manage(). window().maximize();


        //Step 2: to get the url or navigate to the given url
       driver.get("https://www.orangehrm.com/en/book-a-free-demo");

        //get the locator for the dropdown list
        //WebElement option =  driver.findElement(By.id("Form_getForm_Country"));

        //creating object for select class
         //Select select = new Select(option);
        //Thread.sleep(2000);
        //providing value to select
        //select.selectByVisibleText("Bangladesh");
       // Thread.sleep(2000);

        WebElement option1 = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
        Select select = new Select(option1);

        Thread.sleep(2000);

       select.selectByVisibleText("51 - 200");
        Thread.sleep(2000);

        select.selectByIndex(2);

        select.selectByValue("51 - 200");

        driver.quit();




    }
}
