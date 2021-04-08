package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumTest_01 {

	WebDriver driver;

	@Test
	public void launchapp() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"/usr/bin/google-chrome");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("sb_form_q"));
		search.sendKeys("intellipaat");
		search.submit();
		System.out.println("Title of the page is:" + driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
