package seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\eclipse-workspace\\seleniumlearning\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 
	 
}
}
