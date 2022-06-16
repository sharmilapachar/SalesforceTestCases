package com.salesforce.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import salesforce.commonUtility.Utility;

public class CreateContacts  extends BaseNew{
	
@Test
	public static void testcase25() throws InterruptedException {
	CreatContactslogin();
driver.findElement(By.xpath("//*[@id=\'hotlist\']/table/tbody/tr/td[2]/input")).click();
driver.findElement(By.xpath("//*[@id=\"name_lastcon2\"]")).sendKeys("Ppl");
driver.findElement(By.xpath("//*[@id=\'con4\']")).sendKeys("Pranjay");
driver.findElement(By.xpath("//*[@id=\'bottomButtonRow\']/input[1]")).click();
String baseURL = "https://cld2-dev-ed.my.salesforce.com/0038a00002spv1S";
driver.get(baseURL);

SoftAssert softAssert = new SoftAssert();
String getActualTitle = driver.getTitle();
//boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Contact Ppl");

softAssert.assertEquals(getActualTitle, "Contact: Ppl ~ Salesforce - Developer Edition");
softAssert.assertAll();
closeDriver();
}
@Test
public static void testcase32() throws InterruptedException {
CreatContactslogin();
driver.findElement(By.xpath("//*[@id=\'hotlist\']/table/tbody/tr/td[2]/input")).click();
driver.findElement(By.xpath("//*[@id=\"name_lastcon2\"]")).sendKeys("Indian");
//String LastName=Utility.getApplicationProperty("Last Name");
//String AccountName=Utility.getApplicationProperty("Account Name");

//driver.findElement(By.xpath("//*[@id=\'name_lastcon2\']")).sendKeys(LastName);
driver.findElement(By.xpath("//*[@id=\'con4\']")).sendKeys("Global Media");
driver.findElement(By.xpath("//*[@id=\'topButtonRow\']/input[2]")).click();

closeDriver();}}