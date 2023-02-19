package stepdefinitions.pages;

import asians.base.TestBase;
import asians.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends TestBase{
	
	private LoginPage loginPage = new LoginPage();
	
	public LoginPageSteps(){
		super();
	}
	
	@Then("Verify the header {string}")
	public void verify_the_header(String header){
		loginPage.verifyTheHeaderOfThePage(header);
	}
	
	@Then("Verify all fields in login page")
	public void verify_the_fields_in_login_page(){
		loginPage.verifyFields();
	}
	
	@When("User Enter username {string}")
	public void user_enter_username(String username){
		loginPage.enterUserName(username);
	}
	
	@When("User Enter Password {string}")
	public void user_enter_password(String password){
		loginPage.enterPassword(password);
	}
	
	@When("Click on Sign In button")
	public void click_on_SignIn_button() throws InterruptedException{
		loginPage.clickOnSignInBtn();
	}
	
	@Then("Verify the inline error message {string}")
	public void verify_inline_error_mesage(String errMsg){
		loginPage.verifyInvalidLogin(errMsg);
	}
	
	@When("User clicks on forgot password link")
	public void user_clicks_on_forgot_password() throws InterruptedException{
		loginPage.clickOnForgotPwdLink();
	}
	
	@When("User clicks on Submit button")
	public void user_clicks_on_submit_Button(){
		loginPage.clickOnSubmitBtn();
	}
	
	@Then("Verify the message {string}")
	public void verify_the_message(String alertMsg){
		loginPage.verifyAlertMsg(alertMsg);
	}
	
	@When("User clicks on register link")
	public void user_clicks_on_register_link() throws InterruptedException{
		loginPage.clickOnRegisterLink();
	}
	
	@When("User clicks on Register button")
	public void user_clicks_on_Register_Button() throws InterruptedException{
		loginPage.clickOnRegisterBtn();
	}
	
	@When("User Enter Email {string}")
	public void user_enter_email(String email){
		loginPage.enterEmailToRegister(email);
	}
	
	@When("User Enter Confirm Password {string}")
	public void user_enter_confirm_password(String password){
		loginPage.enterConfirmPassword(password);
	}
	
	@When("user clicks on language selection dropdown")
	public void user_clicks_on_language_dropdown(){
		loginPage.clickOnLanguageDropDown();
	}
	
	@When("user selects {string} language")
	public void user_select_language(String language){
		loginPage.languageSelection(language);
	}
	
	@Then("verify the language {string}")
	public void verify_language(String language){
		loginPage.verifySelectedLanguage(language);
	}

}
