package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SD06_HoverCategories extends P01_HomePage {
    String subCategoryName;
    @When("user hover category and select subcategory")
    public void step1() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(computers()).perform();
        subCategoryName = desktops().getText().toLowerCase();
        Thread.sleep(1000);
    }

    @And("user click on subcategory")
    public void step2(){ desktops().click();
    }

    @Then("user go to relative product page")
    public void step3(){
        Assert.assertEquals(categoryList().getText().toLowerCase(),subCategoryName,"subcategory");
    }
}
