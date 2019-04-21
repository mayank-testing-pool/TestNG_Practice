package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTitleTest {
    WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        String path = System.getProperty("user.dir");
        System.out.println (path);
        System.setProperty( "webdriver.chrome.driver", path+"\\support\\chromedriver_2.41.exe" );
        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--no-sandbox" );
        driver = new ChromeDriver( options );
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.navigate().to( "https://www.google.com" );
    }

    @Test()
    public void TitleTest()
    {
        String title = driver.getTitle();
        System.out.println("Title of page is "+title);

        Assert.assertEquals(title,"Google","Title is not matched");

    }
    @Test ()
    public void ImageTest()
    {
        boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();

        Assert.assertTrue(b);
    }


    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }

}
