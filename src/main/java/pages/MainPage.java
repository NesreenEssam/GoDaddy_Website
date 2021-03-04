package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage {
	
	WebDriver driver;

	public MainPage(WebDriver driver) {
		
	// Initialize web drivers
	
	    
    this.driver = driver;
    
    //Set a delay of 10 secs to wait for elements' visibility
    AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
    PageFactory.initElements(factory, this);

}
}
