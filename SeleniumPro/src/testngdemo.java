
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class testngdemo<driver>
{  

	@Test
	
		public void lounch()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationSetup\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.logfile", "./ alltestog.txt");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		Assert.assertEquals("https://demoqa.com/", "https://demoqa.com/");
		Assert.fail("Site opemd");

		
		
	
		driver.close();
		driver.quit();
		
		
		
	}
	

		
	
}
