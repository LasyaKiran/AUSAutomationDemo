package apphooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import asians.base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks extends TestBase{
	
	public ApplicationHooks(){
		super();
	}

	@Before(order = 1)
	public void launchBrowser() throws Exception {
		initialization();
	}

	@After(order = 0)
	public void quitBrowser() {
		//driver.close();
		driver.quit();
	}

	
}
