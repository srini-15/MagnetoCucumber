package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static WebDriver driver= new ChromeDriver();
	
	public void impwait() {
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public String title() {
		return driver.getTitle();
	}
	
}
