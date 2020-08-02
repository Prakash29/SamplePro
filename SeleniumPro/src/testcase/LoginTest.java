package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomdemo.Loginpage;

public class LoginTest
{
@Test
public void login()
{
	System.setProperty("webdriver.chrome.driver" , "D:\\\\AutomationSetup\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	
	Loginpage login =new Loginpage();
	
	login.username();
	
	login.pass();
	
	login.loginbtn();
	
	driver.quit();
	
}
}
