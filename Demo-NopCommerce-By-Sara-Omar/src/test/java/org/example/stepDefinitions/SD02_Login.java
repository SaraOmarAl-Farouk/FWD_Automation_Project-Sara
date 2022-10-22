package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.example.pages.P03_Login;
import org.testng.asserts.SoftAssert;

public class SD02_Login extends P03_Login {
    P01_HomePage homePage=new P01_HomePage();
    SoftAssert soft = new SoftAssert();
    @When("user navigate to login page")
    public void step1() {
        homePage.login().click();
    }
    @And("user enter \"(.*)\" and \"(.*)\"$")
    public void step2(String email, String password) throws InterruptedException {
        email().sendKeys(email);
        password().sendKeys(password);
        Thread.sleep(1000);
    }
    @Then("user click on login button")
    public void step3() {
        loginBtn().click();
    }
    @And("user could login successfully and go to home page")
    public void step4() {
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","URL login");
        soft.assertAll();
    }
    @And("user could not login successfully and go to home page")
    public void step5() {
        wrongMsg().isDisplayed();
        String actual = wrongMsg().getText();
        soft.assertEquals(actual.contains("Login was unsuccessful. Please correct the errors and try again."),true);
    }
}
