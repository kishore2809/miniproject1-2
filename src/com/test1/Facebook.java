package com.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanagalatha\\eclipse-workspace\\java-5pm\\Selenium_Projects\\driverC\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
	}
	}


