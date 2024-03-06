package entrata;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Base_class {
	public WebDriver driver;
	
	

	public void OpenBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.manage().window().maximize();
	}
	
	
	public void Browserclose()
	{
		driver.quit();
	}
	
	public void acceptcookie()
	{
		WebElement cookie=driver.findElement(By.xpath("//*[@id='rcc-confirm-button']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rcc-confirm-button']")));
		cookie.click();
	}
	public void scrollpage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("window.scrollBy(0,1000)");
	}
	
	

}
