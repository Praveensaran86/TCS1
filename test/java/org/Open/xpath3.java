package org.Open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath3 {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement x3 = driver.findElement(By.xpath("//div[@class()='form-control ng-pristine ng-valid ng-touched\']"));
	x3.sendKeys("NOTE: Just enter the values for the textbox only");
	driver.manage().window().maximize();
}
}
