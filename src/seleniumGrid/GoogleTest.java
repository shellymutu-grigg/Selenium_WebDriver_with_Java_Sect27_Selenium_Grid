package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void HomePageCheck() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		// capabilities.setAcceptInsecureCerts(true);
		// capabilities.setCapability("acceptInsecureCerts", "true");
		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");

		WebDriver webDriver = new RemoteWebDriver(new URL("http://192.168.1.19:4444"), capabilities);
		webDriver.get("https://www.google.com");

		System.out.println(MessageFormat.format("Website title: {0}", webDriver.getTitle()));

		webDriver.findElement(By.name("q")).sendKeys("shelly mutu-grigg");

		webDriver.close();
	}

}
