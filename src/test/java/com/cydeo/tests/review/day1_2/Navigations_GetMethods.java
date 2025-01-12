package com.cydeo.tests.review.day1_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations_GetMethods {
    public static void main(String[] args) throws InterruptedException {

        // 1. Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to: https://practice.expandtesting.com/
        driver.get("http://practice.expandtesting.com/");

        // 3. Click on "Automation Training"

        WebElement automationTrainingLink = driver.findElement(By.linkText("Automation Training"));
        automationTrainingLink.click();

        Thread.sleep(5000);

        // 4. Verify url contains "formations"

        String expectedURL = "formations";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)) {
            System.out.println("URL verification is passed");
        }else{
            System.out.println("URL verification is failed");
        }

        // 5. Navigate back, forward and refresh
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        // 6. Click on "Practice Site"
        driver.findElement(By.linkText("Practice Site")).click();

        // 7. Verify title is "Practice Test Automation WebSite"
        if(driver.getTitle().equals("Practice Test Automation WebSite")) {
            System.out.println("Title verification is passed");
        }else {
            System.out.println("Title verification is failed");
        }
        driver.close();
        driver.quit();
    }
}
