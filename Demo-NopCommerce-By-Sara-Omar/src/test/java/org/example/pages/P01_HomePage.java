package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_HomePage {
    public WebElement register(){
        WebElement reg= Hooks.driver.findElement(By.className("ico-register"));
        return reg;
    }
    public WebElement login() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement currency(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> sign(){
        List<WebElement> count =Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price]\"]"));
        return count;
    }
    public WebElement searchBar(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public WebElement categoryList(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public WebElement computers(){
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/computers\"]"));
    }

    public WebElement desktops(){
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/desktops\"]"));
    }
    public WebElement slider(String sliderNum){
        return Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }
    public WebElement facebook() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitter() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rss() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }

    public WebElement youtube() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
    public WebElement wishList() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"header-links\"] [href=\"/wishlist\"]"));
    }

    public List<WebElement> addWishList() {
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishSuccessMsg() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement closeB() {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }
}

