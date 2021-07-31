import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class ParametrizationTest extends ConfigTests {
    @Test
    @Parameters({ "fName", "lName", "number" })
    public void parametrization(String fName, String lName, String number) {
        open("https://demoqa.com/automation-practice-form");
        SelenideElement firstNameInput = $("#firstName");
        firstNameInput.setValue(fName);
        SelenideElement lastNameInput = $("#lastName");
        lastNameInput.setValue(lName);
        $(withText("Male")).click();
        SelenideElement numberInput = $("#userNumber");
        numberInput.setValue(number);
        for(int i =0; i < fName.length(); i++) {
            if(fName.equals(firstNameInput.getValue())) {
                System.out.println("true");
            }
        }
    }
    }

