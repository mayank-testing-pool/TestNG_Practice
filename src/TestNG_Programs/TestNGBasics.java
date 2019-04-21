package TestNG_Programs;

import org.testng.annotations.*;

public class TestNGBasics {
    // Pre-conditions - Starts with @Before
    @BeforeSuite
    public void setup()
    {
        System.out.println("Setup system property for chrome");
    }

    @BeforeTest
    public void lauchBrowser()
    {
        System.out.println ("Launch Chrome Browser");
    }

    @BeforeClass
    public void login ()
    {
        System.out.println ("Login method");
    }

    @BeforeMethod
    public void enterURL()
    {
        System.out.println ("Enter URL");
    }
    // Test Case  - starting with @Test
    @Test
    public void googleTitleTest()
    {
        System.out.println ("Google Title Test1");
    }

    @Test
    public void googleTitleTest2()
    {
        System.out.println ("Google Title Test2");
    }
    // Post Conditions - Starts with @After
    @AfterMethod
    public void logout()
    {
        System.out.println ("Logout From App");
    }

    @AfterClass
    public void deleteallCookies()
    {
        System.out.println ("Delete All Cookies");
    }

    @AfterTest
    public void closeBroswer()
    {
        System.out.println ("Close Browser");
    }

    @AfterSuite
    public void generateTestReport()
    {
        System.out.println ("Generate ");
    }
}
