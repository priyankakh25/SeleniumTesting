package com.selenium.Ass3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebIntraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumTesting\\library\\chromedrive.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement male=driver.findElement(By.id("male"));
		male.click();
		
		WebElement chbox=driver.findElement(By.className("Performance"));
		chbox.click();
		
		Select dd=new Select(driver.findElement(By.id("testingDropdown")));
		dd.selectByVisibleText("Manual Testing");
		dd.selectByIndex(1);
		
		WebElement txtbox=driver.findElement(By.id("fname"));
		
		Actions builder =new Actions(driver);
		Action series=builder.moveToElement(txtbox).click().keyDown(txtbox,Keys.SHIFT).sendKeys(txtbox,"hello").keyUp(txtbox,Keys.SHIFT)
				.doubleClick(txtbox).contextClick().build();
		
		series.perform();

	}

}
