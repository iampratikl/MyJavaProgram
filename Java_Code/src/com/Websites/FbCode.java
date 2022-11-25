package com.Websites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbCode {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver = new ChromeDriver();

		/*
		 * driver.get("https://www.facebook.com"); WebElement email =
		 * driver.findElement(By.id("email"));
		 * email.sendKeys("pratiklenekar@gmail.com"); Thread.sleep(2000);
		 *
		 * driver.navigate(); email.sendKeys("lucifer123@gmail.com");
		 */
	}

}
