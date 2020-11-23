package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private final WebDriver driver;
    private final int WaitTime=15;
    private Actions action;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
    }

    public void clickOnElement(By element) {
        try {
            WebDriverWait wait=new WebDriverWait(driver,WaitTime);
            WebElement element1= wait.until(ExpectedConditions.elementToBeClickable(element));
            wait.until(ExpectedConditions.visibilityOf(element1));
            element1.click();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void write(By by, String value) {
        try {
            WebDriverWait wait=new WebDriverWait(driver,WaitTime);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
            element.clear();
            element.click();
            element.sendKeys(value);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public boolean checkElementFromPageSelected(By element){
        try {
            WebDriverWait wait=new WebDriverWait(driver,WaitTime);
            WebElement element1= wait.until(ExpectedConditions.elementToBeClickable(element));
            return element1.isDisplayed();
        }catch (Exception e){
            return false;
        }

    }

}
