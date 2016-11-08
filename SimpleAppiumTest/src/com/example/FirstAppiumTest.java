package com.example;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstAppiumTest {

	AppiumDriver driver;

	@BeforeClass
	public void Setup(){
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
	    cap.setCapability("appPac", "com.whatsapp");
	}

	@Test
	public void SimpleTest() {
		
	}
}
