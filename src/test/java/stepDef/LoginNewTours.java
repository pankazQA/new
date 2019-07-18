package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import common.BaseNewTours;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

public class LoginNewTours extends BaseNewTours{
	
	HomePage hp;
	
	@Given("^I am on the newtours homepage$")
	public void i_am_on_the_newtours_homepage() {
		driver = getDriver();
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter(String userName, String userPass) {
		hp = new HomePage(driver);
		//driver.findElement(By.name("userName")).sendKeys(userName);
		hp.enterUserName().sendKeys(userName);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(userPass);
		hp.enterUserPass().sendKeys(userPass);
	}

	@When("^I click login$")
	public void i_click_login() {
		driver.findElement(By.name("login")).click();
	}

	@Then("^I find flight reservation page$")
	public void i_find_flight_reservation_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
		driver.close();
	}

}
