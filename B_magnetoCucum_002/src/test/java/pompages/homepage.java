package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.basic;

public class homepage extends basic{

	@FindBy(id="search")
	public WebElement search;
	
	@FindBy(xpath="//li/../descendant::span[text()=' tshirts for women']")
	private WebElement select;
	
	@FindBy(xpath="//h2[text()='Hot Sellers']")
	public WebElement prod;
	
	@FindBy(xpath="(//span[@class=\"product-image-wrapper\"])[10]")
	public WebElement watch;
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void search(String product) {
		search.sendKeys(product);
	}
	
	public void select() {
		select.click();
	}
}
