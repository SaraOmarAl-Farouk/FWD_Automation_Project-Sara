package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_Search {
    public int productsList(){
        int size = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        return size;
    }

    public WebElement noProducts(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
    }
}
