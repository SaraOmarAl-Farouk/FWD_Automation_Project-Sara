package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Login;
import org.example.pages.P04_PasswordRecovery;
import org.testng.Assert;

public class SD03_PasswordRecovery extends P04_PasswordRecovery {
    P03_Login login = new P03_Login();
    @And("user click on forgot password")
    public void step1(){
        login.forgetPassword().click();
    }
    @When("user fill email with valid email")
    public void step2(){
        email().sendKeys("Test12345@test.com");
    }
    @And("user click on Recover button")
    public void step3(){
        recoveryButton().click();
    }
    @Then("user should see message")
    public void step4(){
        Assert.assertTrue(message().getText().contains("Email with instructions has been sent to you.")
        , String.valueOf(true));
    }
}
