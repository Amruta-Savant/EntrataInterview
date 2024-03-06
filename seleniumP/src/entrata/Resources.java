package entrata;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Resources extends Base_class {
	
	@Test(groups="Interview")
	public void productdropdown() throws InterruptedException {
		OpenBrowser();
	driver.get("https://www.entrata.com/");
	acceptcookie();
	Thread.sleep(2000);
	WebElement resources=driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[3]/div[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(resources).build().perform();
	WebElement Guide=driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[3]/div[1]"));
	AssertJUnit.assertTrue(Guide.isDisplayed());
	Guide.click();
	Browserclose();
	
	
	
		
	}

}
