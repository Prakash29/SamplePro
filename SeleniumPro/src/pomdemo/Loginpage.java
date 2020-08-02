package pomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage
{
	
 WebDriver driver;
 
 By username= By.xpath("//input[@type='email']");
 
 By pass= By.xpath("//input[@name='password']");
 
 By logibtn=By.xpath("//*[@id=\"passwordNext\"]/span/span");

/* @FindBy (xpath="//input[@type='email']")
 WebElement user;*/
 
 public Loginpage()
 {
	 this.driver=driver;
 }
 public void username()
 {
	driver.findElement(username).sendKeys("prakashsonawane95@gmail.com");
 }
 
 public void pass()
 {
	 driver.findElement(pass).sendKeys("9511338833");
 }
 public void loginbtn() {
	 driver.findElement(logibtn).click();
 }
}