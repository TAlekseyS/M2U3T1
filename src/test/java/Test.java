import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;

public class Test {
    @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }
}
