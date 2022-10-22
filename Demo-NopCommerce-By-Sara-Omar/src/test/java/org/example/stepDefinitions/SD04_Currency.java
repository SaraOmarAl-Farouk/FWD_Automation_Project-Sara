package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SD04_Currency extends P01_HomePage {
    @Given("user navigate to homepage")
    public void step1(){

    }
    @When("user change current currency to Euro")
    public void step2() throws InterruptedException {
        Select select=new Select(currency());
        select.selectByVisibleText("Euro");
        Thread.sleep(1000);
    }
    @Then("user should found all products prices in Euro")
    public void step3(){

        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1400)", "");

        int count=sign().size();
        for (int i=0;i<count;i++)
        {
            sign().get(i).getText();
            Assert.assertTrue(sign().contains("€"));
        }

    }
    @When("user change current currency to Dollar")
    public void step4() throws InterruptedException {
        Select select=new Select(currency());
        select.selectByVisibleText("US Dollar");
        Thread.sleep(1000);
    }
    @Then("user should found all products prices in Dollar")
    public void step5(){

        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1400)", "");

        int count=sign().size();
        for (int i=0;i<count;i++)
        {
            sign().get(i).getText();
            Assert.assertTrue(sign().contains("$"));
        }
    }

}
