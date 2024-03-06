package seleniumPractice_day1;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;


public class OpenBrowser  {

	public static  void main(String[] args) throws InterruptedException, IOException {
	  
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	Files.copy(f, new File("D:\\word\\ss\\test.jpg"));
	Thread.sleep(2000);
	WebElement signin=driver.findElement(By.linkText("Sign in"));
	signin.click();
	WebElement email=driver.findElement(By.id("identifierId"));
	email.click();
	email.sendKeys("amrutasj16@gmail.com");
	driver.navigate().back();
	WebElement link=driver.findElement(By.linkText("Learn more"));
	link.click();
	
	}
	
	
}



