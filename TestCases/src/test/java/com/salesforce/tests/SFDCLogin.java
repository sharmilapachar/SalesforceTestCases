package com.salesforce.tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SFDCLogin extends BaseNew{
	@Test
	

	public static void testcase1() throws InterruptedException {
		
		
		getdriver();
		driver.get("https://login.salesforce.com//");
		
		By locator = By.id("username");
		WebElement username = driver.findElement(locator);
username.sendKeys("sharmila.pachar64@gmail.com");
 By locator1 = By.id("password");
 WebElement username1 = driver.findElement(locator1);
 clearElement(username1,"password");
username1.sendKeys("");
driver.findElement(By.id("Login")).click();
closeDriver();

	}
@Test

	public static void testcase2()throws InterruptedException {
	
		SfdcLogin();
closeDriver();}

	public static void testcase3()throws InterruptedException {
		getdriver();
		driver.get("https://login.salesforce.com//");
		
		By locator = By.id("username");
		WebElement username = driver.findElement(locator);
username.sendKeys("sharmila.pachar64@gmail.com");
 By locator1 = By.id("password");
 WebElement username1 = driver.findElement(locator1);
 
username1.sendKeys("Kayra@123");
driver.findElement(By.xpath("//*[@id='rememberUn']")).click();

System.out.println("check box select");
driver.findElement(By.id("Login")).click();

driver.findElement(By.xpath("//*[@id='userNav']")).click();
driver.findElement(By.xpath("//*[@id=\'userNav-menuItems']/a[5]")).click();
System.out.println("logout");
String expected=driver.findElement(By.xpath("//*[@id=\'idcard-identity\']")).getText();
String actual= "sharmila.pachar64@gmail.com";
Assert.assertEquals(actual, expected);
closeDriver();}
	
	@Test
		public static void testcase4()throws InterruptedException {
			// TODO Auto-gened method stub
			
			getdriver();
			driver.get("https://login.salesforce.com//");
			
			By locator = By.id("username");
			WebElement username = driver.findElement(locator);
	username.sendKeys("sharmila.pachar64@gmail.com");
	driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='un']")).sendKeys("sharmila.pachar64@gmail.com");
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='continue']")).click();
	closeDriver();
	}
	@Test
	public static void testcase4B()throws InterruptedException {
		// TODO Auto-gened method stub
		
		getdriver();
		driver.get("https://login.salesforce.com//");
		
		By locator = By.id("username");
		WebElement username = driver.findElement(locator);
username.sendKeys("sharmila.P@gmail.com");
 By locator1 = By.id("password");
 WebElement password=driver.findElement(locator1);
password.sendKeys("ASC");
driver.findElement(By.id("Login")).click();
String expected= driver.findElement(By.xpath("//*[@id=\'error\']")).getText();
String actual="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
Assert.assertEquals(actual, expected);
closeDriver();
	}

}	
		
		
		
		
		
		
		
		
	

	

