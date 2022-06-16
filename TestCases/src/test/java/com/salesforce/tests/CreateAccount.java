package com.salesforce.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccount extends BaseNew{
	
	public static void testcase10() throws InterruptedException {
		CreatAccountlogin();
		driver.findElement(By.xpath("//*[@id=\'hotlist\']/table/tbody/tr/td[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\'acc2\']")).sendKeys("Pranjay");
		driver.findElement(By.xpath("//*[@id=\'topButtonRow\']/input[1]")).click();
		closeDriver();}
		
	public static void testcase11() throws InterruptedException {
		CreatAccountlogin();
		driver.findElement(By.xpath("//*[@id=\'filter_element\']/div/span/span[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'fname\']")).sendKeys("light");
		driver.findElement(By.xpath("//*[@id=\'devname\']")).sendKeys("dark");
		driver.findElement(By.xpath("//*[@id=\'editPage\']/div[1]/table/tbody/tr/td[2]/input[1]")).click();
		closeDriver();}
	
	public static void testcase12() throws InterruptedException {
		CreatAccountlogin();
		driver.findElement(By.xpath("//*[@id=\'fcf\']")).click();
		driver.findElement(By.xpath("//*[@id='fcf']/option[6]")).submit();
		driver.findElement(By.xpath("//*[@id=\"00B8a00000Ax4Z7_filterLinks\"]/a[1]")).click();

		By locator2 = By.id("fname");
		WebElement username2 = driver.findElement(locator2);
		clearElement(username2,"fname");
		username2.sendKeys("lightBlue");
		driver.findElement(By.xpath("//*[@id=\'fcol1\']")).click();

		driver.findElement(By.xpath("//*[@id=\'fcol1\']/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\'fop1\']")).click();

		driver.findElement(By.xpath("//*[@id=\"fop1\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\'fval1\']")).sendKeys("<a>");
		closeDriver();}
	
	public static void testcase13() throws InterruptedException {
		
		CreatAccountlogin();
		driver.findElement(By.xpath("//*[@id=\'toolsContent\']/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")).click();
		driver.findElement(By.xpath("//*[@id=\'srch\']")).sendKeys("pranjay");
		driver.findElement(By.xpath("//*[@id=\'stageForm\']/div/div[2]/div[4]/input[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\'cid0\']")).click();
		//driver.findElement(By.xpath("//*[@id=\'cid1\']")).click();
		driver.findElement(By.xpath("//*[@id=\'stageForm\']/div/div[2]/div[1]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'stageForm\']/div/div[2]/div[1]/div/input[2]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		closeDriver();}
	
	public static void testcase14() throws InterruptedException {
		CreatAccountlogin();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'toolsContent\']/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\'ext-gen148\']")).click(); //box   //*[@id="ext-gen269"]/div[3]   //*[@id="ext-gen148"]

		//Thread.sleep(8000);
		//driver.findElement(By.xpath("//div[contains(text(),'created Date')]")).click(); ////*[@id="ext-gen269"]/div[3]///date created  //*[@id="ext-gen269"]/div[3]
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'ext-comp-1042\']")).sendKeys("5/15/2022");     ////*[@id="ext-comp-1112"]

		driver.findElement(By.xpath("//*[@id=\'ext-comp-1045\']")).click();
		driver.findElement(By.xpath("//*[@id=\'ext-gen154\']")).click(); 

		driver.findElement(By.xpath("//*[@id=\'ext-comp-1111\']")).click();
		driver.findElement(By.xpath("//*[@id=\'ext-gen49\']")).click();

		driver.findElement(By.xpath("//*[@id=\'saveReportDlg_reportNameField\']")).sendKeys("project");
		driver.findElement(By.xpath("//*[@id=\'saveReportDlg_DeveloperName\']")).sendKeys("new12345");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@id=\'dlgSaveAndRun\']")).click();
	}
	
	
}
