package EntrataInterview;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test(groups="regression")
public class Login {

	public static <softassert, assertion> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 String BaseURL= "http://www.demo.guru99.com/V4/";
		 driver.get(BaseURL);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("mngr546993");

		 driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("mAnAjyd");
		 driver.findElement(By.xpath("//*[@name=\"btnLogin\"]")).click();
		String currentURL= driver.getCurrentUrl();
		 
	SoftAssert S=new SoftAssert();
	S.assertEquals(currentURL, "https://www.demo.guru99.com/V4/manager/Managerhomepage.php");
	}

}
