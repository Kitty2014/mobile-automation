package com.flickr.mobile.qa.utils;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/**
 * Created by srikanthv on 1/29/15.
 */
public abstract class AbstractPage {

    protected static AppiumDriver driver;

    public AbstractPage(AppiumDriver driver) {
        this.driver = driver;
    }

    protected boolean isElementPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void takeScreenShot(String fileName) {
        File file = new File(fileName+".png");
        File tmpFile = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(tmpFile, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
