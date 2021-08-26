package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross {
    WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setup(String browser) throws Exception{
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:/Users/Pritam Paul/Downloads/demo1/SeleniumConcepts/src/driver/" +
                    "geckodriver.exe");
            driver = new FirefoxDriver();
        }


        else if(browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver","C:/Users/Pritam Paul/Downloads/demo1/" +
                    "SeleniumConcepts/src/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Edge")){

            System.setProperty("webdriver.edge.driver","C:/Users/Pritam Paul/Downloads/demo1/SeleniumConcepts/src/driver/" +
                    "msedgedriver.exe");
                    driver = new EdgeDriver();
        }
        else{
            throw new Exception("Incorrect Browser");
        }
    }
    @Test
    public void testParameterWithXML_ShouldReturnDataOfThePage() throws InterruptedException{
        driver.get("https://www.google.com/");
        System.out.println("Tittle: " + driver.getTitle());
        System.out.println("Page URL: " + driver.getCurrentUrl());
        System.out.println("Page source: " + driver.getPageSource());

    }
}
