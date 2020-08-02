import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Listeners;

public class BrowserDemo {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationSetup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--startmaximised");
		opt.addArguments("--disable-popup-bolcking");
	
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		Assert.assertEquals("https://demoqa.com/", "https://demoqa.com/");
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		
		String s1= driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		System.out.println(s1);
		
		
     
	}

}
