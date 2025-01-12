package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {
    public static void main(String[] args) {

        // Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to: https://practice.cydeo.com
        driver.get("http://practice.cydeo.com");

        //Click to A/B Testing from top of the list
        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        //Verify title is : Expected : No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED!");
        }

        //Go back to home page bu using the .back();
        driver.navigate().back();

        //verify title equals: Expected:Practice

        if(driver.getTitle().equals("Practice")){
            System.out.println("Title Verification PASSED!");
        }

    }
}
