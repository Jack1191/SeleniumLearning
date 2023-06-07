package seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\seleniumlearning\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		
		
	}

}
