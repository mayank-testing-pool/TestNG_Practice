package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {

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

   @Test(priority = 1,groups = "Title")
    public void googleTitleTest()
    {
        String title = driver.getTitle();
        System.out.println("Title of page is "+title);
    }

    @Test (priority = 3,groups = "Logo")
    public void googleImageTest()
    {
        boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
    }

    @Test(priority = 2,groups = "Link Test")
    public void mailLinkTest()
    {
        boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
    }

    @Test(priority = 4,groups = "Test")
    public void test1 ()
    {
        System.out.println ("Test1");
    }

    @Test(priority = 5,groups = "Test")
    public void test2 ()
    {
        System.out.println ("Test2");
    }

    @Test(priority = 6,groups = "Test")
    public void test3 ()
    {
        System.out.println ("Test3");
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}
