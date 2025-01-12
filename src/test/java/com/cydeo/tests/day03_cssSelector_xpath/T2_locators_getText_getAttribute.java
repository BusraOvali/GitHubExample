package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_locators_getText_getAttribute {

    public static void main(String[] args) {
       // 1- Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

       // 3- Verify “remember me” label text is as expected:

        String expectedLabelText = "Remember me on this computer";
//        String actualLabelText = driver.findElement

       // Expected: Remember me on this computer
       // 4- Verify “forgot password” link text is as expected:
       // Expected: Forgot your password?
        // 5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
    }
}
