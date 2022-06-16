package com.salesforce.tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import salesforce.commonUtility.Utility;

public class Leads extends BaseNew{
	@Test
	
public static void test20()throws InterruptedException, IOException{
		SalesforceLeads();
		
	
	logout();
	driver.close();
	
}
	@Test
	
	public static void test21()throws InterruptedException, IOException{
		
		SalesforceLeads();
		
		/*getdriver();
		gotoUrl("https://login.salesforce.com//");
		
		login("sharmila.pachar64@gmail.com","Kayra@123");
		
	Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'Lead_Tab\']/a")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.id("tryLexDialogX")).click();*/
		driver.findElement(By.xpath("//*[@id=\'fcf\']")).click();
		
		String expected=driver.findElement(By.xpath("//*[@id=\'fcf\']/option[2]")).getText();
		String actual= "My Unread Leads";
		Assert.assertEquals(actual, expected);
		closeDriver();}
	@Test
	
	public static void test22()throws InterruptedException, IOException{
		SalesforceLeads();
		
		driver.findElement(By.xpath("//*[@id=\'fcf\']")).click();
		driver.findElement(By.xpath("//*[@id=\'fcf\']/option[4]")).click();
	
		logout();
		driver.get("https://login.salesforce.com//");
		login("sharmila.pachar64@gmail.com","Kayra@123");
		
		Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\'Lead_Tab\']/a")).click(); ////*[@id="Lead_Tab"]//*[@id="Lead_Tab"]/a
	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\'filter_element\']/div/span/span[1]/input")).click();
			String expected=driver.findElement(By.xpath("//*[@id=\'00B8a00000Ax4Yu_listSelect\']/option[4]")).getText();
			String actual=  "Today's Leads";
			Assert.assertEquals(actual, expected);
	closeDriver();}
	@Test
	
	
	public static void test23() throws InterruptedException, IOException{
		SalesforceLeads();
		
		driver.findElement(By.xpath("//*[@id=\'fcf\']")).click();
		driver.findElement(By.xpath("//*[@id=\'fcf\']/option[4]")).click();
		String expected=driver.findElement(By.xpath("//*[@id=\'fcf\']/option[4]")).getText();
		String actual= "Today's Leads";
		Assert.assertEquals(actual, expected);
	
	closeDriver();}
	@Test
	
		
	public static void test24() throws InterruptedException, IOException{
		SalesforceLeads();
		driver.findElement(By.xpath("//*[@id=\'hotlist\']/table/tbody/tr/td[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\'name_lastlea2\']")).sendKeys("ABCD");
		driver.findElement(By.xpath("  //*[@id=\'lea3\']")).sendKeys("ABCD");
		driver.findElement(By.xpath("   //*[@id=\'topButtonRow\']/input[1]")).click();
		String expected=driver.findElement(By.xpath("//*[@id=\'contactHeaderRow\']/div[2]/h2")).getText();
		String actual="ABCD";
		Assert.assertEquals(actual, expected);
	closeDriver();}
}
