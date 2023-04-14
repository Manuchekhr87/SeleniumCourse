package login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollUpDpwn {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver amazon = new ChromeDriver();
		
		amazon.get("https://www.amazon.com");
		Thread.sleep(2000);
		
		amazon.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor scroll = (JavascriptExecutor) amazon;
		
		scroll.executeScript("window.scrollBy(0, 250)");
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0, -250)");
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0, document.body.scrollHeight)","");
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0, -document.body.scrollHeight)","");
		Thread.sleep(2000);
		
		amazon.get("https://www.yahoo.com");
		Thread.sleep(2000);
		
		amazon.get("https://login.salesforce.com");
		Thread.sleep(2000);
		
		amazon.navigate().back(); //going back to yahoo.com
		Thread.sleep(2000);
		
		amazon.navigate().back(); // going back to amazon.com
		Thread.sleep(2000);
		
		
		amazon.close();


		



		
		
		
		

	}

}
