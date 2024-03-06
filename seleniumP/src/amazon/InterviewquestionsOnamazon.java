package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InterviewquestionsOnamazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@title='Dropdown with more help links']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@title='Dropdown with more help links']/parent::div/following-sibling::ul/a/li[1]/div")).click();
	//	 driver.findElement(By.name("Baby")).click();
//		 Select se=new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
//   List<WebElement> li=se.getOptions();
//   System.out.println(li);
	}

}
