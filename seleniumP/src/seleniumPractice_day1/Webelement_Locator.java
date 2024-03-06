package seleniumPractice_day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Webelement_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://adminlte.io/themes/AdminLTE/pages/UI/general.html");
 driver.manage().window().maximize();
 driver.findElement(By.xpath("//*[text()='Forms']")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[text()=' General Elements']")).click();
 driver.findElement(By.id("exampleInputEmail1")).sendKeys("amrutas@gmail.com");
 driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
 Thread.sleep(2000);

// driver.findElement(By.xpath("//*[@id='exampleInputFile']")).click();

 

 
	}

}
