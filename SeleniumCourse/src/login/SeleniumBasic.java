package login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver amazon = new ChromeDriver();
		
		amazon.get("https://www.amazon.com");
		
		Thread.sleep(2000);
		
		amazon.manage().window().maximize();
		
		JavascriptExecutor scroll = (JavascriptExecutor) amazon;
		
		scroll.executeScript("window.scrollBy(0, 250)");
				
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0, -250)");
		
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0, document.body.scrollHeight)", "");
		
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0, -document.body.scrollHeight)", "");
		
		amazon.get("https://yahoo.com");
		
		Thread.sleep(2000);
		
		amazon.get("https://login.salesforce.com/");
		
		amazon.navigate().back();
		
		amazon.navigate().back();
		
		Thread.sleep(2000);
		
		amazon.navigate().forward();
		
		Thread.sleep(2000);
		
		amazon.close();
		
			
		
	}

}
