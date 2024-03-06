package selenium_day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	driver.findElement(By.xpath("//input[@type='text']//following-sibling::input[2]")).sendKeys("Amr@gmail.com");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@type='text']//following-sibling::input[2]//..//child::label[4]")).sendKeys("1234");
	

	}

}
