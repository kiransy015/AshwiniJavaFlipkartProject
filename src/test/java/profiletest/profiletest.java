package profiletest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import homecomponent.homecomponent;
import loginPage.loginPage;
import profilepage.profilepage;
import utils.applicationspecificcommonmethod;
import utils.generic_common_method;

public class profiletest extends generic_common_method {
	
	
	applicationspecificcommonmethod acm;
	homecomponent homecom;
	loginPage loginpage;
	WebDriver driver;
	profilepage profilepage;
	ArrayList testdata=new ArrayList();

	//@BeforeMethod
	public void logintest() {
		driver = launchChromebroswer("https://www.flipkart.com/");	 
		acm = new applicationspecificcommonmethod();
		homecom = new homecomponent(driver);
		loginpage = new loginPage(driver);
        profilepage=new profilepage(driver);

		acm.login(loginpage,"8197932512","ashwini12345",driver);

	}
	
	
  //@Test
  public void validprofile_Test() {
		  testdata.clear();
		     try {
				testdata= readdata("C:\\Users\\Ashwinidr\\Desktop\\flip\\testdata.xlsx", "Sheet1", 1);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	    waittillclickable(driver, homecom.getUser_txt());
		movetoele(homecom.getUser_txt(), driver);
        System.out.println(get_text_common_method(homecom.getUser_txt()));
        clickonelement(homecom.getMyProfile());
        waittillvisible(driver, profilepage.getEmailaddress());
	    System.out.println(get_attribute_commonmethod(profilepage.getEmailaddress(),testdata.get(2).toString()));
        Assert.assertEquals(get_attribute_commonmethod(profilepage.getEmailaddress(),testdata.get(3).toString()), testdata.get(4).toString(), "email id is not matching");
        waittillvisible(driver, profilepage.getMobilenumber());
        System.out.println(get_attribute_commonmethod(profilepage.getMobilenumber(),testdata.get(5).toString()));
        Assert.assertEquals(get_attribute_commonmethod(profilepage.getMobilenumber(),testdata.get(6).toString()),testdata.get(7).toString(), "mobile number is not matching");
  }
  
  //@Test
  public void walletamount_test()
  {
	    waittillclickable(driver, homecom.getUser_txt());
		movetoele(homecom.getUser_txt(), driver);
        System.out.println(get_text_common_method(homecom.getUser_txt()));
        clickonelement(homecom.getMyProfile()); 
        waittillclickable(driver, profilepage.getPhonepay_wallet());
        System.out.println("phone pay wallet amount="+get_text_common_method(profilepage.getPhonepay_wallet()));
        waittillclickable(driver, profilepage.getGift_card());
        System.out.println("gift card amount="+get_text_common_method(profilepage.getGift_card()));
	  
	  
	  
  }
  
  

  
  
  
  //@AfterMethod
	public void exit() {
		waittillclickable(driver, homecom.getLogout_btn());
		clickonelement(homecom.getLogout_btn());
		quit(driver);
	}

  
  
  
  
  
}
