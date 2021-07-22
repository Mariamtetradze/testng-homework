
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
        baseUrl= "https://demoqa.com/radio-button ";
        reportsFolder="src/main/resources/RadioButtonFailedTests";
    }
    @BeforeTest
    public void beforeRadioButtonTests() {
        open(baseUrl);
    }

    @Test(description = "select yes option")
    public void selectYes() {
        SelenideElement yesRadio = $(withText("Yes"));;
        yesRadio.click();
        soft.assertFalse(yesRadio.isSelected());
        soft.assertAll();
    }

    @Test(description = "check if no option is available")
    public void checkIfDisabled() {
        SelenideElement noRadio = $(withText("No"));
        soft.assertFalse(noRadio.isEnabled());
        soft.assertAll();
    }

    @AfterTest
    public void afterRadioButtonTests() {
        closeWebDriver();
    }


}
