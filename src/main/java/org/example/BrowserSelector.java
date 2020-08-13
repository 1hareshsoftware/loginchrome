package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends BasePage{
    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");

    public void setUPBrowser() {

        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\Resource\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Browser is Wrong");

        }

    }
}
