package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPage extends BasePage {
    private final WebDriver driver;



    private final By NAME_FIELD=By.xpath("//input[@id='name']");
    private final By EMAIL_FIELD=By.xpath("//input[@id='email']");
    private final By COMPANY_FIELD=By.xpath("//input[@id='company']");
    private final By MESSAGE_FIELD=By.xpath("//textarea[@id='message']");
    private final By BTN_SEND=By.xpath("//body/section[@id='getInTouch']/article[1]/div[1]/div[1]/form[1]/div[1]/input[1]");
    private final By CHECK_BOX=By.xpath("//input[@id='newsletter']");
    private final By FINISH_FIELD=By.xpath("//span[contains(text(),'Thanks for reaching out!')]");
    private final By MESSAGE=By.xpath("//body/section[@id='getInTouch']/article[1]/div[1]/div[1]/form[1]/div[1]/p[1]");

    public BlogPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }


    public boolean Correct(){
       return super.checkElementFromPageSelected(FINISH_FIELD);
    }


    public BlogPage typeNameField(String value) {
        super.write(NAME_FIELD, value);
        return this;
    }
    public BlogPage typeEmailField(String value) {
        super.write(EMAIL_FIELD, value);
        return this;
    }
    public BlogPage typeCompanyField(String value) {
        super.write(COMPANY_FIELD, value);
        return this;
    }

    public BlogPage typeMessageField(String value) {
        super.write(MESSAGE_FIELD, value);
        return this;
    }

    public BlogPage clickOnSendButton(){
        super.clickOnElement(BTN_SEND);
        return this;
    }

    public BlogPage fillField(String name,String email,String company,String message){
        return typeNameField(name)
                .typeEmailField(email)
                .typeCompanyField(company)
                .typeMessageField(message)
                .clickOnSendButton();
    }

    public boolean messageDisplayed() {
        return super.checkElementFromPageSelected(MESSAGE);

    }

    public BlogPage fillBlankedField() {
        return clickOnSendButton();


    }


}
