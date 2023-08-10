package appHooks;

import baseClass.basic;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class openquitHook extends basic{
	
	@Before
	public void open() {
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		impwait();
	}
	
	@After
	public void close() {
		driver.quit();
	}
}
