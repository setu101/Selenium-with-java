import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://practice.automationtesting.in/shop/");

        //  Don't use these two (Deprecated)
        //  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Use these instead -- latest
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



    }
}
