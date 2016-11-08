package com.entelgy.test.appiumtest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MyFirstAppiumDriveTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		File appDir = new File(System.getProperty("user.dir")+"/app/");
		File app = new File(appDir, "app-debug.apk");
		
		DesiredCapabilities capa = new DesiredCapabilities();
		capa.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capa.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capa.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capa.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capa.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		capa.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "br.com.correiam.checkmeta");
		capa.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "br.com.correiam.checkmeta.SplashActivity"); 	
		
		capa.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "br.com.correiam.checkmeta.LoginActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capa);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		
		//Verifica logo da splash screen
        String app_package_name = "br.com.correiam.checkmeta:id/";

		
		
		
		
		
		By txtEmail = By.id("etEmail");
		driver.findElement(txtEmail).sendKeys("misaelsco@gmail.com");
		By txtSenha = By.id("etPassword");
		driver.findElement(txtSenha).sendKeys("000000-m");
		driver.navigate().back();
		driver.findElementById(app_package_name + "btnLogin").click();
		
		
		
		System.out.println("teste finalizado");
	}


}
 