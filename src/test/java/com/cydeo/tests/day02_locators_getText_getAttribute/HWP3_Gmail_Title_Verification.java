package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_Gmail_Title_Verification {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");


        // Click to Gmail from top right
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));

        //click to the gmail link
        gmailLink.click();

        // Verify title contains:
        //Expected : Gmail

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

        // Go back to Google by using the .back();
        driver.navigate().back();

        //Verify title equals :
        //Expected :Google

        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();
        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification failed");
        }
    }
}
