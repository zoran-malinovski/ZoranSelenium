
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTestBanzae {



    @Test
    public void FirstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://banzae.dev/");
        driver.manage().window().maximize();


        WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-item-15\"]/a"));
        element.click();
        Thread.sleep(1500);


        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"menu-item-19\"]/a"));
        element1.click();

        WebElement element2 = driver.findElement(By.name("your-name"));
        element2.sendKeys("Zoc");

        Thread.sleep(1500);

        WebElement element3 = driver.findElement(By.name("your-email"));
        element3.sendKeys("zoc@mail.com");
        Thread.sleep(1500);

        WebElement element4 = driver.findElement(By.name("your-phone"));
        element4.sendKeys("070112233");
        Thread.sleep(1500);

        WebElement element5 = driver.findElement(By.name("your-message"));
        element5.sendKeys("Najbolji!!!");
        Thread.sleep(1500);

        WebElement element6 = driver.findElement(By.xpath("//*[@id=\"wpcf7-f79-o1\"]/form/div[4]/input"));
        element6.submit();


    }
}
