package day6_listener;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//public class ListenerTest implements ITestListener throws InterruptedException {
//	
//	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
//	 WebDriver driver=new ChromeDriver();
//
//	@Override
//	public void onTestFailure(ITestResult result) {
//		//Convert web driver object to TakeScreenshot
//
//        TakesScreenshot scrShot =((TakesScreenshot)driver);
//
//        //Call getScreenshotAs method to create image file
//
//                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//            //Move image file to new destination
//
//                File DestFile=new File(fileWithPath);
//
//                //Copy file at destination
//
//                FileUtils.copyFile(SrcFile, DestFile);
//
//		ITestListener.super.onTestFailure(result);
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
//	}
//
//
