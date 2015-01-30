package com.flickr.mobile.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import sun.security.krb5.internal.crypto.Des;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by srikanthv on 1/29/15.
 */
public class AbstractTest {

    private static AppiumDriver driver;
    private static URL serverUrl;
    private static DesiredCapabilities capabilities=new DesiredCapabilities();;

    public static DesiredCapabilities getCapabilities(){
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("bundleId","com.yahoo.flickr");
        capabilities.setCapability("udid","5e66e1067a0afea89be55a2d06322a98344023bb");
        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("platformVersion","8.1");
        capabilities.setCapability("deviceName","Srikanth Vejendla's iPhone");
        capabilities.setCapability("newCommandTimeout",60);
        return capabilities;
    }


    public static AppiumDriver getDriver() throws Exception {
        serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new IOSDriver(serverUrl,getCapabilities());
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        return driver;
    }
}
