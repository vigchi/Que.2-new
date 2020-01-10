package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh Chinnappa\\eclipse-workspace\\Day2Task\\Drivers\\chromedriver.exe");
		//Launching Browser 
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\'text-33\']/div[2]/p[6]/b/a"));
		
		Point location = text.getLocation();
		System.out.println(location);
		//(1073, 5064)
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(1073, 5064)");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

}
