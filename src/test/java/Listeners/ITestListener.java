package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ ListenersTestNG.class, ReportSetup.class })

public class ITestListener {
    @Test
    public void assertSuccessTest() {
        Assert.assertEquals("test", "test");
    }

    @Test
    public void assertFailureTest() {
        Assert.assertEquals("selenium", "selenide");
    }

    @Test
    public void skipTest() {
        throw new SkipException("Skipping");
    }

    private int i = 1;

    @Test (successPercentage = 60, invocationCount = 3)
    public void AccountTest() {
        if(i < 2)
            Assert.assertEquals(i , i);
        i++;
    }


}
