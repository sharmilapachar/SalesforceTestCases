package com.salesforce.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
public class CreateOpty  extends BaseNew{
	@Test
	public static void testcase15() throws InterruptedException {
	CreatOptylogin();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#fcf")).click(); //*[@id="fcf"]
	String expected=driver.findElement(By.xpath("//option[contains(text(),'Closing Next Month')]")).getText();
	String actual= "Closing Next Month";
	Assert.assertEquals(actual, expected);
	closeDriver();}
	
@Test
	public static void testcase16() throws InterruptedException {
		CreatOptylogin();
		driver.findElement(By.xpath("//*[@id=\'hotlist\']/table/tbody/tr/td[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\'opp3\']")).sendKeys("lead");
		driver.findElement(By.xpath("//*[@id=\'opp4\']")).sendKeys("praveen");
		driver.findElement(By.xpath("//*[@id=\'opp9\']"));
		//*[@id="datePicker"]/div[2]/div/a
		driver.findElement(By.xpath("//*[@id=\'ep\']/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span/a")).click();
		driver.findElement(By.xpath("//*[@id=\'opp11\']")).click();
		driver.findElement(By.xpath("//*[@id=\'opp11\']/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\'opp12\']")).sendKeys("5%");
		driver.findElement(By.xpath("//*[@id=\"opp17\"]")).sendKeys("marketing");
		driver.findElement(By.xpath("//*[@id=\'opp6\']")).click();
		driver.findElement(By.xpath("//*[@id=\'opp6\']/option[5]")).click();
		driver.findElement(By.xpath("//*[@id=\'opp6\']")).click();
		driver.close();}
	@Test
	public static void testcase17() throws InterruptedException {
		CreatOptylogin();
		driver.findElement(By.xpath("//*[@id=\'toolsContent\']/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")).click();
		closeDriver();}
	
	@Test
	public static void testcase18() throws InterruptedException {
		CreatOptylogin();
		driver.findElement(By.xpath("//*[@id=\'toolsContent\']/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a")).click();
		closeDriver();}
	@Test
	public static void testcase19() throws InterruptedException {
		CreatOptylogin();
		driver.findElement(By.xpath("//*[@id=\'toolsContent\']/tbody/tr/td[2]/div/div/h3")).click();
		driver.findElement(By.xpath("//*[@id=\'quarter_q\']")).click();
		driver.findElement(By.xpath("//*[@id=\'quarter_q\']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'open\']")).click();
		driver.findElement(By.xpath("//*[@id=\'open\']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'open\']")).submit();
		closeDriver();}
}
