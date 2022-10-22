package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;

public class P06_WishList {
    public int wishListItems(){
        int size = Hooks.driver.findElements(By.cssSelector("div[class=\"wishlist-content\"]")).size();
        return size;
    }
}
