package com.entelgy.bbmafre.bbmafretest.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Utils {
	
	public void takeScreenshot(AppiumDriver<MobileElement> driver, String testName){
		String imagesLocation = "target/surefire-reports/screenshot/";
	    new File(imagesLocation).mkdirs(); // Insure directory is there
	    String filename = imagesLocation + testName + ".jpg";
	    try {
	        Thread.sleep(1000);
	        WebDriver augmentedDriver = new Augmenter().augment(driver);
	        File scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File(filename), true);
	    } catch (Exception e) {
	        System.out.println("Error while capturing screenshot of test failure.");
	        // remove old pic to prevent wrong assumptions
	        File f = new File(filename);
	        f.delete(); // don't really care if this doesn't succeed, but would like it to.
	    }
	}

}
