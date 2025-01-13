import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WritingXpathConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // driver.get("https://www.citi.com");
        driver.get("https://www.citi.com/");
        //driver.get("https://www.td.com");
       // driver.get("https://www.td.com/us/en/personal-banking");
        //Xpath is a locator. there are two types
        // 1.Absolute xpath - starting from the root of the HTMl docBegins from the root of the HTML
        // document and specifies the complete path to the element.
        //html/body/div[1]/div/div/div/div[1]/alerts/div[2]/div[1]/h1/span
        // It’s not as flexible and can break if the page structure changes.

        // 2. Relative xpath - Starts from a
        // relative xpath always starts with double forward slash (//).
        // get the html tag of the element
        // then two square brackets, so that means the high level structure is ://[]html tag
        // xpath is recommended when there is no ID or name property available for the element.
        // Rule-1 //html tag[@property ='value']

//        driver.findElement(By.xpath("//div[@class='carousel--custom-pager__item slick-slide slick-current slick-active slick-center']")).click();
//        Thread.sleep(2000);
//        driver.quit();

//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sara");
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abc123");
//        driver.findElement(By.xpath("//button[@class='cds-button cds-signon-button cds-button-primary cds-button-lg']")).click();
//        Thread.sleep(5000);



        //Rule 2: using contains: //html tag[contains(@property, 'value')]

        //It has the ability to find the element with Partial text.

        // works better for dynamic value like id=test_123, id=test_456, id=test_789

        //driver.findElement(By.xpath("//a[contains(@class, 'includes')]")).click();

        //driver.findElement(By.xpath("//div[contains(@class, 'cds-button cds-signon-button cds-button-primary cds-button-lg')]")).click();

        //Thread.sleep(2000);


        //Rule 3: starts-with -Matches the starting text of the attribute to find the element and
        //works good for long property value
        //also for dynamic id like id=test_123, id=test_456, id=test_789 and this is better than contains

//        driver.findElement(By.xpath("//button[starts-with(@class, 'cds-cta btn-threeup secondaryCta H')]")).click();
//        Thread.sleep(2000);
//        driver.quit();

        //Rule 4: ends-with  - opposite of starts-with
        //works better for dynamic locator
        //also for dynamic id like id=123_test, id=456, id=789_test
        //structure: //html tag[ends-with (@property, 'ending part of the value')]
        // input[ends-with(@class, 'email_form_submission w-button')]


        //Under Contains Rule:
        //linked-text x-path //a[contains(text(), 'Activate')]

        // Rule 5: text-specially for links
        //matches the text of the links or button, specially for the links
        //example:  //a[contains(text(). 'Activate')]
        // driver.findElement(By.xpath("//a[contains(text(), 'Open an Account')]")).click();
        //Thread.sleep(2000);
        // driver.quit();
        //driver.findElement(By.xpath("//a[contains(text(), 'Activate ')]")).click();
                        //or

        //driver.findElement(By.xpath("//a[text()= 'Activate']")).click();
        //1st one worked
        //Thread.sleep(2000);

        //Rule 6: using Index number
        //this one works if there is more than one element with same attribute property and value
        // driver.findElement(By.xpath("//li[@class='cmp-link'][1]")).click();
        //Thread.sleep(2000);
        //  driver.quit();

        // driver.findElement(By.xpath("//li[@class='main-links plusIcon blueCustomerBtns blueAccPadding ng-star-inserted'] ")).click();
        //Rule 7: using 'and' and 'or'
        //when one attribute does not work then use two attributes with 'and' or 'or'
        ////a[@href='#cmp-modal~ccdes2' and@class ='tooltip-bottom-border']
        // driver.findElement(By.xpath("//a[@href='#cmp-modal!ccdes2' and @class ='tooltip-bottom-border' ]")).click();
        // Thread.sleep(2000);
        // driver.findElement(By.xpath("//a[@href='https://www.citi.com/banking/bank-accounts?intc=citihpmenu_overview_bank-accounts' and @class = 'main-links plusIcon blueCustomerBtns blueAccPadding ng-star-inserted']")).click();

        driver.findElement(By.id())
        Thread.sleep(2000);
        driver.quit();

        //Rule 8: parent, child and siblings
        ////a[@class= 'cmp-primary-header__menu-link']//parent::li[@class='cmp-primary-header__menu-item ']
       // driver.findElement(By.xpath("//a[@class='cmp-primary-header__menu-link']//parent::li[@class='cmp-primary-header__menu-item ']")).click();
        ////a[text()='commercial']//parent::li[@class='cmp-link']//preceding-sibling::li[@class='class-link']

       // Thread.sleep(2000);
      //  driver.quit();


        //
    }
}
