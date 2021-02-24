package org.Open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoautomationtesting {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarat\\\\eclipse-workspace\\\\Maven\\\\Driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement IE = driver.findElement(By.xpath("//input[@type='text']"));
	IE.sendKeys("iphone");
	WebElement IE1 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	IE1.click();
	
}

}
