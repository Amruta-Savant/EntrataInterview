package entrata;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import graphql.Assert;

public class baseCamp extends Base_class {

	@Test(groups="Interview")
	public void basecamp() throws InterruptedException
	{
		OpenBrowser();
		driver.get("https://www.entrata.com/");
		acceptcookie();
		WebElement baseCamp=driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[4]/a"));
		baseCamp.click();
	Set<String> ID=	driver.getWindowHandles();
	System.out.println(ID);
	Iterator<String> it = ID.iterator();
	String parentWindowID = it.next();
	String childWindowID = it.next();
	driver.switchTo().window(childWindowID);
	Thread.sleep(5000);
	WebElement registornowbtn=driver.findElement(By.xpath("//*[text()='Register Now']"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Register Now']")));
	registornowbtn.click();
	scrollpage();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement name=driver.findElement(By.xpath("//*[@id=\"56aeaca6-a0ad-4548-8afc-94d8d4361ba1\"]"));
	name.sendKeys("vivek");
	WebElement Lastname=driver.findElement(By.xpath("//*[@id=\"cfc98829-80b7-41b6-82b5-b968d43ef1c1\"]"));
	Lastname.sendKeys("Savant");
	WebElement company=driver.findElement(By.xpath("//*[@id=\"227f50d0-f65b-4a72-9a4f-5060ea05f6ab\"]"));
	company.sendKeys("Doshaheen solutions");
	WebElement Title=driver.findElement(By.xpath("//*[@id=\"228cc308-a4d9-4212-8454-8407dd578c3d\"]"));
	Title.sendKeys("Doshaheen solutions");
	WebElement Email=driver.findElement(By.xpath("//*[@id=\"ff919d05-4281-4d9c-aa0d-82e3722d580d\"]"));
	Email.sendKeys("amrutasj16@gmail.com");
	WebElement phoneNo=driver.findElement(By.xpath("//*[@id=\"032e80c1-f29f-44e6-af13-a89e53906422\"]"));
	phoneNo.sendKeys("9380828735");
	WebElement cancel=driver.findElement(By.xpath("//*[@id=\"exit\"]"));
	WebElement next=driver.findElement(By.xpath("//*[@id=\"forward\"]"));
	AssertJUnit.assertTrue(next.isDisplayed());
	AssertJUnit.assertTrue(cancel.isDisplayed());
	Thread.sleep(5000);
	cancel.click();
	Browserclose();

	
	
	
		
		
		
	}

}
