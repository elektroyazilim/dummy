package kodlanir;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XyTest {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test calisti..... AbTest\n");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite calisti..... AbTest\n");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\nAfter test calisti..... AbTest");
    }

    @Test
    public void xTest()
    {
        System.out.println("X testi from XyTest");
    }

    @Test
    public void yTest()
    {
        System.out.println("Y testi from XyTest");
    }
}
