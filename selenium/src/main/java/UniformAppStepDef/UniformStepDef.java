package UniformAppStepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UniformStepDef {
	
	
    public WebDriver wd;
    
@Given("I Navigate to Unform Application by entering valid URL")
public void i_navigate_to_unform_application_by_entering_valid_url() throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\028165744\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
	wd = new ChromeDriver();
	wd.manage().window().maximize();
    Thread.sleep(2000);
    // Navigating to URL
    wd.get("http://uniformm1.upskills.in/");
    Thread.sleep(5000);
}

@When("I click on My Account Icon")
public void i_click_on_my_account_icon() throws InterruptedException {
   
   wd.findElement(By.xpath("//a[@title='My Account']")).click();
   Thread.sleep(2000);
}

@When("I click on Register link")
public void i_click_on_register_link() throws InterruptedException {
    
    wd.findElement(By.xpath("//a[contains(.,'Register')]")).click();
	Thread.sleep(5000);
}

@Then("I validate that Registration page is displayed")
public void i_validate_that_registration_page_is_displayed() {
    
	String pageTitle = wd.getTitle();
	System.out.println(pageTitle);
	
	  if (pageTitle.equals("Register Account")) 
	  {
	  System.out.println("Registration page is displayed successfully"); 
	  }
	  else
	  {
		  System.out.println("Registration page is not displayed"); 
		  
	  }
}

@Then("I fill in the data in required fields")
public void i_fill_in_the_data_in_required_fields() throws InterruptedException {
    
	wd.findElement(By.name("firstname")).sendKeys("Prakash");
	wd.findElement(By.name("lastname")).sendKeys("Telharkar");
	wd.findElement(By.name("email")).sendKeys("ptelharkar8@mailinator.com");
	wd.findElement(By.name("telephone")).sendKeys("9850540670");
	wd.findElement(By.name("address_1")).sendKeys("10 Street");
	wd.findElement(By.name("address_2")).sendKeys("Near Peter Cafe");
	wd.findElement(By.name("city")).sendKeys("Pune");
	wd.findElement(By.name("postcode")).sendKeys("411043");
	Select country = new Select(wd.findElement(By.name("country_id")));
	country.selectByVisibleText("India");
	
	Select postcode = new Select(wd.findElement(By.id("input-zone")));
	postcode.selectByVisibleText("Maharashtra");
	wd.findElement(By.name("password")).sendKeys("Prakash123");
	wd.findElement(By.name("confirm")).sendKeys("Prakash123");
	wd.findElement(By.xpath("//input[@name='newsletter'][@value='0']")).click();
	wd.findElement(By.xpath("//input[@name='agree'][@value='1']")).click();
	Thread.sleep(5000);
	
	
	}


@Then("Click on Continue button")
public void click_on_continue_button() {
    
	wd.findElement(By.xpath("//input[@type='submit'][@value='Continue']")).click();
}

@Then("I validate that Account is created successfully")
public void i_validate_that_account_is_created_successfully() {
   
	String actText= wd.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText();
	System.out.println(actText);
	String expText = "Congratulations! Your new account has been successfully created!";
	Assert.assertEquals(expText,actText);
	
}


@When("I click on Login link")
public void i_click_on_login_link() throws InterruptedException {
    
	wd.findElement(By.xpath("//li/a[contains(.,'Login')]")).click();
	Thread.sleep(5000);
}

@When("I enter valid login credentials")
public void i_enter_valid_login_credentials() {
   
	wd.findElement(By.name("email")).sendKeys("ptelharkar@mailinator.com");
	wd.findElement(By.name("password")).sendKeys("Prakash123");
}

@When("I click on Login button")
public void i_click_on_login_button() throws InterruptedException {
    
	wd.findElement(By.xpath("//input[@type='submit'][@value='Login']")).click();
	Thread.sleep(4000);
}

@Then("I validate that My Account page is displayed")
public void i_validate_that_my_account_page_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	String ExpLoginText = "MY ACCOUNT";
	String ActualLoginText = wd.findElement(By.xpath("//div[@class='col-sm-9']/h1")).getText();
	Assert.assertEquals(ExpLoginText, ActualLoginText);
}

@Then("I enter login credentials")
public void i_enter_login_credentials() {
    
	wd.findElement(By.name("email")).sendKeys("ptelharkar2@mailinator.com");
	wd.findElement(By.name("password")).sendKeys("Prakash12");
}

@Then("I validate that Warning message for No Match is displayed")
public void i_validate_that_warning_message_for_no_match_is_displayed() {
    
	String expWarningText = "Warning: No match for E-Mail Address and/or Password.";
	String actWarningText= wd.findElement(By.xpath("//div[contains(text(),'Warning: No match')]")).getText();
	Assert.assertEquals(expWarningText,actWarningText);
	
}

@Then("I click on Forgot Password link")
public void i_click_on_forgot_password_link() {
    
	
	wd.findElement(By.linkText("Forgotten Password")).click();
}

@Then("I validate that password retrieval page is displayed")
public void i_validate_that_password_retrieval_page_is_displayed() {
    
	String ExpPassPageText = "FORGOT YOUR PASSWORD?";
	String ActPassPageText = wd.findElement(By.xpath("//div[@class='col-sm-9']/h1")).getText();
	Assert.assertEquals(ExpPassPageText, ActPassPageText);
}

@Then("I enter registered email in email address text box")
public void i_enter_registered_email_in_email_address_text_box() {
    
	wd.findElement(By.name("email")).sendKeys("ptelharkar2@mailinator.com");
}

@Then("click on Continue button on forgot password page")
public void click_on_continue_button_on_forgot_password_page() {
    
	wd.findElement(By.xpath("//input[@type='submit'][@value='Continue']")).click();
}

@Then("I validate that appropriate message is displayed")
public void i_validate_that_appropriate_message_is_displayed() {
    
	String expConfText = "An email with a confirmation link has been sent your email address.";
	String actConfText= wd.findElement(By.xpath("//div[contains(text(),'An email with a confirmation link')]")).getText();
	Assert.assertEquals(expConfText, actConfText);
}

@Then("I close the browser")
public void i_close_the_browser() {
    try {
    wd.quit();
    }
    catch (Exception e) {
    	e.printStackTrace();
    }
}

}
