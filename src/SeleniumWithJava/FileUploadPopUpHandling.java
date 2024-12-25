import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://html.com/input-type-file/");

        driver.findElement(By.id("fileupload")).sendKeys("/Users/setu/Documents/git note correction.docx");
        Thread.sleep(2000);
    }
}
