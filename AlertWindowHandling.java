package com.webdriver;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AlertWindowHandling {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Automation tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("Darshan");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
	
	
	Thread.sleep(2000);
	driver.close();
}

}
