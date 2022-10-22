package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver =null;
    @Before
    public static void openDriver(){
        //1-Define Bridge
        WebDriverManager.chromedriver().setup();
        //2-Create new object of chromedriver
        driver=new ChromeDriver();
        //3-Configuration;
        //3.1-Maximize Screen
        driver.manage().window().maximize();
        //3.2-Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //4-Navigate to website
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
