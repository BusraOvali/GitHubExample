package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/registration_form");

        // Verify header text is as expected:
        // Expected : Registration form
        WebElement header = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";
        String actualHeaderText = header.getText();
        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("The header text is correct");
        }

        //Locate "first name" input box

        WebElement firstNameInput = driver.findElement(By.className("form-control"));
        //Verify placeholder attribute's value is as expected :
        // Expected:first name

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");
        System.out.println("actualPlaceHolder=" + actualPlaceHolder);
        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("The placeholder is correct");
        }else{
            System.out.println("The placeholder is incorrect");
        }
    }
}
