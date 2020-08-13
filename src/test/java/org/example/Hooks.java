package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();
    //static String timestamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());


    @Before

    public void openBrowser() throws Exception {
        browserSelector.setUPBrowser();
        driver.get(loadProp.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();


    }

    @After


    public void closeBrowser() throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File("src\\Screenshot\\2.png"));

        //driver.close();
    }
}
