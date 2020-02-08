package carttest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cartpage.cartpage;
import homecomponent.homecomponent;
import loginPage.loginPage;
import utils.applicationspecificcommonmethod;
import utils.generic_common_method;

public class carttest extends generic_common_method {
	applicationspecificcommonmethod acm;
	homecomponent homecom;
	loginPage loginpage;
	WebDriver driver;
	cartpage cartpage;
	ArrayList testdata=new ArrayList();

	
	@BeforeMethod
	public void logintest() {
		driver = launchbroswer("https://www.flipkart.com/");	 
		acm = new applicationspecificcommonmethod();
		homecom = new homecomponent(driver);
		loginpage = new loginPage(driver);
		cartpage=new cartpage(driver);
		acm.login(loginpage,"8660040638","ashwini12345",driver);

	}
	
	
	//@Test
	public void addcart_test()
	{
		testdata.clear();
	     try {
			testdata= readdata("C:\\Users\\Ashwinidr\\Desktop\\flip\\testdata.xlsx", "Sheet1", 1);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		waittillclickable(driver, homecom.getSearch_txt());
		sendkeymethod(homecom.getSearch_txt(),testdata.get(2).toString());
		clickonelement(homecom.getSearch_btn());
		waittillclickable(driver, cartpage.getRedminote8());
		clickonelement(cartpage.getRedminote8());
		Set<String> windowid=driver.getWindowHandles();
		Iterator<String> it =windowid.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		waittillclickable(driver, cartpage.getBuynow_btn());
		clickonelement(cartpage.getBuynow_btn());
		waittillvisible(driver,cartpage.getTotalamount());
		String oneitemtotal_amt = get_text_common_method(cartpage.getTotalamount()).replace(testdata.get(3).toString(), "");
		oneitemtotal_amt = oneitemtotal_amt.replace(",", "");
		System.out.println("Total Amt :"+oneitemtotal_amt);
		int oneitemamount=Integer.parseInt(oneitemtotal_amt);		
		waittillclickable(driver, cartpage.getEdit_btn());
		clickonelement(cartpage.getEdit_btn());		
		waittillclickable(driver, cartpage.getAddress_txt());
		sendkeymethod(cartpage.getAddress_txt(), testdata.get(4).toString());		
		waittillclickable(driver, cartpage.getSaveanddeliver());
		clickonelement(cartpage.getSaveanddeliver());		
		waittillclickable(driver, cartpage.getIncrease_unit());
		int j=0;
		int count = 0;
		for(int i=1;i<=2;i++)
		{
			try {
				clickonelement(cartpage.getIncrease_unit());
		    }catch(Throwable t)
			{
		    	t.printStackTrace();
			}
		  count++;
	    }
		waittillvisible(driver, cartpage.getTotal_payable());
		String threeitemtotal_amt = get_text_common_method(cartpage.getTotal_payable()).replace("₹", "");
		threeitemtotal_amt = threeitemtotal_amt.replace(",", "");
		System.out.println("Total Amt :"+threeitemtotal_amt);
		int threeitemamount=Integer.parseInt(threeitemtotal_amt);
		System.out.println("threeitemamount"+threeitemamount);
		int total_amount=(count)*oneitemamount;
		System.out.println("total_amount"+total_amount);
		Assert.assertEquals(threeitemamount,total_amount , "amount is not equal");
		driver.close();
		driver.switchTo().window(parentwindow);
		
	}
	
	
	@Test
	public void removefromcart_test()
	{
		testdata.clear();
	     try {
			testdata= readdata("C:\\Users\\Ashwinidr\\Desktop\\flip\\testdata.xlsx", "Sheet1", 1);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		waittillclickable(driver, homecom.getSearch_txt());
		sendkeymethod(homecom.getSearch_txt(),testdata.get(2).toString());
		clickonelement(homecom.getSearch_btn());
		waittillclickable(driver, cartpage.getRedminote8());
		clickonelement(cartpage.getRedminote8());
		waittillclickable(driver, cartpage.getRedminote8());
		Set<String> windowid=driver.getWindowHandles();
		Iterator<String> it =windowid.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		waittillclickable(driver, cartpage.getAdd_to_cart());
		clickonelement(cartpage.getAdd_to_cart());
		waittillclickable(driver, cartpage.getRemove_btn());
		clickonelement(cartpage.getRemove_btn());
		waittillclickable(driver, cartpage.getRemove_popup());
		clickonelement(cartpage.getRemove_popup());
		waittillvisible(driver, cartpage.getSuccessfull_msg());
		System.out.println(get_text_common_method(cartpage.getSuccessfull_msg()));
		Assert.assertTrue(cartpage.getSuccessfull_msg().isDisplayed(), "item not removed");
		driver.close();
		driver.switchTo().window(parentwindow);
		
	}

	@AfterMethod
	public void exit() {
		waittillclickable(driver, homecom.getUser_txt());
		 movetoele(homecom.getUser_txt(), driver);
		waittillclickable(driver, homecom.getLogout_btn());
		 clickonelement(homecom.getLogout_btn());
		quit(driver);
	}
	
	
	
	
	
	
	
	
	
	
}
