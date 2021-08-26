package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Store {

    public static WebDriver chrome()
    {
        System.setProperty("webdriver.chrome.driver","C:/Users/Pritam Paul/Downloads/demo1/" +
                "SeleniumConcepts/src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver fireFox()
    {
        System.setProperty("webdriver.gecko.driver","C:/Users/Pritam Paul/Downloads/demo1/SeleniumConcepts/src/driver/" +
                "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver msEdge()
    {
        System.setProperty("webdriver.edge.driver","C:/Users/Pritam Paul/Downloads/demo1/SeleniumConcepts/src/driver/" +
                "msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        return driver;
    }
}
