package stepsDefinitions;

import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepsDefinitionLogin extends baseClass {
    public LoginPage loginPage;
    final baseClass base;

    public stepsDefinitionLogin(baseClass base){
        this.base=base;
    }

    @Given("I Launch Chrome Browser")
    public void i_Launch_Chrome_Browser() {
        System.setProperty("webdriver.chrome.driver","//home/graviel/Descargas/intelij/chromedriver");
        base.basewebDriver=new ChromeDriver();
        loginPage =new LoginPage(base.basewebDriver);
    }

    @When("A user is in the homepage {string}")
    public void i_open_orange_hrm_homepage(String url) {
        base.basewebDriver.get(url);
        base.basewebDriver.manage().window().maximize();

    }

    @And("close browser")
    public void close_browser() {
        base.closeBrowser();
    }


    @When("Click on Login")
    public void click_on_Login(){
        loginPage.clickOnLogin();

    }


}
