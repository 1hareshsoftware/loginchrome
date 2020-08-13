package org.example;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static sun.plugin.javascript.navig.JSType.URL;

public class Utils {
    public static class utils extends BasePage {

        public static PolicyUtils.IO FileUtils;


        //to click on elements
        public static void ClickOnElement(By by) {
            driver.findElement(by).click();
        }

        // to enter text
        public static void enterText(By by, String text) {
            driver.findElement(by).sendKeys(text);
        }

        //to get text from element
        public static String getTextFromElement(By by) {
            return driver.findElement(by).getText();
        }

        //to select from droplist by visible text
        public static void SelectByVisibleText(By by, String name) {
            new Select(driver.findElement(by)).selectByVisibleText(name);

        }

        // to creat timestamp to use in email
        public static String timeStamp() {
            DateFormat format = new SimpleDateFormat("DDMMYYMMSS");
            return format.format(new Date());
        }

        //to wait for element to be invisible
        public static void waitForElementToBeInvisible(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }

        public static void waitForElementToBevisible(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        //to wait for a element to be display
        public static void waitForElementToBeDisplay(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
        }


        // to select from droplist by index
        public static void selectByIndex(By by, int numb) {
            new Select(driver.findElement(by)).selectByIndex(numb);
        }

        //to clear text
        public static void clearText(By by) {
            driver.findElement(by).clear();
        }

        //To open a URL in the current browser instance
        public static void get (){
            driver.get("URL");
        }
        // To check if the URL is correct
        public static void getcurrentUrl(){
            driver.getCurrentUrl();
        }

        //Various string opertons like contains () to ascertain the preesence of the specified string value
        public static void getPageSource(){
            driver.getPageSource().contains("String to find");

        }
        //To get page title in the selenium webdriver
        public static void gettitle(){
            driver.getTitle();
        }
        //To check whether the element is enabled or disabled in the selenium webdriver
        public static void enabled(){
            driver.findElement(By.xpath("")).isEnabled();
        }
        //To submit a web form or registration form
        public static void submit(By by){
            driver.findElement(by).submit();
        }
        //to varify if an eliment is actually present in the webpage
        public static void size (By by){
            driver.findElement(by).getSize();

        }
        // due to server issues or network delays
        public static void pageLoadTimeout(){
            driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
        }
        //From expected condition to wait explicitly till an alert appears.
        public static void Webdriverwait(){
            WebDriverWait wait = new WebDriverWait(driver,10);
            WebElement element = (WebElement) wait.until(ExpectedConditions.alertIsPresent());
        }
        // to navigate between the URLs
        public static void navigate (){
            driver.navigate().to("");
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();
        }
        //How to take screenshot in selenium webdriver
        public static void takescreenshot() throws IOException {
            File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //FileUtils.copyFile(shot,new File(""));
        }
        //move to element from the action class simulate mouse hover effect
        public static void moveelement(){
            Actions actions = new Actions(driver);
            WebElement mousehover = driver.findElement(By.xpath(""));
            actions.moveToElement(mousehover);
            actions.perform();
        }
        // dragAndDrop from action class to drag an element and drop it on another element
        public static void dragAndDrop(){
            WebElement sourceLocator = driver.findElement(By.xpath(""));
            WebElement destinationLocator = driver.findElement(By.xpath(""));
            Actions actions = new Actions(driver);
            actions.dragAndDrop(sourceLocator,destinationLocator).build().perform();
        }
        // switch to accept and dismiss and sendkeys methods from alert class to switch to popup alert and handle them
        public static void popup(){
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("");
            alert.accept();
            //alert.dismiss(); can be used to dosmiss the alert
        }
        //to get WindowHandle multiple windows in selenium
        //public static void MultipleWindows (){
        //String handle = driver.getWindowHandle();
        //Set<String> handle = driver.getWindowHandle();
        //driver.switchTo().window(String.valueOf(handle));}
        //}

        //to get connection from driverManager to start Database connection
        public static void Connection() throws SQLException {
            DriverManager.getConnection(URL,"","");
            //to connect to database we have to use Credintial

        }

        // public static void captureScreenshot(WebDriver driver, String screenshotname){

        //   try
        {
            //     TakesScreenshot ts = (TakesScreenshot)driver;
            //   File source = ts.getScreenshotAs(OutputType.FILE);
            // FileUtils.copyFile(source, new File("./Screenshot/"+screenshotname+".png"));
            //System.out.println("Screenshot taken");
        }
        //catch (Exception e)
        {
            //  System.out.println("Exception while taking screenshot " + e.getMessage());
        }

    }
}
