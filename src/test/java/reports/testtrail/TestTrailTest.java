import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import reports.testtrail.TestTrailLinstener;

import static org.testng.AssertJUnit.assertEquals;

@Listeners(TestTrailLinstener.class)
public class TestTrailTest {

    @Test(description = "157867")
    public void TestNGTestCase1() {
        Assert.assertTrue(7 > 3);
        System.out.println("TestNG: testNumberTestNGTests1: Passed !");
    }

    @Test(description = "157873")
    public void TestNGTestCase2() {
        Assert.assertTrue(8 > 6);
        System.out.println("TestNG: testNumberTestNGTests2: Passed !");
    }

    @Test(description = "157875")
    public void TestNGTestCase3() {
        Assert.assertTrue(33 > 99);
        System.out.println("TestNG: testNumberTestNGTests3: Passed !");
    }

    @Test(description = "157878")
    public void TestNGTestCase4() {
        Assert.assertTrue(7 > 3);
        System.out.println("TestNG: testNumberTestNGTests4: Passed !");
    }
} 