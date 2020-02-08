package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	 public WebDriver getDriver() { 
		 return driver; 
	}
	 
	public void setDriver(WebDriver driver) {
		this.driver = driver; 
	}

	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']") WebElement username_txt;
	
	@FindBy(xpath="//input[@type='password']") WebElement pwd_txt;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']") WebElement login_btn;
	
	
    @FindBy(xpath="//span[text()='Please enter valid Email ID/Mobile number']") WebElement invalid_login_txt;
    

    @FindBy(xpath="//a[text()='Login & Signup']") WebElement login_or_signup_text;
    
    

	public WebElement getLogin_or_signup_text() {
		return login_or_signup_text;
	}


	public void setLogin_or_signup_text(WebElement login_or_signup_text) {
		this.login_or_signup_text = login_or_signup_text;
	}


	public WebElement getInvalid_login_txt() {
		return invalid_login_txt;
	}


	public void setInvalid_login_txt(WebElement invalid_login_txt) {
		this.invalid_login_txt = invalid_login_txt;
	}



	public WebElement getUsername_txt() {
		return username_txt;
	}


	public void setUsername_txt(WebElement username_txt) {
		this.username_txt = username_txt;
	}


	public WebElement getPwd_txt() {
		return pwd_txt;
	}


	public void setPwd_txt(WebElement pwd_txt) {
		this.pwd_txt = pwd_txt;
	}


	public WebElement getLogin_btn() {
		return login_btn;
	}


	public void setLogin_btn(WebElement login_btn) {
		this.login_btn = login_btn;
	}

	
	
}
