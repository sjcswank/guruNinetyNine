package newpackage;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myClass {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		// launch firefox and get base url
		driver.get(baseURL);
		
		// get actualTitle
		actualTitle = driver.getTitle();
		
		//compare actual and expect, print result
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Test Failed: acutal title: " + actualTitle);
		}
		
		//close firefox
		driver.close();
	}
}
