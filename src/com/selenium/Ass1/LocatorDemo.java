package com.selenium.Ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumTesting\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseUrl="http:demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		
		WebElement uname=driver.findElement(By.name("userName"));
		uname.sendKeys("cdac_username");
		
		WebElement pass=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
		pass.sendKeys("password");
		
		WebElement submit=driver.findElement(By.name("submit"));
		uname.clear();
		pass.clear();
		submit.click();
		
		WebElement flight_link = driver.findElement(By.linkText("Flights"));
		flight_link.click();
		
		//driver.manage().window().maximize();
		
		//driver.quit();
	}

}
