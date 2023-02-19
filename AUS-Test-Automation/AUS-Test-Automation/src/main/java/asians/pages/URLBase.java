package asians.pages;

import asians.base.TestBase;

public class URLBase extends TestBase{
	public URLBase(){
		super();
	}
	
	public void navigateToAsiansUserSystem() throws InterruptedException{
		driver.get(prop.getProperty("url"));
		Thread.sleep(20000);
	}
}
