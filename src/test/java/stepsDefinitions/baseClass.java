package stepsDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class baseClass {
    public WebDriver basewebDriver;


    //Created for generating random string for unique email
    public static String randomString(){
        String generateString= RandomStringUtils.randomAlphabetic(5);
        return (generateString);
    }
    public void closeBrowser(){
        basewebDriver.quit();
    }

}
