package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBloginValid extends BaseFunctions {

	@When("User enter valid credentials")
	public void typecredentials() throws Exception {
		driver.findElement(By.id("email")).sendKeys("dhanalakshmi44430@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("lakshmi9988*");
		Thread.sleep(2000);

	}

	@Then("Logout functionality")
	public void logout() throws Exception {
	}
}
