package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanagalatha\\eclipse-workspace\\java-5pm\\Selenium_Projects\\driverC\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
			
			driver.get("https://adactinhotelapp.com/");
	        driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("kishore12344");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("kizzy2809");
	Thread.sleep(3000);
	WebElement submit = driver.findElement(By.id("login"));
	submit.click();
	Thread.sleep(3000);
	//WebElement register = driver.findElement(By.xpath("//a[@href='Register.php']"));
	//register.click();
	//Thread.sleep(3000);
	//WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
	//name.sendKeys("kishore1234");
	//WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	
	//password.sendKeys("kizzy2809");
	//WebElement repass = driver.findElement(By.xpath("//input[@name='re_password']"));
	//repass.sendKeys("kizzy2809");
	//WebElement fullname = driver.findElement(By.xpath("//input[@name='full_name']"));
	//fullname.sendKeys("kishore 2809");
	//WebElement email = driver.findElement(By.xpath("//input[@name='email_add']"));
	//email.sendKeys("kishoremurugan93@gmail.com");
	//WebElement captcha = driver.findElement(By.xpath("//input[@name='captcha']"));
	//captcha.sendKeys("bejumble");
	//WebElement box = driver.findElement(By.xpath("//input[@type='checkbox']"));
	//box.click();
	
//	WebElement sub1 = driver.findElement(By.id("Submit"));
//	sub1.click();	
//	Thread.sleep(3000);
	
	
	WebElement location1 = driver.findElement(By.id("location"));
	Select k = new Select(location1);
	k.selectByValue("Melbourne");
	Thread.sleep(3000);
	
	
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select s = new Select(hotel);
	s.selectByValue("Hotel Sunshine");
	Thread.sleep(3000);
	
	
	WebElement room = driver.findElement(By.id("room_type"));
	Select e = new Select(room);
	e.selectByValue("Deluxe");
	Thread.sleep(3000);
	
	
	WebElement bed  = driver.findElement(By.id("room_nos"));
	Select s1 = new Select(bed );
	s1.selectByValue("2");
	Thread.sleep(3000);
	
	
	WebElement booking = driver.findElement(By.id("datepick_in"));
	booking.clear();
	booking.sendKeys("25/12/2021");
	Thread.sleep(3000);
	
	WebElement checkout = driver.findElement(By.id("datepick_out"));
	checkout.clear();
	checkout.sendKeys("27/12/2021");
	Thread.sleep(3000);
	
	
	WebElement adult= driver.findElement(By.id("adult_room"));
	Select k1 = new Select(adult);
	k1.selectByValue("2");
	Thread.sleep(3000);
	
	
	WebElement child = driver.findElement(By.id("child_room"));
	Select b = new Select(child);
	b.selectByValue("2");
	Thread.sleep(3000);
	
	
	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	
	
	WebElement button = driver.findElement(By.id("radiobutton_0"));
	button.click();
	
	
	WebElement cont_click= driver.findElement(By.id("continue"));
	cont_click.click();
	
	WebElement fname = driver.findElement(By.id("first_name"));
	fname.sendKeys("kishore");
	
	
	WebElement lname = driver.findElement(By.id("last_name"));
	lname.sendKeys("kizzy");
	
	WebElement city = driver.findElement(By.id("address"));
	city.sendKeys("17 /10 USA Washington ");
	
	WebElement credit  = driver.findElement(By.id("cc_num"));
	credit.sendKeys("4567 8545 9575 9832");
	Thread.sleep(3000);
	
	
	WebElement ctype= driver.findElement(By.id("cc_type"));
	Select v = new Select(ctype);
	v.selectByValue("AMEX");
	Thread.sleep(3000);
	
	WebElement cmonth = driver.findElement(By.id("cc_exp_month"));
	Select h = new Select(cmonth);
	h.selectByVisibleText("March");
	WebElement cyear = driver.findElement(By.id("cc_exp_year"));
	Select w = new Select(cyear);
	w.selectByValue("2022");
	Thread.sleep(3000);
	
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("2525");
	
	WebElement booknow = driver.findElement(By.id("book_now"));
	booknow.click();
	Thread.sleep(3000);
	
	
	WebElement searchroom = driver.findElement(By.id("search_hotel"));
	searchroom.click();
	Thread.sleep(3000);
	
		
		}
		}


