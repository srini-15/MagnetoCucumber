package driverutilities;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import baseClass.basic;

public class utils extends basic {

	public void scroll(WebElement ele) throws InterruptedException {
	JavascriptExecutor js= (JavascriptExecutor) driver;
	int x= ele.getLocation().getX();
	int y=ele.getLocation().getY();
	js.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(3000);
	}
	
	public void screenshot() throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./src/test/resources/snapshot/snap.png");
		FileUtils.copyFile(src, dest);
	}
}
