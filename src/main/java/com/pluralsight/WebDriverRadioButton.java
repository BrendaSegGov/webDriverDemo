package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButton {

	public static void main(String[] args) {


		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/iBrenda/eclipse-workspace/WebDriverDemo/src/main/webapp/RadioButtonTest.html");
		
		WebElement radioButtons = driver.findElement(By.name("color"));
		radioButtons.getLocation();
		WebElement radio1 = driver.findElement(By.tagName("Red"));
		
		
			if(radio1.isSelected()) {
				System.out.println(radio1.getAttribute("value"));
			}
		}
	}


