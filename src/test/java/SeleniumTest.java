import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {





        @Test
        public void FirstTest(){

        //Create a new instance of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        //navigation on page
        driver.get("https://www.google.com/");

        //Create Object of Element class in Selenium and find text input element by name="q" in search bar;
        WebElement element = driver.findElement(By.name("q"));

        driver.manage().window().maximize();
        //Enter text in search bar
        element.sendKeys("motogp");
        element.submit();

        //click on link
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a"));
        element1.click();



        //check page title is moto gp - Prebaruvanje na google
        System.out.println("Page title is : " +driver.getTitle());

        //close the Browser : "quite" to close browser; "close" to close one tab
        //driver.quit();

    }


}
