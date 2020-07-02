package UnitApitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebdriverTest {
  @Test
  public void webdriverTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "G:\\Apkapp\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Assert.assertEquals("https://www.google.com/",currentUrl );
	  
	  
  }
}
