package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SD07_Slider extends P01_HomePage {
    @When("user clicks on first slider")
    public void step1(){
        Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).click();
        slider("1").click();
    }

    @Then("relative product for first slider is displayed")
    public void step2() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","URL of First Slide");
    }

    @When("user clicks on second slider")
    public void step3() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).click();
       slider("2").click();
    }

    @Then("relative product for second slider is displayed")
    public void step4() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6","URL of Second Slide");
    }
}
