package org.Open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.get("https://www.redbus.in/");
	WebElement find = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	find.sendKeys("Hello");
	Thread.sleep(2000);
	WebElement findElement = driver.findElement(By.id("pass"));
	findElement.sendKeys("password");
	WebElement text = driver.findElement(By.name("login"));
	WebElement txtletter =  driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	String text1 = txtletter.getText();
	System.out.println(text1);
	WebElement text2 = driver.findElement(By.xpath("(//div[contains(text(),'celebrity')])[1]"));
	String texta = text2.getText();
	System.out.println(texta);
	String title = driver.getTitle();
	System.out.println(title);
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	text.click();
	Thread.sleep(2000);
	WebElement startpoint = driver.findElement(By.id("src"));
	startpoint.sendKeys("tambaram");
	WebElement droppoint = driver.findElement(By.id("db"));
	droppoint.sendKeys("kanyakumari");
    WebElement enter = driver.findElement(By.xpath("(//div[containstext(),'features')])"));
    String quote=enter.getText();
    System.out.println(quote);
	String title2 = driver.getTitle();
	System.out.println(title2);
	WebElement search = driver.findElement(By.id("search_btn"));
	search.click();
	driver.close();
	
	
	
}

}
