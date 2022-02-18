package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	public WebDriver driver;
	
	public void navigateUrl(String url) {
		driver.get(url);
	}
	public void sendKeys(By by, String keyvalue) {
		driver.findElement(by).sendKeys(keyvalue);
	}
	public void click(By by) {
		driver.findElement(by).click();
	}
	public String getText (By by) {
		return driver.findElement(by).getText();
	}
	
}
