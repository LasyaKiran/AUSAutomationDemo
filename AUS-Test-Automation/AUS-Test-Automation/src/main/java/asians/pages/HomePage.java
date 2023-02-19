package asians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import asians.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Vue logo']")
	WebElement logo;

	public void verifyAsianGroupsLogo() {
		Assert.assertTrue(logo.isDisplayed());
		
	}

}
