package login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");		
		WebDriver amazon = new ChromeDriver();
		
		amazon.get("https:\\www.amazon.com"); // this line of code will open the amazon website on chrome browser		
		Thread.sleep(2000);
		
		amazon.manage().window().maximize(); // this line will maximize the browser
		Thread.sleep(2000);
		
		JavascriptExecutor scroll = (JavascriptExecutor) amazon;
		
		scroll.executeScript("window.scrollBy(0, 350)"); // this line will scroll down by 350 pixels
		Thread.sleep(2000);

		scroll.executeScript("window.scrollBy(0, -350)"); // this line will scroll up by 350 pixels
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0, document.body.scrollHeight)",""); // this line will scroll all the way down
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0, -document.body.scrollHeight)",""); // this line will scroll all the way up
		Thread.sleep(2000);
		
		amazon.get("https://www.hotmail.com"); // this line of code will open the hotmail website on chrome browser	
		Thread.sleep(2000);
		
		amazon.navigate().back(); // this line will go back to amazon website on chrome browser
		Thread.sleep(2000);
		
		amazon.navigate().forward(); // this line will go back to hotmail website on chrome browser
		Thread.sleep(2000);
		
		amazon.close(); // this line will close the the browser and actions



	

		

		
		
		
		
		
		
		

	}

}
