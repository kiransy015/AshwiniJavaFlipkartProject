package homecomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.generic_common_method;

public class homecomponent  {
	
	WebDriver driver;
	
	public homecomponent(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	 public WebDriver getDriver() { 
		 return driver; 
	}
	 
	public void setDriver(WebDriver driver) {
		this.driver = driver; 
	}
	

	
	@FindBy(xpath="//a[contains(text(),'Login & Signup')]") WebElement Signup_btn;
	
	@FindBy(xpath="//span[contains(text(),'Electronics')]/following-sibling::ul/li/descendant::a[@title='Samsung']") WebElement samsung_btn;

	@FindBy(xpath="//input[@title='Search for products, brands and more']") WebElement search_txt;
	
	@FindBy(xpath="//span[contains(text(),'TVs & Appliances')]") WebElement tv_btn;
	
	@FindBy(xpath="//button[@type='submit']") WebElement search_btn;
	
	@FindBy(xpath="//div[@class='Y5-ZPI']/following-sibling::div[1]//div[@class='_2aUbKa']") WebElement user_txt;

	@FindBy(xpath="//*[contains(text(),'Logout')]") WebElement logout_btn;
	
	@FindBy(xpath="//*[contains(text(),'My Profile')]") WebElement MyProfile;
	
	@FindBy(xpath="//div[contains(text(),'6 GB & Above')]") WebElement RAM_select;
	
	@FindBy(xpath="//div[div[contains(text(),'Brand')]]/following-sibling::div//label/div[2]") WebElement Mi_select;
	
	@FindBy(xpath="//div[contains(text(),'4★ & above')]") WebElement Rating_select;
	
	@FindBy(xpath="//div[text()='Operating System']") WebElement OS_select;
	
	@FindBy(xpath="//div[text()='Android']") WebElement Android_select;
	
	@FindBy(xpath="//span[@class='_2yAnYN']") WebElement showing_txt;
	
	@FindBy(xpath="//span[text()='Baby & Kids']") WebElement Babykid;
	
	@FindBy(xpath="//span[text()='Baby & Kids']/following-sibling::ul/li/ul/li/ul/li") WebElement totalbabyproducts;
	
	@FindBy(xpath="//div[div[div[img[@src='https://rukminim1.flixcart.com/image/312/312/k1fbmvk0/mobile/4/f/f/mi-redmi-8-mzb8251in-original-imafhyacmxaefxgw.jpeg?q=70']]]]/following-sibling::div[2]") WebElement wishlist_btn;
	
	@FindBy(xpath="//div[text()='Wishlist']") WebElement wishlist_Select;
	
	@FindBy(xpath="//div[span[contains(text(),'My Wishlist ')]]/following-sibling::div") WebElement mywishlist;
	
	@FindBy(xpath="//img[@class='_27LgAY']") WebElement delete_btn;
	
	@FindBy(xpath="//button[text()='YES, REMOVE']") WebElement remove_btn;
	
	@FindBy(xpath="//*[contains(text(),'Removed from your Wishlist')]") WebElement removedfromwishlist;
	
	
	

	public WebElement getWishlist_Select() {
		return wishlist_Select;
	}


	public void setWishlist_Select(WebElement wishlist_Select) {
		this.wishlist_Select = wishlist_Select;
	}


	

	public WebElement getMywishlist() {
		return mywishlist;
	}


	public void setMywishlist(WebElement mywishlist) {
		this.mywishlist = mywishlist;
	}


	public WebElement getDelete_btn() {
		return delete_btn;
	}


	public void setDelete_btn(WebElement delete_btn) {
		this.delete_btn = delete_btn;
	}


	public WebElement getRemove_btn() {
		return remove_btn;
	}


	public void setRemove_btn(WebElement remove_btn) {
		this.remove_btn = remove_btn;
	}


	public WebElement getRemovedfromwishlist() {
		return removedfromwishlist;
	}


	public void setRemovedfromwishlist(WebElement removedfromwishlist) {
		this.removedfromwishlist = removedfromwishlist;
	}


	public WebElement getWishlist_btn() {
		return wishlist_btn;
	}


	public void setWishlist_btn(WebElement wishlist_btn) {
		this.wishlist_btn = wishlist_btn;
	}


	public WebElement getBabykid() {
		return Babykid;
	}


	public void setBabykid(WebElement babykid) {
		Babykid = babykid;
	}


	public WebElement getTotalbabyproducts() {
		return totalbabyproducts;
	}


	public void setTotalbabyproducts(WebElement totalbabyproducts) {
		this.totalbabyproducts = totalbabyproducts;
	}


	public WebElement getShowing_txt() {
		return showing_txt;
	}


	public void setShowing_txt(WebElement showing_txt) {
		this.showing_txt = showing_txt;
	}


	public WebElement getRAM_select() {
		return RAM_select;
	}


	public void setRAM_select(WebElement rAM_select) {
		RAM_select = rAM_select;
	}


	public WebElement getMi_select() {
		return Mi_select;
	}


	public void setMi_select(WebElement mi_select) {
		Mi_select = mi_select;
	}


	public WebElement getRating_select() {
		return Rating_select;
	}


	public void setRating_select(WebElement rating_select) {
		Rating_select = rating_select;
	}


	public WebElement getOS_select() {
		return OS_select;
	}


	public void setOS_select(WebElement oS_select) {
		OS_select = oS_select;
	}


	public WebElement getAndroid_select() {
		return Android_select;
	}


	public void setAndroid_select(WebElement android_select) {
		Android_select = android_select;
	}


	public WebElement getMyProfile() {
		return MyProfile;
	}


	public void setMyProfile(WebElement myProfile) {
		MyProfile = myProfile;
	}


	public WebElement getLogout_btn() {
		return logout_btn;
	}


	public void setLogout_btn(WebElement logout_btn) {
		this.logout_btn = logout_btn;
	}


	public WebElement getUser_txt() {
		return user_txt;
	}


	public void setUser_txt(WebElement user_txt) {
		this.user_txt = user_txt;
	}


	public WebElement getSearch_btn() {
		return search_btn;
	}


	public void setSearch_btn(WebElement search_btn) {
		this.search_btn = search_btn;
	}


	public WebElement getSignup_btn() {
		return Signup_btn;
	}


	public void setSignup_btn(WebElement signup_btn) {
		Signup_btn = signup_btn;
	}


	public WebElement getSamsung_btn() {
		return samsung_btn;
	}


	public void setSamsung_btn(WebElement samsung_btn) {
		this.samsung_btn = samsung_btn;
	}


	public WebElement getSearch_txt() {
		return search_txt;
	}


	public void setSearch_txt(WebElement search_txt) {
		this.search_txt = search_txt;
	}


	public WebElement getTv_btn() {
		return tv_btn;
	}


	public void setTv_btn(WebElement tv_btn) {
		this.tv_btn = tv_btn;
	}

	
	
}
	
	