package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import homecomponent.homecomponent;

public class generic_common_method {

	public static WebDriver launchbroswer(String appurl)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appurl);
	    return driver;
		
	}
	
	public static void waittillclickable(WebDriver driver, WebElement WebElement)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(WebElement));
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	public static void waittillvisible(WebDriver driver, WebElement WebElement)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(WebElement));
	}
	
	public static void quit(WebDriver driver)
	{
		driver.quit();
	}
	
	public static void movetoele(WebElement webelement, WebDriver driver)
	{
		Actions act=new Actions(driver);
		try {
			act.moveToElement(webelement).perform();
		}catch(Throwable e) {
			e.printStackTrace();
		}		
	}
	
	public static void clickonelement(WebElement webelement)
	{
		try {
			webelement.click();
		}catch(Throwable e) {
			e.printStackTrace();
			webelement.click();
		}
		
	}

	public static void sendkeymethod(WebElement webelement, String txt)
	{
		
		webelement.sendKeys(txt);
		
	}
	
	public static String get_text_common_method(WebElement webelement)
	{
		String value = null;
		try {
			value = webelement.getText();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static String get_attribute_commonmethod(WebElement webelement,String attributename)
	{
		String value = null;
		try {
			value = webelement.getAttribute(attributename);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		return value;
	}
	
	
	public static void scroolintoView(WebDriver driver,WebElement webelement) {
		Actions action = new Actions(driver);
		try {
			action.moveToElement(webelement).perform();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static ArrayList readdata( String File,String sheet,int rownum ) throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream(File);
		
		
				
				Workbook wb=WorkbookFactory.create(fis);
		
				Sheet sh=wb.getSheet(sheet);
				Row rw=sh.getRow(rownum);
				Cell cel=null;
				
				ArrayList alst=new ArrayList();
				for(int i=0;i<rw.getLastCellNum();i++)
				{
					alst.add(rw.getCell(i));
				
				}
				
		return alst;
		
	}
	
	
	
	
	
	
	
	
}
