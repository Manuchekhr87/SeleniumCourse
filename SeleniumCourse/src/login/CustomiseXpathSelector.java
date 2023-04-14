package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomiseXpathSelector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver customize = new ChromeDriver();
		
		customize.get("https://login.salesforce.com/");
		
		customize.findElement(By.xpath("//*[@type='email']")).sendKeys("xpath validation");
		
		customize.findElement(By.cssSelector("[id*='password']")).sendKeys("xpath validation");
		
		customize.findElement(By.cssSelector("input#Login")).click();
		
		Thread.sleep(2000);
		
		customize.close();
		
		
		
		
		
		
		

	}

}

////// ************** The explanation below is for creating a customize xpath and cssSelector ********************



//<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error" style="display: block;" xpath="1">

//<input class="input r4 wide mb16 mt8 password" type="password" id="password" name="pw" aria-describedby="error" aria-required="true" onkeypress="checkCaps(event)" autocomplete="off">

//<input class="button r4 wide primary" type="submit" id="Login" name="Login" value="Log In">


// Tagname -> input
// Attribute - > class 
// Value  -> input r4 wide mb16 mt8 password



//tagname[@Attribute='value'] this is the syntex for creating customize xpath 
//   1) version ----->   //input[@class='input r4 wide mb16 mt8 username']
//   2) version ----->   //input[@type='email'] 
//   3) version ----->  //*[@type='email'] ---- NOTES: in case of * you do not need tag name 


// Now lets create a custoize cssSelector -> In the case of cssSeletor we do not need two forward slashes meaning // 

// 1 example ------>      [type='password']
// 2 example ------>      [id*='password']
// 3 example ------>      input#Login    











