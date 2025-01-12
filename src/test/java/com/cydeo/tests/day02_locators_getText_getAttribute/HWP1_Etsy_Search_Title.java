package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP1_Etsy_Search_Title {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com/");

        //3. Search for “wooden spoon”

        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("Wooden Spoon" + Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon - Etsy”

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title Match");
        } else {
            System.out.println("Title Not Match");
        }
        driver.close();

    }
}
