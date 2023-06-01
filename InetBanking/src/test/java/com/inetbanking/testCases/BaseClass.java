package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String baseURL="https://demo.guru99.com/V1/index.php";
	public String username="mngr504538";
	public String password="beqEsed";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='gdpr-consent-tool-wrapper']/../div[7]"));
		WebElement frm=driver.findElement(By.xpath("//iframe[@id='gdpr-consent-notice']"));
		driver.switchTo().frame(frm);
		
		//driver.findElement(By.xpath("//button[@id='save']")).click();
		//driver.findElement(By.xpath("//span[text()='Accept All']")).click();
		
	}
	
	
	//@AfterClass
	//public void tearDown(){
		
		//driver.quit();
	}
	

