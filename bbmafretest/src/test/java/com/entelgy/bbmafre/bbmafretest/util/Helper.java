package com.entelgy.bbmafre.bbmafretest.util;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Helper {

	public void clickOnMenu(AppiumDriver<MobileElement> driver) throws InterruptedException{

		Thread.sleep(5000);
		System.out.println("Clicando no menu");
		driver.findElementByXPath("//android.widget.ImageView[1]").click();
	}
	
	public void clickOnCancelDebug(AppiumDriver<MobileElement> driver) throws InterruptedException{
		Thread.sleep(5000);
		try{

			driver.findElementById("button2").click();
		}catch (Exception e) {
			
		}
		
	}

	public void clickOnHomeOption(AppiumDriver<MobileElement> driver) throws InterruptedException{

		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.TextView[@text='Home']").click();

	}

	public void clickOnPaneOption( AppiumDriver<MobileElement> driver) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.name("Socorro para pane")).click();
	}
	
	
	public void clickOnMinhasSolicitacoesOption( AppiumDriver<MobileElement> driver) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@text='Minhas solicitações']").click();
	}
	
	
	public void doLogout(AppiumDriver<MobileElement> driver) throws InterruptedException{
		clickOnMenu(driver);
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.TextView[@text='Sair']").click();
	}
	
	public void doLogin(AppiumDriver<MobileElement> driver) throws InterruptedException{
		clickOnMenu(driver);
		Thread.sleep(1000);
		clickOnPaneOption(driver);
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.EditText[1]").sendKeys("67546033640");
		driver.navigate().back();
		driver.findElementByXPath("//android.widget.EditText[@text='dd/mm/aaaa']").sendKeys("01011970");
	}



}
