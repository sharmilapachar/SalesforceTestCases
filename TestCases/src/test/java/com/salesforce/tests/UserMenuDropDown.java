package com.salesforce.tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class UserMenuDropDown extends BaseNew{
	@Test
	public static void testcase5() throws InterruptedException {
		// TODO Auto-gened method stub
		
		SfdcLogin();

driver.findElement(By.xpath("//*[@id='userNav']")).click();
closeDriver();

	}
	@Test
	public static void testcase7() throws InterruptedException {
		
		
		SfdcLogin();
driver.findElement(By.xpath("//*[@id='userNav']")).click();
driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[2]")).click();
Thread.sleep(8000);
driver.findElement(By.xpath("//*[@id=\'PersonalInfo\']")).click();
driver.findElement(By.xpath("//*[@id='LoginHistory_font']")).click();
driver.findElement(By.xpath("//*[@id='RelatedUserLoginHistoryList_body']/div/a")).click();
Thread.sleep(8000);

driver.findElement(By.xpath("//*[@id=\'DisplayAndLayout\']")).click();
driver.findElement(By.xpath("//*[@id='CustomizeTabs_font']")).click();
driver.findElement(By.xpath("//*[@id=\'p4\']/option[9]")).click();
driver.findElement(By.xpath("//*[@id='duel_select_0']/option[26]")).click();
driver.findElement(By.xpath("//*[@id=\'duel_select_0_right\']/img")).click();
driver.findElement(By.xpath("//*[@id=\'bottomButtonRow\']/input[1]")).click();
driver.findElement(By.xpath("//*[@id=\'EmailSetup\']")).click();
driver.findElement(By.xpath("//*[@id=\'EmailSettings_font\']")).click();
driver.findElement(By.xpath("//*[@id=\'bottomButtonRow\']/input[1]")).click();
driver.findElement(By.xpath("//*[@id=\'CalendarAndReminders\']")).click();
driver.findElement(By.xpath("//*[@id=\'Reminders_font\']")).click();
driver.findElement(By.xpath("//*[@id=\'testbtn\']")).click();
closeDriver();}

@Test
public static void testcase8() throws InterruptedException {
	
	
	SfdcLogin();
	driver.findElement(By.xpath("//*[@id='userNav']")).click();
	driver.findElement(By.xpath("//*[@id=\'userNav-menuItems\']/a[3]")).click();
	driver.findElement(By.xpath("//*[@id=\'toolbar-1043\']")).click();
	closeDriver();}

@Test

public static void testcase9() throws InterruptedException {
	
	
	SfdcLogin();
	driver.findElement(By.xpath("//*[@id='userNav']")).click();
driver.findElement(By.xpath("//*[@id=\'userNav-menuItems']/a[5]")).click();
System.out.println("logout");
closeDriver();
}}
