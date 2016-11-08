package com.entelgy.bbmafre.bbmafretest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import junit.framework.Assert;
//import utils.CapabilityBuild;

public class SocorroParaPaneTest {


	public AndroidDriver buildDriver(){
		File appDir = new File(System.getProperty("user.dir")+"/app/");
		File app = new File(appDir, "MAPFRE-QA-009.apk");

		DesiredCapabilities capa = new DesiredCapabilities();
		capa.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capa.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capa.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capa.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capa.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		//capa.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "br.com.mapfre.mobilesinistroassistencia");
		//capa.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.sec.android.app.launcher"); 	
		//com.sec.android.app.launcher
		//capa.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "br.com.correiam.checkmeta.LoginActivity");

		AndroidDriver driver = null;
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capa);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

   /*
	@Given("^não estou logado no aplicativo$")
	public void não_estou_logado_no_aplicativo() throws Throwable {
		AndroidDriver driver = buildDriver();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.view.ViewGroup[2]").click();
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		String actual = driver.findElementByXPath("//android.widget.TextView[@text='Para acessar, por favor informe:']").getText();
		Assert.assertEquals("Para acessar, por favor informe:", actual);
		driver.findElementByXPath("//android.widget.EditText[1]").sendKeys("22950204848");
		driver.navigate().back();
		driver.findElementByXPath("//android.widget.EditText[@text='dd/mm/aaaa']").sendKeys("01011970");


		//driver.findElementByXPath("//android.widget.ImageView[1]").click();
		//driver.findElementByXPath("//android.widget.ViewGroup[5]").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='Fale com a MAPFRE']").click();

	}

	@Given("^desejo solicitar socorro$")
	public void desejo_solicitar_socorro() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@When("^eu clicar no menu \"([^\"]*)\"$")
	public void eu_clicar_no_menu(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Then("^a tela de login deve ser exibida$")
	public void a_tela_de_login_deve_ser_exibida() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}


	@Given("^estou logado no aplicativo$")
	public void estou_logado_no_aplicativo() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Then("^a tela da cor do carr será exibida$")
	public void a_tela_da_cor_do_carr_será_exibida() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}
*/

}
