import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DataProvider extends ConfigTests{
    @Test(dataProvider = "loginData")
    public void loginTest(String fname, String lname, String number) {
        open("https://demoqa.com/automation-practice-form");
        SelenideElement firstNameInput = $("#firstName");
        SelenideElement lastNameInput = $("#lastName");
        SelenideElement numberInput = $("#userNumber");
        firstNameInput.setValue(fname);
        lastNameInput.setValue(lname);
        numberInput.setValue(number);
    }

    @org.testng.annotations.DataProvider(name = "loginData")
    public Object[][] dpMethod(){
      Object[][] data = {{"first", "first", "1234"}, {"second", "second", "4556"},{"third", "third", "677"}};
      return data;
    }

}
