package profilepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilepage {


		
		WebDriver driver;
		
		public profilepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		 public WebDriver getDriver() { 
			 return driver; 
		}
		 
		public void setDriver(WebDriver driver) {
			this.driver = driver; 
		}
		
		@FindBy(xpath="//input[@name='email']") WebElement emailaddress;
		
		@FindBy(xpath="//input[@name='mobileNumber']") WebElement mobilenumber;
		
		@FindBy(xpath="//div[text()='PhonePe Wallet']/span") WebElement Phonepay_wallet;
		
		@FindBy(xpath="//div[text()='Gift Cards']/span") WebElement Gift_card;
		
		

		public WebElement getPhonepay_wallet() {
			return Phonepay_wallet;
		}


		public void setPhonepay_wallet(WebElement phonepay_wallet) {
			Phonepay_wallet = phonepay_wallet;
		}


		public WebElement getGift_card() {
			return Gift_card;
		}


		public void setGift_card(WebElement gift_card) {
			Gift_card = gift_card;
		}


		public WebElement getEmailaddress() {
			return emailaddress;
		}


		public void setEmailaddress(WebElement emailaddress) {
			this.emailaddress = emailaddress;
		}


		public WebElement getMobilenumber() {
			return mobilenumber;
		}


		public void setMobilenumber(WebElement mobilenumber) {
			this.mobilenumber = mobilenumber;
		}
		
		
		
		
		
}
	
	
	

