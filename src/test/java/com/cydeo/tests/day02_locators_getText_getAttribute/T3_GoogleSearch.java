package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        // write "apple" in a search box
        // a. locate search box

        WebElement googleSearchBox = driver.findElement(By.name("q"));

        // b. enter "apple" key, and press ENTER
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        // Press ENTER to search
        //googleSearchBox.sendKeys(Keys.ENTER);

        // Verify title:
        // Expected: Title should start with "apple" word

        String expectedInBeginningOfTitle ="apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInBeginningOfTitle)){
            System.out.println("Title verification Passed");
        }
        else{
            System.out.println("Title verification Fail");
        }




        }
}
