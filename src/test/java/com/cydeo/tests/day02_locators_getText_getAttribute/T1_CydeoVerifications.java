package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");


        // Verify URL contains
        //Expected :cydeo
        String expectedInURL = "cydeo";
        String actualInURL = driver.getCurrentUrl();
        if(actualInURL.contains(expectedInURL)) {
            System.out.println("URL verification PASSED!!!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }

        // Verify title:
        //Expected:Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!!!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

        if(driver.getTitle().equals("Practice")){
            System.out.println("passed");
        }

        //close the browser
        driver.close();
    }
}
