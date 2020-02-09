package loginTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import homecomponent.homecomponent;
import loginPage.loginPage;
import utils.Environmentdata;
import utils.applicationspecificcommonmethod;
import utils.generic_common_method;

public class loginTest extends generic_common_method{
	
	applicationspecificcommonmethod acm;
	homecomponent homecom;
	loginPage loginpage;
	WebDriver driver;
	ArrayList testdata=new ArrayList();
	Environmentdata endata=new Environmentdata();
	
	@Parameters({"portalurl","portalusername","portalpassword"})
	@BeforeTest
	public void initialize(String portalurl,String portalusername,String portalpassword)
	{
		
		endata.setPortalurl(portalurl);
		endata.setPortalusername(portalusername);
		endata.setPortalpassword(portalpassword);
		
	}
	
	
	@BeforeMethod
	public void setup()
	{
		driver = launchChromebroswer(endata.getPortalurl());
		acm = new applicationspecificcommonmethod();
		homecom = new homecomponent(driver);
		loginpage = new loginPage(driver);
		//loginpage.getUsername_txt().sendKeys("kiran");
		
		
	}
	
  @Test(priority=1)
  public void validlogin_test()
  {
		     testdata.clear();
		     try {
				testdata= readdata("C:\\Users\\Ashwinidr\\Desktop\\flip\\testdata.xlsx", "Sheet1", 1);
			} catch (Throwable e) {
				e.printStackTrace();
			}
			 acm.login(loginpage,endata.getPortalusername(),endata.getPortalpassword(),driver);	
			 waittillclickable(driver, homecom.getUser_txt());
			 System.out.println(get_text_common_method(homecom.getUser_txt()));
			 waittillclickable(driver, homecom.getUser_txt());
			 movetoele(homecom.getUser_txt(), driver);
			 waittillclickable(driver, homecom.getLogout_btn());
			 clickonelement(homecom.getLogout_btn());
			 waittillclickable(driver, loginpage.getLogin_btn());
			 //System.out.println(get_text_common_method(loginpage.getLogin_or_signup_text()));
			 //Assert.assertEquals(get_text_common_method(loginpage.getLogin_or_signup_text()), testdata.get(3).toString(), "Both are not equal");
			 //Assert.assertTrue("Ashwini".equalsIgnoreCase(txt), "Both are not equal");
			 Assert.assertTrue(loginpage.getLogin_btn().isDisplayed(), "Login Btn is not displayed");
			 
			 
 
   }
  
  
  @Test(priority=2)
  public void invalidlogin_test()
  {
	      testdata.clear();
	      try {
			testdata= readdata("C:\\Users\\Ashwinidr\\Desktop\\flip\\testdata.xlsx", "Sheet1", 2);
		  } catch (Throwable e) {
			e.printStackTrace();
		 }
		 acm.login(loginpage,testdata.get(2).toString(),testdata.get(3).toString(),driver); 
		 waittillclickable(driver, loginpage.getInvalid_login_txt());
		 System.out.println(get_text_common_method(loginpage.getInvalid_login_txt()));
		 Assert.assertEquals(get_text_common_method(loginpage.getInvalid_login_txt()), testdata.get(4).toString(), "email id is valid");
		 
  }

  
  @AfterMethod
  public void teardown()
  {
	  driver.quit();
  }
  
  
}
