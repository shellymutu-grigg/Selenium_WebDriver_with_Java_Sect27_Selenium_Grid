package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void HomePageCheck() throws MalformedURLException {

		// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// capabilities.setBrowserName("chrome");
		// capabilities.setAcceptInsecureCerts(true);
		// capabilities.setCapability("acceptInsecureCerts", "true");
		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		WebDriver webDriver = new RemoteWebDriver(new URL("http://192.168.1.19:4444"), options);
		webDriver.get("https://www.google.com");

		System.out.println(MessageFormat.format("Website title: {0}", webDriver.getTitle()));

		webDriver.findElement(By.name("q")).sendKeys("shelly mutu-grigg");

		webDriver.close();
	}

}
