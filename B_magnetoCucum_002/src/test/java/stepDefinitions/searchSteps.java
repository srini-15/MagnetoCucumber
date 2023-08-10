package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import baseClass.basic;
import driverutilities.utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pompages.homepage;

public class searchSteps {
	private basic b;
	private utils u;
	private homepage hp;
	@Given("user should be in home page")
	public void user_should_be_in_home_page() throws InterruptedException {
		b= new basic();
		u= new utils();
		Assert.assertEquals("Home Page",b.title());
	    System.out.println(b.title());
	    hp= new homepage(basic.driver);
	    u.scroll(hp.prod);
	}

	@Given("enter the product in search tab as <{string}>")
	public void enter_the_product_in_search_tab_as(String product) throws InterruptedException {
		u= new utils();
		hp= new homepage(basic.driver);
		u.scroll(hp.search);
		hp.search(product);
		hp.select();
	}

	@When("user should be in product page")
	public void user_should_be_in_product_page() {
		b= new basic();
//		Assert.assertEquals("Search results for: &#039;tshirts for women&#039;",b.title());
		System.out.println(b.title());
	}

	@When("scroll down the product page")
	public void scroll_down_the_product_page() throws InterruptedException, IOException{
		u= new utils();
		hp= new homepage(basic.driver);
		u.scroll(hp.watch);
		u.screenshot();
	}
}
