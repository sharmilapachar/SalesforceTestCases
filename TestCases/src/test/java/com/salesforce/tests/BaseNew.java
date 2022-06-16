package com.salesforce.tests;


	import java.io.IOException;

import java.util.Set;

import org.bouncycastle.util.Properties;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

import salesforce.commonUtility.Utility;


	public class BaseNew {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
		public static void getdriver() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe");

			//WebDriver driver;

			driver = new ChromeDriver();
			System.out.println("chrome driver instance created");}

		public static void gotoUrl(String url) {
		driver.get(url);
		System.out.println("url entered is "+url);}
		
		public static void login(String userName,String password) {
			WebElement email=driver.findElement(By.id("username"));
			enterText1(email,userName,"user name");
	WebElement passwordElement=driver.findElement(By.id("password"));
	enterText1(passwordElement,password,"password");

	WebElement login=driver.findElement(By.id("Login"));
	clickElement(login,"login button");}
		
		public static void logout() {
			driver.findElement(By.xpath("//*[@id='userNav']")).click();
			driver.findElement(By.xpath("//*[@id=\'userNav-menuItems\']/a[5]")).click();
			System.out.println("logout");
		}
		
	public static void closeDriver() {
		driver.close();}
	public static void closeAllDriver() {
		driver.quit();}

	public static void clearElement(WebElement element,String objName) {
		if(element.isDisplayed()) {
			element.clear();
			System.out.println("pass:"+objName+"  element cleared");
		}
		else {
			System.out.println("fail:"+objName+" element not displayed");
		}
	}
	public static void enterText1(WebElement element,String text,String objName) {
		if(element.isDisplayed()) {
	clearElement(element,objName);
	element.sendKeys(text);}}

		public static void clickElement(WebElement element,String objName) {
			element.click();}
		
		public static void selectElementByText(WebElement element,String text, String objName) {
			
			Select selectCity= new Select(element);
			selectCity.selectByVisibleText(text);
			System.out.println(objName+ " selected +text");}
			
			public static void waitUntilVisible(WebElement element, String objNmae) {
				wait = new WebDriverWait(driver,35);
				wait.until(ExpectedConditions.visibilityOf(element));}
			
			public static void waitUntilVisibilityOfElementLocated(By locator, String objNmae) {
				wait = new WebDriverWait(driver,35);
				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));}
			
			public static void waitUntilAlertIsPresent() {
				wait = new WebDriverWait(driver,35);
				wait.until(ExpectedConditions.alertIsPresent());}
				
				public static void waitUntilElementToBeClickable(By locator, String objNmae) {
					wait = new WebDriverWait(driver,35);
					wait.until(ExpectedConditions.elementToBeClickable(locator));}
				
				public static void mouseover(WebElement element,String objNmae) {
					waitUntilVisible(element, objNmae);
					Actions action=new Actions(driver);
					action.moveToElement(element).build().perform();}
				
					public static Alert switchToAlert() {
						return driver.switchTo().alert();}
					
						
						
					public static void AcceptAlert() {
						waitUntilAlertIsPresent();
						Alert alert=switchToAlert();
						alert.accept();}
					public static void DismissAlert() {
						waitUntilAlertIsPresent();
						Alert alert=switchToAlert();
						alert.dismiss();}
					
					public static void selectElementByIndex(WebElement element,int index, String objName) {
						
						Select selectCity= new Select(element);
						selectCity.selectByIndex(index);}
					
					public static void selectElementByValue(WebElement element,String text) {
						
						Select selectCity= new Select(element);
						selectCity.selectByValue(text);}
					
					public static void switchTonewWindow(String mainWindowHandle) {
						Set<String> allWindowHandles = driver.getWindowHandles();
						for (String handle : allWindowHandles) {
							if (!mainWindowHandle.equalsIgnoreCase(handle))
							
							driver.switchTo().window(handle);
							
									
						}}
					
					
						public static void SalesforceLeads() throws InterruptedException{
					
							getdriver();
							gotoUrl("https://login.salesforce.com//");
							//String username=Utility.getApplicationProperty("JKNM");
							//
							//String usernameValue1=Utility.getApplicationProperty("username");
							//login("username","username");
							//String url=Utility.getApplicationProperty("url");
							 String userName=Utility.getApplicationProperty("username");
							 String passwrd=Utility.getApplicationProperty("password");
							 
						login(userName,passwrd);
								
								
						Thread.sleep(3000);
							driver.findElement(By.xpath("//*[@id=\'Lead_Tab\']/a")).click();
							Thread.sleep(3000);
							driver.findElement(By.id("tryLexDialogX")).click();}
			
				
		

					
			public static void SfdcLogin()throws InterruptedException{
				
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe");

				//WebDriver driver;

				//driver = new ChromeDriver();
				getdriver();
				driver.get("https://login.salesforce.com//");
				String userName=Utility.getApplicationProperty("username");
				 String passwrd=Utility.getApplicationProperty("password");
				 
			login(userName,passwrd);
				
				/*By locator = By.id("username");
				WebElement username = driver.findElement(locator);
		username.sendKeys("sharmila.pachar64@gmail.com");
		 By locator1 = By.id("password");
		 WebElement username1 = driver.findElement(locator1);

		username1.sendKeys("Kayra@123");
		driver.findElement(By.id("Login")).click();*/

			}
			public static void CreatAccountlogin()throws InterruptedException{
				
				
				getdriver();
				driver.get("https://login.salesforce.com//");
				String userName=Utility.getApplicationProperty("username");
				 String passwrd=Utility.getApplicationProperty("password");
				 
			login(userName,passwrd);
			driver.findElement(By.xpath("//*[@id=\'Account_Tab\']")).click();

			Thread.sleep(5000);
			driver.findElement(By.id("tryLexDialogX")).click();
		
	}
public static void CreatOptylogin()throws InterruptedException{
				
				
				getdriver();
				driver.get("https://login.salesforce.com//");
				String userName=Utility.getApplicationProperty("username");
				 String passwrd=Utility.getApplicationProperty("password");
				 
			login(userName,passwrd);
			
			
	driver.findElement(By.xpath("//*[@id=\'Opportunity_Tab\']/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("tryLexDialogX")).click();
	System.out.println("opportunities drop down is present");
	
	}		
public static void CreatContactslogin()throws InterruptedException{
	
	
	getdriver();
	driver.get("https://login.salesforce.com//");
	String userName=Utility.getApplicationProperty("username");
	 String passwrd=Utility.getApplicationProperty("password");
	 
login(userName,passwrd);	
driver.findElement(By.xpath("//*[@id=\'Contact_Tab\']/a")).click();
Thread.sleep(3000);
driver.findElement(By.id("tryLexDialogX")).click();}

	}	

		



