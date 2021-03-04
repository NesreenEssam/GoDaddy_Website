package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegisterationPage;



public class RegisterationTests /*extends BaseTest */{
	
	WebDriver driver;
/*
	@BeforeMethod(alwaysRun = true)
	//@Parameters("url")
	public void goToHomePage()
	{
		driver.navigate().to("www.godaddy.com");
	}
	*/
		  
  @Test
	public void register() throws IOException
  {
	  driver.manage().window().maximize();
	  driver.navigate().to("www.godaddy.com");
	  // initialize an object of login page
	  RegisterationPage registerPage = new RegisterationPage(driver);
	  
	  registerPage.registeration();
/*
	  // call login method and capture the displayed message on screen
	  String actual= registerPage.registeration(registerObj);


	  ///Happy scenario verifications. Check that browser is navigated to home page
	  if(actual.equals(GeneralConstants.SUCCESS) && loginObject.getExpectedMessage().trim().equalsIgnoreCase(GeneralConstants.SUCCESS))
			AssertJUnit.assertEquals(homepage.getWelcomeMsg(),"Domains", loginObject.getTestCaseTitle() + " " + GeneralConstants.FAILED);
			


	  //Negative scenarios verifications on validation error messages
	  else {
		  Assert.assertTrue(actual.equalsIgnoreCase(loginObject.getExpectedMessage().trim()) , loginObject.getTestCaseTitle() + " " + GeneralConstants.FAILED);
	  */
	}


 


  @BeforeClass
  public void beforeClass()
 {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driiver\\chromedriver.exe");
	  //WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	  
  }
	
	


}