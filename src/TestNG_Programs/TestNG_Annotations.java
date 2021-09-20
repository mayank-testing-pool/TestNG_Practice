package TestNG_Programs;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class TestNG_Annotations {
    @Test
    public void test() {
        System.out.println("This is Test Annotations");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is beforeMethod Annotations");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is afterMethod Annotations");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This is beforeClass Annotations");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This is afterClass Annotations");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This is beforeTest Annotations");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This is afterTest Annotations");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This is beforeSuite Annotations");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This is afterSuite Annotations");
    }


}
