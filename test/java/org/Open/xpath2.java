package org.Open;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
public static <TakeScreenshot> void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sarat\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	Thread.sleep(5000);
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_ESCAPE);
	WebElement startpoint = driver.findElement(By.id("src"));
	startpoint.sendKeys("Tambaram");
	Thread.sleep(5000);
	WebElement date = driver.findElement(By.id("onward_cal"));
	date.click();
	WebElement currentDay = driver.findElement(By.xpath("//td[@text()='21']"));
	currentDay.click();
	WebElement droppoint = driver.findElement(By.id("dest"));
	droppoint.sendKeys("kanyakumari Package ");
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	String title = driver.getTitle();
	System.out.println(title);
	WebElement txt = driver.findElement(By.xpath("(//div[@class='text_hero'])[3]"));
	String txt1 = txt.getText();
	System.out.println(txt1);
	WebElement search = driver.findElement(By.id("search_btn"));
	search.click();
	
}
}
