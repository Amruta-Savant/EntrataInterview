package selenium_day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		 List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
			int rowcount=rows.size();
			System.out.println("Number of rows are:"+rowcount);
		
		 for (int i=2;i<=rowcount;i++)
		 {
				
			 List<WebElement> column=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
				int columncount=column.size();
				//System.out.println("Number of column are:"+columncount);
		for(int j=1;j<=columncount;j++)
		{
			 
			 WebElement table=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
	System.out.print(table.getText()+ "|");
		 }
		 System.out.println();
			
		 
	}
		
}
	

}
