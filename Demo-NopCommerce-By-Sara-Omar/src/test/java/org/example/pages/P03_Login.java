package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_Login {
    public WebElement email(){
        WebElement email = Hooks.driver.findElement(By.id("Email"));
        return email;
    }
    public WebElement password(){
        WebElement password = Hooks.driver.findElement(By.id("Password"));
        return password;
    }
    public WebElement loginBtn(){
        WebElement loginBtn = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        return loginBtn;
    }
    public WebElement forgetPassword(){
        WebElement forgetPassword = Hooks.driver.findElement(By.className("forgot-password"));
        return forgetPassword;
    }
    public WebElement wrongMsg() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
