package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLogin extends BaseFunctions  {
	

	@Given("Open FB URL")
	public void openURL() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
Thread.sleep(5000);
	}

	@When("User enter invalid credentials")
	public void typecredentials() throws Exception {
		driver.findElement(By.id("email")).sendKeys("dl@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dhan9**");
		Thread.sleep(2000);

	}

	@And("Click on login button")
	public void clickonloginButton() throws Exception {
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);

	}

	@Then("Application should displays the validation message")
	public void verifyvalidationmessage() {
		if ( driver.findElements(By.linkText("Find your account and log in.")).size()>0){
			System.out.println("The given credentials are invalid");
		} else {
			System.out.println("The given credentials are valid");
		}

	}
}
