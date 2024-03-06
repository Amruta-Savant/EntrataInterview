package selenium_day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_handling {

	

	public static void main(String[] args) {
		 	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
		 driver.get("https://cosmocode.io/automation-practice-webtable/");
	
	List<WebElement> wb= driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td")); 
		int columncount=wb.size(); 
		System.out.println(columncount);
		
		List<WebElement>rowcount=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[1]"));
	//	 
		System.out.println(rowcount.size());
	for(int i=1;i<=rowcount.size();i++)
	{
		
		
		WebElement primaryLan=driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+ i +"]/td[5]/h3/strong"));
	//if(primaryLan.getText().equals("English"))
//	{
	System.out.println(true);
		
		//System.out.println(driver.findElement(By.xpath("/table[@id='countries']/tbody/tr["+i+"]/td[5]")).getText()+" |");
	//}
	
		
	}
	}
	}



