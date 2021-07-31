import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FactoryTest {
    private String fn = "";
    private String ln = "";
    private String nmb = "";



    public FactoryTest(String param, String ln, String nmb) {

        this.fn = param;
        this.ln = ln;
        this.nmb = nmb;
    }
    @Test
    public void testMethod() {
        open("https://demoqa.com/automation-practice-form");
        SelenideElement firstNameInput = $("#firstName");
        SelenideElement lastNameInput = $("#lastName");
        SelenideElement numberInput = $("#userNumber");
        firstNameInput.setValue(fn);
        $(withText("Male")).click();
        lastNameInput.setValue(ln);
        numberInput.setValue(nmb);

    }
}
