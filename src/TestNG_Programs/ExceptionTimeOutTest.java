package TestNG_Programs;


import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

    /*@Test(invocationTimeOut = 2)
    public void infiniteLoopTest()
    {
        int i = 1;
        while (i==1)
        {
            System.out.println("Value of i= "+i);
        }
    }*/

    @Test (expectedExceptions = NumberFormatException.class)
    public void   test1()
    {
        String x = "100A";
        Integer.parseInt(x);
    }


}
