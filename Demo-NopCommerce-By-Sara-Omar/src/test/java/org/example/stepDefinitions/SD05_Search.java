package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.example.pages.P05_Search;
import org.testng.asserts.SoftAssert;

public class SD05_Search extends P05_Search {
    P01_HomePage homePage=new P01_HomePage();
    //First Scenario
    @When("user click on search bar")
    public void step1() {
        homePage.searchBar().click();
    }

    @And("user search for product like \"(.*)\"$")
    public void step2(String search) {
        homePage.searchBar().sendKeys(search);
    }

    @And("user click on search Button")
    public void step3() {
        homePage.searchButton().click();
    }

    @Then("user could search successfully and go to search page")
    public void step4() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Apple"), "search URL");
        // Second Assertion
        int size = productsList();
        soft.assertTrue(size > 0,"Search Result");
        soft.assertAll();
    }
    //Second Scenario
    @Then("user could search successfully with SKU")
    public void step5() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "URL after search");
        // Second Assertion
        int size = productsList();
        soft.assertTrue(size > 0,"Search Result");
        soft.assertAll();
    }
    //Third Senario
    @Then("user could not search")
    public void step6() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(noProducts().isDisplayed(), "No products");
    }
}
