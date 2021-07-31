import org.testng.annotations.Factory;

public class FactoryTest2 extends ConfigTests {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new FactoryTest("first", "first", "2222"),
                new FactoryTest("second", "second", "22234"),
                new FactoryTest("third", "third", "67575"),

        };
    }

}
