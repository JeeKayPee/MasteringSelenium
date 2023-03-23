package ex01_browserLaunch;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex02_FireFoxBrowser {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") 
				+ File.separator 
				+ "drivers" 
				+ File.separator
				+ "geckodriver.exe";

		// Set the path to the Geckodriver executable file
		System.setProperty("webdriver.gecko.driver", driverPath);

		// Create a new FireFox instance
		WebDriver driver = new FirefoxDriver();

		// Close the Browser
		driver.quit();
	}
}
