package webtablehandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StaticTable {

	public static <JavascriptExecutor> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 ((RemoteWebDriver) js).executeScript("window.scrollBy(0,250)", "");
	}

}
