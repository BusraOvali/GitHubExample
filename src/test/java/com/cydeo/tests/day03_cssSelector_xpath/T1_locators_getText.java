package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {

        // 1-Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”

        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        // 4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.className("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        // 5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        // Expected: Incorrect login or password

        String expectedErrorText ="Incorrect login or passord";
        String actualErrorText = driver.findElement(By.className("errortext")).getText();

        if(actualErrorText.equals(expectedErrorText)){
            System.out.println("Successfully logged in");
        }else {
            System.out.println("Incorrect login or passord");
        }
        // PS: Inspect and decide which locator you should be using to locate web
        // elements.



    }
}
