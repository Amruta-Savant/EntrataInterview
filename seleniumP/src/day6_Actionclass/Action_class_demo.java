package day6_Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		 driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		 driver.wait();
		 Actions act=new Actions(driver);
		// Thread.sleep(2000);
		 act.doubleClick(driver.findElement(By.xpath("(//*[@class='btn btn_primary btn_small btn_inventory '])[1]")));
	//	 act.sendKeys(Keys.ESCAPE).build().perform();
		// act.moveToElement(driver.findElement(By.xpath("//*[@alt='Fashion']"))).build().perform();
		// act.click(driver.findElement(By.xpath("//*[@text='Men's T-Shirts']"))).perform();

	}

}
