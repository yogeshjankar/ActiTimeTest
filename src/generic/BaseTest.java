package generic;

import java.io.IOException;
import java.time.Duration;

import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {


	 protected static WebDriver driver;

	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyFile(PROP_PATH, "browser");
		String url = flib.readPropertyFile(PROP_PATH, "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get(url);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get(url);
		}

		else
		{
			Reporter.log("Enter corect choice", true);
		}

	}

	// closes the browser
	public void tearDown()
	{
		driver.quit();
	}
	
	

}

