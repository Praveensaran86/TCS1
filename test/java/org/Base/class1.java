package org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
public static WebDriver getDriver() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
return driver;
}
public void loadURL(WebDriver driver, String url) {
	driver.get(url);
}
public static void type(WebElement element,String data) {
	 element.sendKeys(data);
}
public void btnClick(WebElement element) {
	element.click();
}
public void quitBrowser(WebDriver driver) {
	driver.quit();
	
}
	
}


