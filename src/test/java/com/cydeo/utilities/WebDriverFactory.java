package com.cydeo.utilities;

// method name : getDriver
//static method
//Accepts string arg: browserType
// this arg will determine what type of browser is opened
//if "chrome" passed --> it will open chrome browser
//if "firefox" passed --> it will open firefox browser
// return type: "WebDriver"


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
        if(browserType.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }else{
            System.out.println("Given string doesnt represent any browser");
            System.out.println("Either that browser does not exist or not currently supported");
            System.out.println("driver = null");
            return null;
        }
    }

    }

