package step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Verify_landing_page extends Base {

	@Given("I am in Daraz.com.bd")
	public void i_am_in_daraz_com_bd() {
	   navigateUrl("https://www.daraz.com.bd/");
	}

	@Given("I want to view the logo in left top side")
	public void i_want_to_view_the_logo_in_left_top_side() {
	Boolean isLOgoExists =  driver.findElement(By.xpath("//img[@src='//laz-img-cdn.alicdn.com/images/ims-web/TB1HOIkg3ZC2uNjSZFnXXaxZpXa.png']")).isDisplayed();
	Boolean expected = true;
	assertEquals(isLOgoExists, expected);
	}

	@Given("I want to view to search bar in middle")
	public void i_want_to_view_to_search_bar_in_middle() {
	 Boolean isSearchBarExists =  driver.findElement(By.xpath("")).isDisplayed();
	 Boolean expected = true;
		assertEquals(isSearchBarExists, expected);
	}

	@Given("There must be a search button next to search bar")
	public void there_must_be_a_search_button_next_to_search_bar() {
	  
	}

	@Given("Also I want to view cart option")
	public void also_i_want_to_view_cart_option() {
	   
	}

	@Then("I want a Category option")
	public void i_want_a_category_option() {
	  
	}

	@Then("In category there must be sixteen categories")
	public void in_category_there_must_be_sixteen_categories() {
	   
	}

}
