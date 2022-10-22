package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_PasswordRecovery {
    public WebElement email ()
    {
        WebElement email= Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
        return email;
    }
    public WebElement recoveryButton()
    {
        WebElement recoveryButton= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]"));
        return recoveryButton;
    }
    public WebElement message()
    {
        WebElement message= Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
        return message;
    }
}
