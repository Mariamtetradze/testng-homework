package Retry;


import org.testng.Assert;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test {
    @org.testng.annotations.Test
    @RetryCountIfFailed(10)
    public static void methodToFail() {
        open("http://the-internet.herokuapp.com/checkboxes");
        Assert.assertTrue($("#checkboxes").$("input",0).isSelected());
    }
}
