package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumTesting\\library\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseUrl="http://demo.guru99.com/test/newtours/";
		String expectResult="Welcome Mercury Tours";
		String actualresult="";
		driver.get(baseUrl);
		actualresult=driver.getTitle();
		
		if(actualresult.contentEquals(expectResult)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
