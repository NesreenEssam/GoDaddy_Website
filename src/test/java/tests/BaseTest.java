package tests;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	
	public WebDriver driver;
	

	@Parameters({"url","browserType"})
	@BeforeClass(description = "Setting up selenium webdriver before each class run", alwaysRun = true)
	public void loadConfiguration(String url,String browserType)
	{

			// initialize selenium driver that is set as a config in testng.xml
			switch (browserType) {
				case ("Chrome"):
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver(setChromeOption());
					break;
				case ("Firefox"):
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver(setFireFoxOption());
					break;
				case ("IE"):
					WebDriverManager.iedriver().setup();
					driver = new InternetExplorerDriver();
					break;
				case ("Edge"):
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;
				case ("Opera"):
					WebDriverManager.operadriver().setup();
					driver = new OperaDriver();
					break;
			}


			driver.manage().window().maximize();
			driver.get(url);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	private ChromeOptions setChromeOption()
	{
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> ChromePrefs = new HashMap<>();
		ChromePrefs.put("profile.default.content_settings.popups", 0);


		ChromePrefs.put("download.default_directory", "src\\test\\resources");
		options.setExperimentalOption("prefs", ChromePrefs);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Create instance of ChromeOptions Class
		//ChromeOptions handlingSSL = new ChromeOptions();

		//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		options.setAcceptInsecureCerts(true);

		//Creating instance of Chrome driver by passing reference of ChromeOptions object
		//WebDriver driver = new ChromeDriver(options);


		return options;
	}

	private FirefoxOptions setFireFoxOption()
	{
		FirefoxOptions option = new FirefoxOptions();
		option.addPreference("browser.download.folderlist", 2);
		option.addPreference("browser.download.dir", "src\\test\\resources");
		option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");
		option.addPreference("browser.download.manager.showWhenStarting", false);
		return option;
	}


	
		}
	
	/*
	 @AfterClass
	  public void afterClass()
	 {
		 driver.close();
	 }
	*/ 
	
	
	
	


