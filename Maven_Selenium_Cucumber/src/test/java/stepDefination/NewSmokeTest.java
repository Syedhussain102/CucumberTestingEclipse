package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewSmokeTest {
	WebDriver driver;
	@Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/sreejon/Desktop/develop/drivers/chromedriver");
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@When("^I enter valid \"(.*?)\"$")
	public void i_enter_valid(String uname) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(uname);
	}

	@When("^valid \"(.*?)\"$")
	public void valid(String pass) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.quit();
	}
	
}