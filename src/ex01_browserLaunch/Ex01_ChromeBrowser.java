package ex01_browserLaunch;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_ChromeBrowser {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") 
				+ File.separator 
				+ "drivers" 
				+ File.separator
				+ "chromedriver.exe";

		// Set the path to the ChromeDriver executable file
		System.setProperty("webdriver.chrome.driver", driverPath);

		// Create a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();

		// Close the Browser
		driver.quit();
	}
}
