package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\eclipse-workspace\\seleniumlearning\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		By Field = By.xpath("//input[@id='email']");
		WebElement F1 = driver.findElement(Field);
		F1.sendKeys("jaid62@gmail.com",Keys.ENTER);
		By FieldPass = By.xpath("//input[@id='pass']");
		WebElement F2 = driver.findElement(FieldPass);
		F2.sendKeys("testpass",Keys.ENTER);
		By Login = By.xpath("//button[@id='loginbutton']");
		WebElement LoginPress = driver.findElement(Login);
		LoginPress.sendKeys(Keys.ENTER);
		
		//*[@id="loginbutton"]


	}	
}	






//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		
//		By textfield = By.xpath("//textarea[@name='q']");
//		//textfield =  By.name("q");
//		WebElement TextEle = driver.findElement(textfield);
//		TextEle.sendKeys("Morning",Keys.ENTER);
//		
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.close();
//		driver.quit();
//		System.out.println("done");
//		
//	}
//}
