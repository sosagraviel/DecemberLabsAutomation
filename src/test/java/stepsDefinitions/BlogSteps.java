package stepsDefinitions;

import POM.BlogPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BlogSteps extends baseClass{

public BlogPage blogPage;


    final baseClass base;

    public BlogSteps(baseClass base){
        this.base=base;
        blogPage=new BlogPage(base.basewebDriver);
    }

    @And("User fill the fields {string} and {string} and {string} and {string}")
    public void user_Enter_Email_as_and_password_as(String name, String email,String company, String message) {
        blogPage.fillField(name,email,company,message);
    }

    @And("User leaves fields empty")
    public void user_Enter_Email_as_and_password_as() throws InterruptedException {
        blogPage.fillBlankedField();
       Assert.assertTrue(blogPage.messageDisplayed());
    }

    @Then("Page Should send correctly")
    public void pageShouldSendCorrectly() {
        Assert.assertTrue(blogPage.Correct());
    }

}
