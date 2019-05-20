package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript01 {

	public static void main(String[] args) {
		//set system properties
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		
		//create webdriver
		WebDriver driver =  new ChromeDriver();
		
		//set test variables
		String baseURL = "http://www.demo.guru99.com/V4/";
		String userID = "mngr196055";
		String password = "yzYmuvu";
		String expectedTitle = "Guru99 Bank Manager HomePage";
		String actualTitle = "";
		
		//launch browser
		driver.get(baseURL);
		//enter credentials and click login
		WebElement userIDField = driver.findElement(By.name("uid"));
		WebElement passwordField = driver.findElement(By.name("password"));
		
		userIDField.sendKeys(userID);
		passwordField.sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
		
		//verify login sucessful
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Test Failed: acutal title: " + actualTitle);
		}
		
		//close browser
		driver.close();

	}

}
