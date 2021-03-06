package com.selenium.Ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCmd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumTesting\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseUrl="http://www.tutorialspoint.com/videotutorials/subscription.php";
		
		driver.get(baseUrl);
		
		System.out.println("\nTittle of page:"+driver.getTitle());
		
		System.out.println("\nCurrent URL present in brower:"+driver.getCurrentUrl());
		
		WebElement link=driver.findElement(By.cssSelector("h2"));
		System.out.println("\nText of particular element:"+link.getText());
		
		System.out.println("\nPage source:"+driver.getPageSource());//display html page
				
	}

}
