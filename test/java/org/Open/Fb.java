package org.Open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarat\\\\eclipse-workspace\\\\Maven\\\\Driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement IE = driver.findElement(By.xpath("//input[@type='text']"));
	IE.sendKeys("praveenmechcad@gmail.com");
	WebElement IE1 = driver.findElement(By.xpath("//input[@type='password']"));
	IE1.sendKeys("anujash*");
	WebElement IE2 = driver.findElement(By.xpath("//button[@value='1']"));
	IE2.click();	
}

}
