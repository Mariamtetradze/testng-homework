
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

@Listeners({ ScreenShooter.class})
public class RadioButtonTests extends ConfigTests{
    SoftAssert soft = new SoftAssert();

    public RadioButtonTests(){
       // baseUrl= "https://demoqa.com/radio-button ";
        reportsFolder="src/main/resources/RadioButtonFailedTests";
    }
    /*
    @BeforeTest
    public void beforeRadioButtonTests() {
        open(baseUrl);
    } */

    @Test(description = "select yes option", priority = 2,groups = {"FrontEnd"})
    public void selectYes() {
        baseUrl= "https://demoqa.com/radio-button ";
        open(baseUrl);
        SelenideElement yesRadio = $(withText("Yes"));;
        yesRadio.click();
        soft.assertFalse(yesRadio.isSelected());
        soft.assertAll();
    }

    @Test(description = "check if no option is available",priority = 1, groups = {"BackEnd"})
    public void checkIfDisabled() {
        baseUrl= "https://demoqa.com/radio-button ";
        open(baseUrl);
        SelenideElement noRadio = $(withText("No"));
        soft.assertFalse(noRadio.isEnabled());
        soft.assertAll();
    }

    @AfterTest
    public void afterRadioButtonTests() {
        closeWebDriver();
    }


}
