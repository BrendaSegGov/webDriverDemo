package com.pluralsight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemo {

	public static void main(String[] args) {
		// Set system property before create the driver
		//System.setProperty("webdriver.gecko.driver","C:/dev/tools/geckodriver.exe");//
		
		//WebDriver driver = new FirefoxDriver(); //Driver created for Firefox
		WebDriver driver = new ChromeDriver(); //Driver created for Chrome
		driver.get("http:www.google.com");// Navigate
		
		
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Harry Potter logo");
		searchField.sendKeys(Keys.ENTER);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Imágenes")));
		
		WebElement imagesLink = driver.findElements(By.linkText("Imágenes")).get(0);
		imagesLink.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement selectimage = driver.findElement(By.xpath("/html/body/div[2]/c-wiz/div[3]/div[1]/div/div/div/div/div[1]/div[1]/div[12]/a[1]"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		selectimage.click();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.close();
	}

}
