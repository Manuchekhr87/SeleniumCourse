package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver amazon = new ChromeDriver();
		
		amazon.get("https://www.amazon.com");
		Thread.sleep(2000);
		
		amazon.manage().window().maximize();
		Thread.sleep(2000);
		
		amazon.get("https://www.yahoo.com");
		Thread.sleep(2000);
		
		amazon.navigate().back();
		Thread.sleep(2000);
		
		amazon.navigate().forward();
		Thread.sleep(2000);
		
		amazon.close();

		



		

		

	}

}
