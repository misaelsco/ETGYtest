package com.entelgy.bbmafre.bbmafretest;

import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.entelgy.bbmafre.bbmafretest.util.Helper;
import com.entelgy.bbmafre.bbmafretest.util.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MinhasSolicitacoesTest {

	private AppiumDriver<MobileElement> driver;
	Helper menuHelper;
	Utils util;
	
	@Before
	public void setUp() throws MalformedURLException{
		menuHelper = new Helper();
		util = new Utils();
		
		File appDir = new File(System.getProperty("user.dir")+"/app/");
		File app = new File(appDir, "MAPFRE-QA-014.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		try {
			menuHelper.clickOnCancelDebug(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void acesso_deslogado_ao_menu_minhas_solicitacoes() throws InterruptedException
	{
		try {
			//menuHelper.doLogout(driver);
		} catch (Exception e) {
			// TODO: handle exception
		}
		menuHelper.clickOnMenu(driver);
		menuHelper.clickOnMinhasSolicitacoesOption(driver);
		String teste= driver.findElementByXPath("//android.widget.TextView[0]").getText();
		System.out.println(teste);
		assertEquals("Para acessar, por favor informe:", teste);
		//assertEquals("Acesso", driver.findElementByXPath("//android.widget.TextView[0]").getText());
		
	}
	
    public void testScreenshot() {
        //make screenshot and get is as base64
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        String screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BASE64);

        assertNotNull(screenshot);
        //make screenshot and save it to the local filesystem
        File file = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
        assertNotNull(file);
    }
}
