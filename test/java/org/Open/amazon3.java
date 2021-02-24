package org.Open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarat\\\\eclipse-workspace\\\\Maven\\\\Driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	WebElement IE = driver.findElement(By.xpath("//input[@type='text']"));
	IE.sendKeys("Praveen");
	WebElement IE1 = driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[1]"));
	IE1.sendKeys("Saranya");
	WebElement IE2 = driver.findElement(By.xpath("//textarea[@rows='3']"));
	IE2.sendKeys("Vengaivasal");
	WebElement IE3 = driver.findElement(By.xpath("//input[@type='email']"));
	IE3.sendKeys("praveenmechcad@gmail.com");
	WebElement IE4 = driver.findElement(By.xpath("//input[@type='tel']"));
	IE4.sendKeys("8939160174");
	WebElement IE5 = driver.findElement(By.xpath("//input[@type='radio']"));
	IE5.click();
	WebElement IE6 = driver.findElement(By.xpath("//input[@type='checkbox']"));
	IE6.click();
	WebElement dps = driver.findElement(By.id("msdd"));
	dps.click();
	Thread.sleep(5000);
	WebElement s1 = driver.findElement(By.xpath("//a[text()='English']"));
	s1.click();
    WebElement s2 = driver.findElement(By.id("Skills"));
    Select select=new Select(s2);
    select.selectByIndex(16);
    WebElement s3 = driver.findElement(By.id("countries"));
    Select select1 = new Select(s3);
    select1.selectByValue("India");
    WebElement s4 = driver.findElement(By.xpath("//span[role"));
    Select select2 = new Select(s4);
    select2.selectByValue("Japan");
    
   
    
 
	
	
	
}

}
