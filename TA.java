package com.qa.TitleAutomation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TA {

//	public static void main(String[] args) 
	@Test
	public void Tem()
	{
		// TODO Auto-generated method stub
		String expectedTitle="QA InfoTech | Your Software Testing Partner";
		System.setProperty("webdriver.chrome.driver",  "/home/qainfotech/Downloads/chromedriver");
      
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://qainfotech.com/");
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		

	}

}
