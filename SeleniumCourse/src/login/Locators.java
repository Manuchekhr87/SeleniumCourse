package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver locators = new ChromeDriver();
		
		locators.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		locators.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		Thread.sleep(2000);
		
		locators.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		Thread.sleep(1000);
		
		locators.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[5]/a")).click();
		
		Thread.sleep(1000);
		
		locators.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[2]/li[4]/a")).click();
		
		Thread.sleep(1000);
		
		locators.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > table > tbody > tr:nth-child(4) > td:nth-child(4) > a")).click();
		
		
		locators.close();
		
		
		
	}

}

// <input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error" style="display: block;" xpath="1">

// <input class="input r4 wide mb16 mt8 password" type="password" id="password" name="pw" aria-describedby="error" aria-required="true" onkeypress="checkCaps(event)" autocomplete="off">

// <input class="button r4 wide primary" type="submit" id="Login" name="Login" value="Log In">


//    Tagname -> input
//    Attribute - > 


//Tagname -> input
//Attribute - > class 
//Value  -> input r4 wide mb16 mt8 password



//tagname[@Attribute='value'] this is the syntex for creating customize xpath 
//1) version ----->   //input[@class='input r4 wide mb16 mt8 username']
//2) version ----->   //input[@type='email'] 
//3) version ----->  //*[@type='email'] ---- NOTES: in case of * you do not need tag name 


//Now lets create a custoize cssSelector -> In the case of cssSeletor we do not need two forward slashes meaning // 

//1 example ------>      [type='password']
//2 example ------>      [id*='password']
//3 example ------>      input#Login






















