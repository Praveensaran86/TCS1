package org.Open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotelapp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement ad = driver.findElement(By.id("username"));
	ad.sendKeys("8939160174");
	WebElement ad2 = driver.findElement(By.id("password"));
	ad2.sendKeys("Anujashwin*2");
	
	WebElement log = driver.findElement(By.id("login"));
	log.click();
	}

}
