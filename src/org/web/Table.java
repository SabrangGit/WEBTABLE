package org.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.toolsqa.com/automation-practice-table/");
List<WebElement> rows = d.findElements(By.tagName("tr"));
for (WebElement r : rows) {
	List<WebElement> cells = r.findElements(By.tagName("td"));
	for (WebElement c : cells) {
		if (c.equals("Taiwan")) {
			System.out.println(c);
			d.quit();
			
		}
		
	}
}
	
}


}
