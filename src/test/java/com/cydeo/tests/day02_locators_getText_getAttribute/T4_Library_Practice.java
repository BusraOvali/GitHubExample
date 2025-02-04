package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library_Practice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://library2.cybertekschool.com/login.html");


        // Enter username: "incorrect@email.com"
        // Locate username input box using :className locator

        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");


        //Enter password : "Incorrect password"
        // Locate password input box using : id locator

        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("anything");


        // Locate Sign in button using :tagName locator

        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();



        // Verify: visually "Sorry, Wrong Email or Password" displayed
        //VERIFIED
    }
}
