package selenium_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Window_Handling {
	public static  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
     System.out.println( driver.getWindowHandle());
     System.out.println( driver.getCurrentUrl());
     
        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
       System.out.println( driver.getWindowHandle());
     driver.switchTo().window("https://www.hyrtutorials.com/p/basic-controls.html");
    //    WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
    //    JavascriptExecutor js = (JavascriptExecutor) driver;
   //    js.executeScript("argument[0].scrollIntoview(true);", "First Name");
   //    firstname.sendKeys("Amruta");
       
}
}
