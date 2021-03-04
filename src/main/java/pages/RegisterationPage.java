package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ReadingCredentialFromExceel;

public class RegisterationPage extends MainPage {

	public RegisterationPage(WebDriver driver) {
		super(driver);


	}
	
	
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="username")
	WebElement userName;
	@FindBy(id="new-password")
	WebElement password;
	@FindBy(id="consent-accept-button")
	WebElement agreeBtn;
	@FindBy(id="submitBtn")
	WebElement createAccountBtn;
	
	
	
	
	public void  registeration() throws IOException
	{
		String userMail = ReadingCredentialFromExceel.ReadingData(1, 1);
		String usrName = ReadingCredentialFromExceel.ReadingData(1, 2);
		String passwd = ReadingCredentialFromExceel.ReadingData(1, 3);
		
		    email.sendKeys(userMail);
			userName.sendKeys(usrName);
			password.sendKeys(passwd);
			agreeBtn.click();
			createAccountBtn.click();      
	



}
}
