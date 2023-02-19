package asians.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import asians.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//span[contains(text(),'Asians User System')]")
	WebElement asianUserSystemHeader;

	@FindBy(id="kc-page-title")
	WebElement signIntoAccountTitle;

	@FindBy(id="username")
	WebElement userNameInput;

	@FindBy(id="password")
	WebElement passwordInput;

	@FindBy(id="rememberMe")
	WebElement rememberMeCheckBox;

	@FindBy(id="kc-login")
	WebElement signInBtn;

	@FindBy(linkText="Forgot Password?")
	WebElement forgotPwdLink;

	@FindBy(linkText="Register")
	WebElement registerLink;

	@FindBy(id="input-error")
	WebElement inlineErrMsg;

	@FindBy(xpath="//input[@value='Submit']")
	WebElement submitBtn;

	@FindBy(xpath="//span[@class='pf-c-alert__title kc-feedback-text']")
	WebElement alertNotificationMsg;

	@FindBy(id="email")
	WebElement emailInput;

	@FindBy(id="password-confirm")
	WebElement passwordConfirmInput;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement RegisterBtn;
	
	@FindBy(xpath="//div[@id='kc-locale-dropdown']")
	WebElement languageSelectionDropdown;
	
	@FindBy(id="kc-current-locale-link")
	WebElement selectedLanguage;

	@FindBy(xpath="//div[@id='kc-locale-dropdown']/ul/li")
	List<WebElement> languages;
	
	@FindBy(xpath="//span[@class='pf-c-alert__title kc-feedback-text']")
	WebElement passordMismathErrMsg;



	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public void verifyTheHeaderOfThePage(String header) {
		String title = asianUserSystemHeader.getText();
		System.out.println(title);
		Assert.assertTrue(title.contains(header));	
	}

	public void verifyFields() {
		Assert.assertTrue(signIntoAccountTitle.isDisplayed());
		Assert.assertTrue(userNameInput.isDisplayed());
		Assert.assertTrue(passwordInput.isDisplayed());
		Assert.assertTrue(rememberMeCheckBox.isDisplayed());
		Assert.assertTrue(signInBtn.isDisplayed());
		Assert.assertTrue(forgotPwdLink.isDisplayed());
		Assert.assertTrue(registerLink.isDisplayed());
	}

	public void enterUserName(String username) {
		userNameInput.sendKeys(username);	
	}


	public void enterPassword(String password) {
		passwordInput.sendKeys(password);	
	}

	public void clickOnSignInBtn() throws InterruptedException {
		signInBtn.click();
		Thread.sleep(8000);
	}

	public void verifyInvalidLogin(String errorMsg) {
		String errorMessage = inlineErrMsg.getText();
		System.out.println(errorMessage);
		Assert.assertTrue(errorMessage.contains(errorMsg));	

	}

	public void clickOnSubmitBtn() {
		submitBtn.click();
	}

	public void verifyAlertMsg(String alertMsg) {
		String errorMessage = alertNotificationMsg.getText();
		System.out.println(errorMessage);
		Assert.assertTrue(errorMessage.contains(alertMsg));

	}

	public void clickOnForgotPwdLink() throws InterruptedException {
		forgotPwdLink.click();
		Thread.sleep(2000);
	}

	public void clickOnRegisterLink() throws InterruptedException {
		registerLink.click();
		Thread.sleep(2000);
	}

	public void clickOnRegisterBtn() throws InterruptedException {
		RegisterBtn.click();
		Thread.sleep(5000);
	}

	public void enterEmailToRegister(String email) {
		emailInput.sendKeys(email);
	}

	public void enterConfirmPassword(String password) {
		passwordConfirmInput.sendKeys(password);
	}
	
	public void clickOnLanguageDropDown(){
		languageSelectionDropdown.click();
	}
	
	public void languageSelection(String language){
		if(language.contains("japanese")){
			languages.get(0).click();
		}else if(language.contains("kr")){
			languages.get(1).click();
		}else if(language.contains("English")){
			languages.get(2).click();
		}else{
			languages.get(3).click();
		}
	}

	public void verifySelectedLanguage(String language) {
		String selectedlang = selectedLanguage.getText();
		System.out.println(selectedlang);
		Assert.assertTrue(selectedlang.contains(language));
		
	}






}
