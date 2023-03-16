package kodlanir;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AbTest {


    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method from ABTEST");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method from ABTEST");
        System.out.println("-------------------------\n");
    }

    @Test
    public void aTest() {
        System.out.println("A testi from AbTest");
    }

    @Test
    public void bTest() {
        System.out.println("B testi from AbTest");
    }
}
