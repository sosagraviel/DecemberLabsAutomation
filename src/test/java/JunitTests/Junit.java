package JunitTests;
import POM.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Junit {
    public WebDriver driver;


    @Test
    @DisplayName("this is the name you will see when the test execute")
    public void mul(){
        LoginPage test=new LoginPage(driver);

        assertEquals(0, test.resul(2,0),"se espera que sea cero el valor");
    }

    @Test
    @DisplayName("Test boolean false")
    public void porVerFalse(){
        LoginPage test=new LoginPage(driver);

        assertFalse(test.isNull(test.resul(10,0)),"the result is false");
    }

    @Test
    @DisplayName("Test boolean true")
    public void porVerTrue(){
        LoginPage test=new LoginPage(driver);
        assertFalse(test.isNull(test.resul(10,1)),"the result is true");
    }
}
