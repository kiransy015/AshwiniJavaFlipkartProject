package utils;

import org.openqa.selenium.WebDriver;

import homecomponent.homecomponent;
import loginPage.loginPage;

public class applicationspecificcommonmethod extends generic_common_method {

	
	public static void login(loginPage loginPage,String username,String password, WebDriver driver) {
		sendkeymethod(loginPage.getUsername_txt(), username);
		sendkeymethod(loginPage.getPwd_txt(), password);
		waittillclickable(driver, loginPage.getLogin_btn());
		clickonelement(loginPage.getLogin_btn());
		
	
	 }
	 

}
