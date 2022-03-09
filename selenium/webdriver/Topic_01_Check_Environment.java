package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_01_Check_Environment {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Selenium Automation Testing");
	
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
	}

}
