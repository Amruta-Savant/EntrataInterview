package entrata;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sign_in extends Base_class {
	
	
	@Test(groups="Interview")
	public void SignIn()
	{
	OpenBrowser();
	driver.get("https://www.entrata.com/");
	acceptcookie();
	WebElement signin=	driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]"));
	signin.click();
	scrollpage();
    WebElement managerLogin= driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[1]"));
    managerLogin.click();
    WebElement Username=driver.findElement(By.xpath("//*[@id=\"entrata-username\"]"));
	Username.sendKeys("Amruta");
	WebElement password=driver.findElement(By.xpath("//*[@id=\"entrata-password\"]"));
	password.sendKeys("test1234");
	Browserclose();
	  
	  
	}

	

}
