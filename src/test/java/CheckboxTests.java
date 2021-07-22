
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit.SoftAsserts;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


import static com.codeborne.selenide.Selenide.*;


import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
@Listeners({ ScreenShooter.class})
public class CheckboxTests extends ConfigTests {

    SoftAssert soft = new SoftAssert();
    public CheckboxTests(){
        baseUrl= "http://the-internet.herokuapp.com/checkboxes";
        reportsFolder="src/main/resources/CheckboxFailedTests";
    }
    @BeforeTest
    public void beforeCheckboxTests() {
        open(baseUrl);
    }

    @Test(description = "uncheck checked checkbox")
    public void uncheck() {
        SelenideElement secondCheck = $("#checkboxes").$("input",1);
        secondCheck.click();
        soft.assertTrue(secondCheck.isSelected());
        sleep(1000);
        soft.assertAll();
    }

    @Test(description = "check unchecked checkbox")
    public void check() {
        SelenideElement firstCheck = $("#checkboxes").$("input",0);
        firstCheck.click();
        soft.assertFalse(firstCheck.isSelected());
        soft.assertAll();
    }

    @AfterTest
    public void afterCheckBoxTests() {
        closeWebDriver();
    }


}
