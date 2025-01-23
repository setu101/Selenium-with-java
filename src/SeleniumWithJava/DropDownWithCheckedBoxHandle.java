import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DropDownWithCheckedBoxHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

        //button[contains(@class, 'multiselect')]
        driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();
        List<WebElement> listOfElement = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//li/a/label"));
        System.out.println("The total number of elements: " + listOfElement.size());

        for(int i = 0; i<listOfElement.size(); i++){
            System.out.println("The text of the labels are " + listOfElement.get(i).getText());
           listOfElement.get(i).click();
           //to deselect the selected one, and select the unselected ones.

//            if(listOfElement.get(i).getText().equalsIgnoreCase("Bootstrap")){
//                listOfElement.get(i).click();
//                break;
//
//            }
        }

    }
}
