package stepdefinitions.pages;

import asians.base.TestBase;
import asians.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomePageSteps extends TestBase{
	
	HomePage homePage = new HomePage();
	public HomePageSteps(){
		super();
	}
	
	@Then("Verify asian grous logo in home page")
	public void verify_asiangroups_logo(){
		homePage.verifyAsianGroupsLogo();
	}

}
