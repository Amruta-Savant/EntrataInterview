package entrata;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchDemo extends Base_class {
	@Test(groups="Interview")
	public void Watchdemo() throws InterruptedException
	{
		OpenBrowser();
		driver.get("https://www.entrata.com/");
		acceptcookie();
		WebElement watchdemo=driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[1]"));
		watchdemo.click();
		WebElement firstName=driver.findElement(By.xpath("//*[@id='FirstName']"));
		firstName.sendKeys("Amruta");
		WebElement LastName=driver.findElement(By.xpath("//*[@id='LastName']"));
		LastName.sendKeys("Savant");
		WebElement email=driver.findElement(By.xpath("//*[@id='Email']"));
		email.sendKeys("amrutasj16@gmail.com");
		WebElement companyName=driver.findElement(By.xpath("//*[@id='Company']"));
		companyName.sendKeys("Entrata");
		scrollpage();
	        WebElement phoneno=driver.findElement(By.xpath("//*[@id='Company']"));
	        phoneno.sendKeys("9380888735");
	       WebElement unitCount=driver.findElement(By.xpath("//*[@id=\"Unit_Count__c\"] "));  
	       Select se=new Select(unitCount);
	       se.selectByIndex(1);
	      WebElement jobTitle=driver.findElement(By.xpath("//*[@id='Title']"));
	      jobTitle.sendKeys("Test Engineer");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      WebElement Iam=driver.findElement(By.xpath("//*[@id=\"demoRequest\"] "));  
	      Select select=new Select(Iam);
	      select.selectByIndex(2);
	      Browserclose();
	    
	}

}
