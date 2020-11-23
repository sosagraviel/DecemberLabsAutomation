package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{



    public WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private static final By SEND_BUTTON = By.linkText("Get in touch");

    public void clickOnLogin(){
        super.clickOnElement(SEND_BUTTON);
    }


/*test about Junit*/
    public int resul (int uno, int dos){
        return uno*dos;
    }

    public boolean isNull(int valor){
        boolean result=true;
        if(valor!=0){
            result=false;
        }
        return result;
    }



}
