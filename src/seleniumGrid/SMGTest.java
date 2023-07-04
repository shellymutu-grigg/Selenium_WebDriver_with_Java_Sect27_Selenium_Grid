package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SMGTest {

	@Test
	public void HomePageCheck() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		// capabilities.setAcceptInsecureCerts(true);
		// capabilities.setCapability("acceptInsecureCerts", "true");
		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");

		WebDriver webDriver = new RemoteWebDriver(new URL("http://192.168.1.19:4444"), capabilities);
		webDriver.get("https://www.shellymutugrigg.com");

		System.out.println(MessageFormat.format("Website title: {0}", webDriver.getTitle()));

		webDriver.close();
	}

}
