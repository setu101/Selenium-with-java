import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlertHandle {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();



        //Step 2: to get the url or navigate to the given url
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

    driver.findElement(By.name("proceed")).click();
    Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        //alert.dismiss();



        if (alert.getText().equals("Please enter a valid user name")){
            System.out.println("It is a correct message");
        }else {
            System.out.println("It is not the correct message ");
        }

        alert.accept();
        driver.quit();


    }
}
