package cartpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {

	
	
	WebDriver driver;
	
	public cartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	 public WebDriver getDriver() { 
		 return driver; 
	}
	 
	public void setDriver(WebDriver driver) {
		this.driver = driver; 
	}
	
	@FindBy(xpath="//div[text()='Redmi Note 8 (Moonlight White, 128 GB)']") WebElement Redminote8;
	
	@FindBy(xpath="//button[text()='BUY NOW']") WebElement Buynow_btn;
	
	@FindBy(xpath="//button[text()='EDIT']") WebElement edit_btn;
	
	@FindBy(xpath="//textarea[@name='addressLine1']") WebElement address_txt;
	
	@FindBy(xpath="//button[text()='Save and Deliver Here']") WebElement saveanddeliver;
	
	@FindBy(xpath="//div[@class='_3xFQAD']/div//div[@class='_3GoQc2']") WebElement totalamount;
	
	@FindBy(xpath="//button[text()='+']") WebElement increase_unit;
	
	@FindBy(xpath="//div[text()='Total Payable']/following-sibling::span") WebElement total_payable;
	
	@FindBy(xpath="//button[text()='GO TO CART']") WebElement gotocart_btn;
	
	@FindBy(xpath="//span[text()='Cart']") WebElement carticon_btn;
	
	@FindBy(xpath="//button[text()='ADD TO CART']") WebElement Add_to_cart;
	
	@FindBy(xpath="//span[text()='Cart']") WebElement cart_btn;
	
	@FindBy(xpath="//div[text()='Remove']") WebElement remove_btn;
	
	@FindBy(xpath="//div[@class='gdUKd9 _3Z4XMp _2nQDKB']") WebElement remove_popup;
	
	@FindBy(xpath="//div[contains(text(),'Successfully removed')]") WebElement successfull_msg;
	
	
	

	public WebElement getAdd_to_cart() {
		return Add_to_cart;
	}


	public void setAdd_to_cart(WebElement add_to_cart) {
		Add_to_cart = add_to_cart;
	}


	public WebElement getCart_btn() {
		return cart_btn;
	}


	public void setCart_btn(WebElement cart_btn) {
		this.cart_btn = cart_btn;
	}


	public WebElement getRemove_btn() {
		return remove_btn;
	}


	public void setRemove_btn(WebElement remove_btn) {
		this.remove_btn = remove_btn;
	}


	public WebElement getRemove_popup() {
		return remove_popup;
	}


	public void setRemove_popup(WebElement remove_popup) {
		this.remove_popup = remove_popup;
	}


	public WebElement getSuccessfull_msg() {
		return successfull_msg;
	}


	public void setSuccessfull_msg(WebElement successfull_msg) {
		this.successfull_msg = successfull_msg;
	}


	public WebElement getGotocart_btn() {
		return gotocart_btn;
	}


	public void setGotocart_btn(WebElement gotocart_btn) {
		this.gotocart_btn = gotocart_btn;
	}


	public WebElement getCarticon_btn() {
		return carticon_btn;
	}


	public void setCarticon_btn(WebElement carticon_btn) {
		this.carticon_btn = carticon_btn;
	}


	public WebElement getTotal_payable() {
		return total_payable;
	}


	public void setTotal_payable(WebElement total_payable) {
		this.total_payable = total_payable;
	}


	public WebElement getBuynow_btn() {
		return Buynow_btn;
	}


	public void setBuynow_btn(WebElement buynow_btn) {
		Buynow_btn = buynow_btn;
	}


	public WebElement getEdit_btn() {
		return edit_btn;
	}


	public void setEdit_btn(WebElement edit_btn) {
		this.edit_btn = edit_btn;
	}


	public WebElement getAddress_txt() {
		return address_txt;
	}


	public void setAddress_txt(WebElement address_txt) {
		this.address_txt = address_txt;
	}


	public WebElement getSaveanddeliver() {
		return saveanddeliver;
	}


	public void setSaveanddeliver(WebElement saveanddeliver) {
		this.saveanddeliver = saveanddeliver;
	}


	public WebElement getTotalamount() {
		return totalamount;
	}


	public void setTotalamount(WebElement totalamount) {
		this.totalamount = totalamount;
	}


	public WebElement getIncrease_unit() {
		return increase_unit;
	}


	public void setIncrease_unit(WebElement increase_unit) {
		this.increase_unit = increase_unit;
	}


	public WebElement getRedminote8() {
		return Redminote8;
	}


	public void setRedminote8(WebElement redminote8) {
		Redminote8 = redminote8;
	}
	
	
	
	
	
	
	
	
	
	
	
}
