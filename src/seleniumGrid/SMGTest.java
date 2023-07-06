package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SMGTest {

	@Test
	public void HomePageCheck() throws MalformedURLException {

		// DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setBrowserName("firefox");
		// capabilities.setAcceptInsecureCerts(true);
		// capabilities.setCapability("acceptInsecureCerts", "true");
		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");

		ChromeOptions options = new ChromeOptions();

		WebDriver webDriver = new RemoteWebDriver(new URL("http://192.168.1.19:4444"), options);
		webDriver.get("https://www.shellymutugrigg.com");

		System.out.println(MessageFormat.format("Website title: {0}", webDriver.getTitle()));

		webDriver.close();
	}

}
