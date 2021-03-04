package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MainPage {

	//invoke parent's constructor
    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    
 // Initialize web elements
    @FindBy(xpath = "//span[contains(text(),'Sign In')]")
    public WebElement signInItem;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    public WebElement signInBtn;

    @FindBy(xpath = "//a[contains(text(),'Create My Account')]")
    public WebElement  createMyAccountBtn;

 // SignIn Module
    public void selectSignInMenuLink()
    {
        if(!signInItem.getAttribute("class").equalsIgnoreCase("open"))
        	signInItem.sendKeys(Keys.RETURN);
    }
    
    
    public void navigateToLoginPage()
    {
        selectSignInMenuLink();
        signInBtn.click();
    }
    
    public void navigateToRegisterationPage()
    {
        selectSignInMenuLink();
        createMyAccountBtn.click();
    }
    
    
    
}
