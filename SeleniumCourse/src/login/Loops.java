package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loops {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver amazon = new ChromeDriver();
		
		amazon.get("https:\\www.amazon.com"); // this line of code will open the amazon website on chrome browser		
		Thread.sleep(2000);		
		
		

	}

}
