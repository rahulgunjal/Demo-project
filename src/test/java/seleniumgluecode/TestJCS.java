package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TestJCS
{
	public WebDriver driver;
	
	@Given("^user is  on homepage$") 
	public void user_is_on_homepage() throws Throwable
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Downloads\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://automationpractice.com/index.php");
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page()
	{
	    driver.findElement(By.linkText("Sign in")).click();
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable 
	{
	   driver.findElement(By.id("email")).sendKeys("rahul.gunjal@successive.tech");
	   driver.findElement(By.id("passwd")).sendKeys("Rahul@12345");
	   driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable 
	{
	    String msg = "Welcome to your account. Here you can manage all of your personal information and orders.";
		
	    String actual = driver.findElement(By.cssSelector(".info-account")).getText();
		
		Assert.assertEquals(msg,actual);
		
		driver.quit();
	}
}