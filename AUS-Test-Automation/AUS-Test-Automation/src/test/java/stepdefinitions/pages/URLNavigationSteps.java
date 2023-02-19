package stepdefinitions.pages;

import asians.base.TestBase;
import asians.pages.URLBase;
import io.cucumber.java.en.Given;

public class URLNavigationSteps extends TestBase{
	private URLBase urlBase = new URLBase();
	public URLNavigationSteps(){
		super();
	}
	
	@Given("User navigate to Asians Group URL")
	public void user_navigate_to_my_url() throws Exception {
		urlBase.navigateToAsiansUserSystem();
	}

}
