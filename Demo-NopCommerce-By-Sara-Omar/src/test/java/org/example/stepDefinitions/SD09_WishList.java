package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_HomePage;
import org.example.pages.P06_WishList;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SD09_WishList extends P01_HomePage {
    P06_WishList wishList= new P06_WishList();
    int num;

    @Given("user add item to wishlist")
    public void step1() {
        addWishList().get(2).click();
    }

    @Then("wishlist notification success is visible")
    public void step2() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(wishSuccessMsg().isDisplayed(), "Success Message");

        String actual = wishSuccessMsg().getCssValue("background-color");
        String expected = "rgba(75, 176, 122, 1)";
        soft.assertEquals(actual, expected, "Message color");
    }

    @And("user get the number of wishlist items after adding item")
    public void step3() {
        String text = wishList().getText();
        text = text.replaceAll("[^0-9]", "");
        num = Integer.parseInt(text);
    }

    @Then("the number of wishlist increased")
    public void step4() throws InterruptedException {
        Assert.assertTrue(num > 0, "count of wishlist items");
    }

    @And("user go to wishlist page")
    public void step5() throws InterruptedException {
        closeB().click();
        Thread.sleep(1000);
        wishList().click();
    }

    @Then("the number of items greater than zero in wishlist page")
    public void step6() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/wishlist"), "wishlist URL");
        // Second Assertion
        int size = wishList.wishListItems();
        soft.assertTrue(size > 0,"wishlist items");
        // Assert All
        soft.assertAll();
    }
}
