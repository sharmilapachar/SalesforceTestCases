package com.salesforce.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Set;
import salesforce.commonUtility.Utility;

public class RandomSenrio extends BaseNew {
	
@Test
	public static void testcase33() throws InterruptedException {
		getdriver();
		driver.get("https://login.salesforce.com//");
		String userName=Utility.getApplicationProperty("username");
		 String passwrd=Utility.getApplicationProperty("password");
		 
	login(userName,passwrd);	
	driver.findElement(By.xpath("//*[@id=\'home_Tab\']/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("tryLexDialogX")).click();
	driver.findElement(By.xpath("//*[@id=\'ptBody\']/div/div[2]/span[1]/h1/a")).click();
	String expected=driver.findElement(By.xpath("//*[@id=\'tailBreadcrumbNode\']")).getText();
	String actual= "Sharmila Poonia ";
	Assert.assertEquals(actual, expected);
	closeDriver();
	}
@Test
public static void testcase37() throws InterruptedException {
	getdriver();
	driver.get("https://login.salesforce.com//");
	String userName=Utility.getApplicationProperty("username");
	 String passwrd=Utility.getApplicationProperty("password");
	 
login(userName,passwrd);	
driver.findElement(By.xpath("//*[@id=\'home_Tab\']/a")).click();
Thread.sleep(5000);
driver.findElement(By.id("tryLexDialogX")).click();

driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a")).click();
//String baseWindowHandle=driver.getWindowHandle();
//System.out.println("handle value of base window="+baseWindowHandle);
//String mainWindowHandle = driver.getWindowHandle();
//String baseWindowHandle=driver.getWindowHandle();
//System.out.println("handle value of base window="+baseWindowHandle);

driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img")).click(); 
//Thread.sleep(3000);
//switchTonewWindow("handle");
String baseWindowHandle=driver.getWindowHandle();
System.out.println("handle value of base window="+baseWindowHandle);

Set<String> allWindowHandles=driver.getWindowHandles();
for(String handle:allWindowHandles) {
	if(!handle.equalsIgnoreCase(baseWindowHandle)) {
		driver.switchTo().window(handle);
	}
Thread.sleep(8000);

//driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]")).click();
driver.switchTo().window(baseWindowHandle);
//driver.getWindowHandles()
/*driver.findElement(By.xpath(""))
driver.findElement(By.xpath(""))
driver.findElement(By.xpath(""))
driver.findElement(By.xpath(""))
driver.findElement(By.xpath(""))
driver.findElement(By.xpath(""))
driver.findElement(By.xpath(""))
driver.findElement(By.xpath(""))*/
}}}
