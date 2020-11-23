package stepsDefinitions;

import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class stepsDefinitionLogin extends baseClass {
    public static final String CHROMEDRIVERMAC = "chromedrivermac";
    public static final String CHROMEDRIVERLINUX = "chromedriverlinux";
    public static final String CHROMEDRIVER_EXE = "chromedriver.exe";
    private static String OS = System.getProperty("os.name").toLowerCase();
    public LoginPage loginPage;
    final baseClass base;

    public stepsDefinitionLogin(baseClass base) {
        this.base = base;
    }

    @Given("I Launch Chrome Browser")
    public void i_Launch_Chrome_Browser() {
        String browser = CHROMEDRIVERLINUX;
        if (isWindows()) {
            browser = CHROMEDRIVER_EXE;
        } else if (isMac()) {
            browser = CHROMEDRIVERMAC;
        }
        System.setProperty("webdriver.chrome.driver", String.valueOf(Paths.get("src/test/drivers/", browser)));

        base.basewebDriver = new ChromeDriver();
        loginPage = new LoginPage(base.basewebDriver);
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
    public void click_on_Login() {
        loginPage.clickOnLogin();

    }

    private boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    private boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

}
