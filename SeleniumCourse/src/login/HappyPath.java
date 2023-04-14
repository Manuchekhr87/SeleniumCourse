package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HappyPath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https:\\login.salesforce.com");		
		Thread.sleep(3000);

		driver.findElement(By.id("username")).sendKeys("myusername"); // By.id("username") is a locator
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("mypassword");
		Thread.sleep(3000);
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
