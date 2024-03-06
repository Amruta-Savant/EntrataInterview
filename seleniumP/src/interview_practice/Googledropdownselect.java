package interview_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Googledropdownselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.xpath("//*[@id='APjFqb']"));
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		textbox.sendKeys("tester");	
//		List<WebElement> list=new List
//		List<WebElement> list = (List<WebElement>) driver.findElement(By.tagName("li");
//		 int count=list.size();
//		 System.out.println(count+"+++++");
//for (int i=0;i<=list.size()-1;i++)
//{
//	String dropdown=list.get(i).getText();
//	System.out.println( dropdown);
//	if(dropdown.contains("tester")) {
//		list.get(i).click();
//	
//		break;
//
//}
//	}
//


}

	
		
	}

	

