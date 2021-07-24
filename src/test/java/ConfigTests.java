import static com.codeborne.selenide.Configuration.*;

import com.codeborne.selenide.AssertionMode;
import org.testng.annotations.BeforeSuite;


public class ConfigTests {
    @BeforeSuite
    public static void beforeTest() {
        startMaximized=true;
        reopenBrowserOnFail = true;
        screenshots=true;
        savePageSource=false;
    }
}
