/*import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

 */

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderTests {

    //gradlew test -Dselenide.headless=true

    //private WebDriver driver;


   /* @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    */
/*
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }
*/

    @Test
    void shouldTestSomething() throws InterruptedException
    //throws InterruptedException
    {
        /*
        //driver.get("http://0.0.0.0:9999");
        open("http://localhost:9999");
        // $("[data-test-id=name]");
        $("[class=input__inner] input").setValue("Кирилл Костиев");
        //$("[data-test-id=phone]");
        $("[class=input__inner] input").setValue("+78992443554");
        //$("[data-test-id=agreement]");
        $("[data-test-id=agreement]").click();
        $("[class=button__content]").click();
        $("[class=Success_successBlock__2L3Cw]").shouldHave(exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

        //SelenideElement form = $("[data-test-id=phone]");
        //form.$("[data-test-id=phone] input").setValue("+7899244355");
        //form.$("[data-test-id=agreement]").click();
        Thread.sleep(5000);

*/


        //driver.get("http://0.0.0.0:9999");
        open("http://localhost:9999");
        // $("[data-test-id=name]");
        $("[data-test-id=name] input").setValue("Кирилл Костиев");
        //$("[data-test-id=phone]");
        $("[data-test-id=phone] input").setValue("+78992443554");
        //$("[data-test-id=agreement]");
        $("[data-test-id=agreement]").click();
        $("[class=button__content]").click();
        $("[data-test-id=order-success]").shouldHave(exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

        //SelenideElement form = $("[data-test-id=phone]");
        //form.$("[data-test-id=phone] input").setValue("+7899244355");
        //form.$("[data-test-id=agreement]").click();
        Thread.sleep(5000);

    }

}
