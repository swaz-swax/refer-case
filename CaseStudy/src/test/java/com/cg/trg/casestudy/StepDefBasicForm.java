package com.cg.trg.casestudy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefBasicForm {
	private BasicFormPageFactory pagefactory;
	private WebDriver driver;
//------------------------------------------------------------------
	@Given("^check user name$")
	public void check_user_name() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	}

	@When("^enter empty value in user name text box$")
	public void enter_empty_value_in_user_name_text_box() throws Throwable {
		pagefactory.setName("");
		pagefactory.setButton();
	}

	@Then("^print error message for name field$")
	public void print_error_message_for_name_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.quit();
	}
	
//------------------------------------------------------------------
	@Given("^check user city$")
	public void check_user_city() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	
	}

	@When("^enter empty value in city text box$")
	public void enter_empty_value_in_city_text_box() throws Throwable {
		pagefactory.setName("Swarup");
		pagefactory.setCity("");
		pagefactory.setButton();
	}

	@Then("^print error message for city field$")
	public void print_error_message_for_city_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	}
	
//------------------------------------------------------------------
	@Given("^check user password$")
	public void check_user_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	
	}

	@When("^enter empty value in password text box$")
	public void enter_empty_value_in_password_text_box() throws Throwable {
		pagefactory.setName("Swarup");
		pagefactory.setCity("Kolkata");
		pagefactory.setPassword("");
		pagefactory.setButton();
	}

	@Then("^print error message for password field$")
	public void print_error_message_for_password_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	}
	
//------------------------------------------------------------------
	@Given("^check user gender$")
	public void check_user_gender() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	
	}

	@When("^user forgot to select gender$")
	public void user_forgot_to_select_gender() throws Throwable {
		pagefactory.setName("Swarup");
		pagefactory.setCity("Kolkata");
		pagefactory.setPassword("Swaio276");
		
		
		pagefactory.setButton();
	}

	@Then("^print error message for gender field$")
	public void print_error_message_for_gender_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	}
	
//------------------------------------------------------------------
	@Given("^check user language$")
	public void check_user_language() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	
	}

	@When("^user forgot to check language check box$")
	public void user_forgot_to_check_language_check_box() throws Throwable {
		pagefactory.setName("Swarup");
		pagefactory.setCity("Kolkata");
		pagefactory.setPassword("Swaio276");
		pagefactory.setGender("male");
		
		pagefactory.setButton();
	}

	@Then("^print error message for language field$")
	public void print_error_message_for_language_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	}
	
//------------------------------------------------------------------
	@Given("^check user country$")
	public void check_user_country() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	
	}

	@When("^user forgot to select country from drop down$")
	public void user_forgot_to_select_country_from_drop_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pagefactory.setName("Swarup");
		pagefactory.setCity("Kolkata");
		pagefactory.setPassword("Swaio276");
		pagefactory.setGender("male");
		List<Integer> l1= new ArrayList<Integer>();
	    l1.add(1);
	    l1.add(2);
	    pagefactory.setLanguage(l1); 
	   
		pagefactory.setButton();
	}

	@Then("^print error message for country field$")
	public void print_error_message_for_country_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	}
//-----------------------------------------------------------------------
	@Given("^check user MyNumber$")
	public void check_user_MyNumber() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	}

	@When("^enter empty value in My number text box$")
	public void enter_empty_value_in_My_number_text_box() throws Throwable {
		pagefactory.setName("Swarup");
		pagefactory.setCity("Kolkata");
		pagefactory.setPassword("Swaio276");
		pagefactory.setGender("male");
		List<Integer> l1= new ArrayList<Integer>();
	    l1.add(1);
	    l1.add(2);
	    pagefactory.setLanguage(l1); 
	    
	    pagefactory.setCountry(1);
		pagefactory.setMyNumber("");
		pagefactory.setButton();
	}

	@Then("^print error message for My number field$")
	public void print_error_message_for_My_number_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	}

//------------------------------------------------------------------
	@Given("^check user email$")
	public void check_user_email() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	
	}

	@When("^enter empty value in email text box$")
	public void enter_empty_value_in_email_text_box() throws Throwable {
		pagefactory.setName("Swarup");
		pagefactory.setCity("Kolkata");
		pagefactory.setPassword("Swaio276");
		pagefactory.setGender("female");
		List<Integer> l1= new ArrayList<Integer>();
	    l1.add(1);
	    l1.add(2);
	    pagefactory.setLanguage(l1);
	    pagefactory.setCountry(1);
		pagefactory.setMyNumber("40");
		pagefactory.setEmail("");
		pagefactory.setButton();
	}

	@Then("^print error message for email field$")
	public void print_error_message_for_email_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	}
	
	
//------------------------------------------------------------------
	@Given("^check user Mobile Number$")
	public void check_user_Mobile_Number() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	}

	@When("^enter empty value in Mobile number text box$")
	public void enter_empty_value_in_Mobile_number_text_box() throws Throwable {
		pagefactory.setName("Swarup");
		pagefactory.setCity("Kolkata");
		pagefactory.setPassword("Swaio276");
		pagefactory.setGender("female");
		List<Integer> l1= new ArrayList<>();
	    l1.add(1);
	    l1.add(2);
	    pagefactory.setLanguage(l1);
	    pagefactory.setCountry(1);
		pagefactory.setMyNumber("40");
		pagefactory.setEmail("swarup@bvrrn.com");
		pagefactory.setMobileNumber("");
		
		pagefactory.setButton();
	}

	@Then("^print error message for Mobile number field$")
	public void print_error_message_for_Mobile_number_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	}
	
//------------------------------------------------------------------
	@Given("^check user details$")
	public void check_user_details() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swarup Talukdar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory = new BasicFormPageFactory(driver);
		driver.get("file://C:/Users/Swarup Talukdar/Downloads/STS/STS/STS_Workspace/My/CaseStudy/src/test/java/features/Basicform.html");
	}

	@When("^entered all valid datas$")
	public void entered_all_valid_datas() throws Throwable {
		pagefactory.setName("Swarup");
		pagefactory.setCity("Kolkata");
		pagefactory.setPassword("Swaio276");
		pagefactory.setGender("female");
		List<Integer> l1= new ArrayList<Integer>();
	    l1.add(1);
	    l1.add(2);
	    pagefactory.setLanguage(l1);
	    pagefactory.setCountry(1);
		pagefactory.setMyNumber("40");
		pagefactory.setEmail("swarup@bvrrn.com");
		pagefactory.setMobileNumber("7859641230");
		
		pagefactory.setButton();
	}

	@Then("^print success message$")
	public void print_success_message() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	}


@Then("^navigate to login page$")
public void navigate_to_login_page() throws Throwable {
    driver.navigate().to("login.html");
    Thread.sleep(2000);
    driver.navigate().to("features//register.html");
    Thread.sleep(2000);
	driver.close();
}
}