package com.cg.trg.casestudy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasicFormPageFactory {
	WebDriver driver;

	@FindBy(how = How.NAME, using = "companyName")
	@CacheLookup
	WebElement companyName;

	@FindBy(xpath = "/html/body/div/form/input[2]")
	@CacheLookup
	WebElement name;

	@FindBy(xpath = "/html/body/div/form/input[3]")
	@CacheLookup
	WebElement city;

	@FindBy(xpath = "/html/body/div/form/input[4]")
	@CacheLookup
	WebElement password;

	/*@FindBy(xpath = "/html/body/div/form/input[5]")
	@CacheLookup
	WebElement genderM;

	@FindBy(xpath = "/html/body/div/form/input[6]")
	@CacheLookup
	WebElement genderF;*/
	
	@FindBy(name="gender")
	@CacheLookup
	List<WebElement>  gender;

	/*@FindBy(xpath = "//*[@id=\"engid\"]")
	@CacheLookup
	WebElement languageEng;

	@FindBy(xpath = "//*[@id=\"tamid\"]")
	@CacheLookup
	WebElement languageTam;

	@FindBy(xpath = "//*[@id=\"telid\"]")
	@CacheLookup
	WebElement languageTel;*/
	
	@FindBy(name="lang")
	@CacheLookup
	List<WebElement> language;

	@FindBy(name = "country")
	@CacheLookup
	WebElement country;

	@FindBy(xpath = "/html/body/div/form/input[11]")
	@CacheLookup
	WebElement myNumber;

	@FindBy(xpath = "/html/body/div/form/input[12]")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "/html/body/div/form/input[13]")
	@CacheLookup
	WebElement mobileNumber;

	@FindBy(xpath = "/html/body/div/form/input[14]")
	@CacheLookup
	WebElement alternatenumber;

	@FindBy(xpath = "/html/body/div/form/input[15]")
	@CacheLookup
	WebElement button;

	public WebElement getButton() {
		return button;
	}

	public void setButton() {
		button.click();
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPassword() {
		return password;
	}



	

	public WebElement getCountry() {
		return country;
	}

	public WebElement getMyNumber() {
		return myNumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getAlternatenumber() {
		return alternatenumber;
	}

	public void setCompanyName(String companyName) {
		// this.companyName = companyName;
		this.companyName.sendKeys(companyName);
	}

	public void setName(String name) {
		// this.name = name;
		this.name.sendKeys(name);
	}

	public void setCity(String city) {
		this.city.sendKeys(city);// this.city = city;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
		// this.password = password;
	}



	

	public void setCountry(int index) {
		      Select drop = new Select(country);
		      drop.selectByIndex(index);
		}
	
	public void setMyNumber(String myNumber) {
		this.myNumber.sendKeys(myNumber);
		// this.myNumber = myNumber;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
		// this.email = email;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber.sendKeys(mobileNumber);
		// this.mobileNumber = mobileNumber;
	}

	public void setAlternatenumber(String alternatenumber) {
		this.alternatenumber.sendKeys(alternatenumber);
		// this.alternatenumber = alternatenumber;
	}


	
	

	
	public List<WebElement> getGender() {
		return gender;
	}

	

	public void setGender(String gen) {
		if(gen.equalsIgnoreCase("male"))
		{
			this.gender.get(0).click();
		}
		else if(gen.equalsIgnoreCase("female"))
		{
			this.gender.get(1).click();
		}
		else
		{
			
		}
	} 
	
	public void setLanguage(List<Integer> lang) {
		
		Iterator<Integer> it = lang.iterator();
		while(it.hasNext()){
			int a = it.next();
			if(a == 1){
			this.language.get(0).click();} 
		else if(a == 2){
				this.language.get(1).click();}
			else if(a == 3){
				this.language.get(2).click();}
			else{	}
		} 
}
	public BasicFormPageFactory() {

	}

	
	
	public BasicFormPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
