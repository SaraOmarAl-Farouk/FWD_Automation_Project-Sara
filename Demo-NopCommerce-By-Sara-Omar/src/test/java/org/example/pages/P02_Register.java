package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Register {
    public WebElement genderMale ()
    {
        WebElement genderMale= Hooks.driver.findElement(By.id("gender-male"));
        return genderMale;
    }
    public WebElement firstName ()
    {
        WebElement firstName= Hooks.driver.findElement(By.id("FirstName"));
        return firstName;
    }
    public WebElement lastName ()
    {
        WebElement lastName= Hooks.driver.findElement(By.id("LastName"));
        return lastName;
    }
    public WebElement birthDay(){
        WebElement day=Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return day;
    }
    public WebElement birthMonth(){
        WebElement month=Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }
    public WebElement birthYear(){
        WebElement year=Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }
    public WebElement email(){
        WebElement email=Hooks.driver.findElement(By.name("Email"));
        return email;
    }
    public WebElement companyName() {
        WebElement company = Hooks.driver.findElement(By.name("Company"));
        return company;
    }
    public WebElement password() {
        WebElement password = Hooks.driver.findElement(By.name("Password"));
        return password;
    }
    public WebElement confirmPassword(){
        WebElement confirmPassword=Hooks.driver.findElement(By.name("ConfirmPassword"));
        return confirmPassword;
    }
    public WebElement registerBtn(){
        WebElement btn=Hooks.driver.findElement(By.name("register-button"));
        return btn;
    }
    public WebElement result(){
        WebElement result=Hooks.driver.findElement(By.className("result"));
        return result;
    }
    public WebElement continueBtn(){
        WebElement cBtn=Hooks.driver.findElement(By.className("button-1"));
        return cBtn;
    }
}
