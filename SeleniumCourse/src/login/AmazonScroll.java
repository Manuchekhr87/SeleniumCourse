package login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScroll {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver amazon= new ChromeDriver();
		
		amazon.get("https://www.amazon.com/"); 
		
		Thread.sleep(4000);
		
		amazon.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) amazon;
		
		js.executeScript("window.scrollBy(0,250)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(2000);
		
		js.executeScript("scroll(0, -250);");
		
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		
		Thread.sleep(4000);
		
		amazon.close();
		
		
		
		
		
		

	}

}
