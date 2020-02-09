package hometest;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

public class home_test extends generic_common_method {

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
	public void logintest() {
		driver = launchChromebroswer(endata.getPortalurl());	 
		acm = new applicationspecificcommonmethod();
		homecom = new homecomponent(driver);
		loginpage = new loginPage(driver);
		acm.login(loginpage,endata.getPortalusername(),endata.getPortalpassword(),driver);

	}
	
	

	@Test(priority=1)
	public void search_test() {
		testdata.clear();
	     try {
			testdata= readdata("C:\\Users\\Ashwinidr\\Desktop\\flip\\testdata.xlsx", "Sheet1", 3);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		waittillclickable(driver, homecom.getSearch_txt());
		sendkeymethod(homecom.getSearch_txt(),testdata.get(2).toString());
		clickonelement(homecom.getSearch_btn());
		waittillclickable(driver, homecom.getRAM_select());
		clickonelement(homecom.getRAM_select());
		waittillclickable(driver, homecom.getMi_select());
		clickonelement(homecom.getMi_select());
		waittillclickable(driver, homecom.getRating_select());
		clickonelement(homecom.getRating_select());
		waittillclickable(driver, homecom.getOS_select());
		movetoele(homecom.getOS_select(), driver);
		clickonelement(homecom.getOS_select());
		waittillclickable(driver, homecom.getAndroid_select());
		clickonelement(homecom.getAndroid_select());
		
		try {
			Thread.sleep(5000);
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		
		String searchcount = get_text_common_method(homecom.getShowing_txt());
		String[] arr = searchcount.split("– ");
		String arr1[] = arr[1].split(" of");
		System.out.println("Search list count :"+arr1[0]);

		List<WebElement> lst=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		
		Assert.assertEquals(lst.size(), Integer.parseInt(arr1[0]), "elements are not equal");
	
		for(int i=0;i<lst.size();i++)
		{
			 
			 waittillclickable(driver, lst.get(i));
			 movetoele(lst.get(i),driver);
			 System.out.println("Item no :"+i+" "+get_text_common_method(lst.get(i)));

		}
		
		 
	}
	
	
	@Test(priority=2)
	public void babycare_test()
	{
		waittillclickable(driver, homecom.getBabykid());
		movetoele(homecom.getBabykid(), driver);
		clickonelement(homecom.getBabykid());
		waittillvisible(driver, homecom.getTotalbabyproducts());
		List<WebElement> lst=driver.findElements(By.xpath("//span[text()='Baby & Kids']/following-sibling::ul/li/ul/li/ul/li"));
		for(int i=0;i<lst.size();i++)
		{
			 waittillclickable(driver, lst.get(i));
			 movetoele(lst.get(i),driver);
			 System.out.println("Item no :"+i+" "+get_text_common_method(lst.get(i)));

		}
		
	}
	
	@Test(priority=3)
	public void mobiledet_test()
	{
		testdata.clear();
	     try {
			testdata= readdata("C:\\Users\\Ashwinidr\\Desktop\\flip\\testdata.xlsx", "Sheet1", 4);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		waittillclickable(driver, homecom.getSearch_txt());
		sendkeymethod(homecom.getSearch_txt(),testdata.get(2).toString());
		clickonelement(homecom.getSearch_btn());
		
		
		 try { 
			 Thread.sleep(3000); 
			 } 
		 catch (InterruptedException e) 
		 {
			 
			 e.printStackTrace();
		 }
		 
		 
		
		List<WebElement> lst=driver.findElements(By.xpath("(//div[contains(text(),'Redmi 8 (Ruby Red, 64 GB)')])[1]/following-sibling::div/ul/li"));

		for(int i=0;i<lst.size();i++)
		{
			 waittillclickable(driver, lst.get(i));
			 movetoele(lst.get(i),driver);
			 System.out.println("Item no :"+i+" "+get_text_common_method(lst.get(i)));

		}
	}
	
	@Test(priority=4)
	public void trending_test()
	{
		waittillclickable(driver, homecom.getSearch_txt());
		movetoele(homecom.getSearch_txt(), driver);
		clickonelement(homecom.getSearch_txt());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> lst=driver.findElements(By.xpath("//li[div[div[div[div[text()='Trending']]]]]/following-sibling::li"));
		
		for(int i=0;i<lst.size();i++)
		{
			 waittillclickable(driver, lst.get(i));
			 movetoele(lst.get(i),driver);
			 System.out.println("Item no :"+i+" "+get_text_common_method(lst.get(i)));

		}
		
	}
	
	
	@Test(priority=5)
	public void wishlist_test()
	{
		testdata.clear();
	     try {
			testdata= readdata("C:\\Users\\Ashwinidr\\Desktop\\flip\\testdata.xlsx", "Sheet1", 5);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		waittillclickable(driver, homecom.getSearch_txt());
		sendkeymethod(homecom.getSearch_txt(),testdata.get(2).toString());
		clickonelement(homecom.getSearch_btn());
		waittillclickable(driver, homecom.getWishlist_btn());
		movetoele(homecom.getWishlist_btn(), driver);
		clickonelement(homecom.getWishlist_btn());
		waittillclickable(driver, homecom.getUser_txt());
		movetoele(homecom.getUser_txt(), driver);
		waittillclickable(driver, homecom.getWishlist_Select());
		clickonelement(homecom.getWishlist_Select());
		waittillvisible(driver, homecom.getMywishlist());	
		Assert.assertTrue(homecom.getMywishlist().isDisplayed(), "wishlist is empty");
        waittillclickable(driver, homecom.getDelete_btn());
        clickonelement(homecom.getDelete_btn());
        waittillclickable(driver, homecom.getRemove_btn());
        clickonelement(homecom.getRemove_btn());
		 waittillvisible(driver, homecom.getRemovedfromwishlist()); 
        System.out.println(get_text_common_method(homecom.getRemovedfromwishlist()));
         Assert.assertTrue(homecom.getRemovedfromwishlist().isDisplayed(), "not removed");       
		
		
		
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
