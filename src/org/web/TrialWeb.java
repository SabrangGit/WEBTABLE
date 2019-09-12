package org.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrialWeb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.toolsqa.com/automation-practice-table/");
List<WebElement> tRow = d.findElements(By.tagName("tr"));
for (int i = 0; i <tRow.size() ; i++) {
	WebElement row = tRow.get(i);
	String text2 = row.getText();
	System.out.println(text2);
	
	List<WebElement> tData = d.findElements(By.tagName("td"));
	for (int j = 0; j < tData.size(); j++) {
		WebElement data = tData.get(j);
		String text = data.getText();
		if (text.equals("Mecca")) {
		System.out.println(text);
		
	}
}
	
}
	}
}



