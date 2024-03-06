package selenium_day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;

public class Select_class_and_Alert {

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
		
		 Select se=new Select(driver.findElement(By.tagName("select")));
		 se.selectByIndex(1);
		 
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
	//	driver.findElement(By.xpath("//*[@class=\"btn btn-danger\"]")).click();
	//	 Alert  obj= driver.switchTo().alert();
	//	obj.accept();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-info']")).click();
	 Alert  obj= driver.switchTo().alert();
	
	obj.getText();
	
	System.out.println(obj.getText());

	
	}
	

}
