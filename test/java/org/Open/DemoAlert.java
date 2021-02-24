package org.Open;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement btnsignin = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	btnsignin.click();
	WebElement findElement = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
	findElement.click();
	Alert al = driver.switchTo().alert();
	al.accept();

	
}

}
