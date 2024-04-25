package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class AddNewCustomerPage extends BasePage {

	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	private static WebElement btnCustomers;

	@FindBy(how = How.XPATH, using = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	private static WebElement btnCustomer;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAdd;

	@FindBy(how = How.XPATH, using = "//input[@id='Email']")
	private static WebElement emailCustomer;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Password']")
	private static WebElement passwordCustomer;
	
	@FindBy(how = How.ID, using = "FirstName")
	private static WebElement firstName;
	
	@FindBy(how = How.ID, using = "LastName")
	private static WebElement lastName;
	
	@FindBy(how = How.ID, using = "Gender_Male")
	private static WebElement genderMale;
	
	@FindBy(how = How.ID, using = "Gender_Female")
	private static WebElement genderFemale;
	
	@FindBy(how = How.ID, using = "DateOfBirth")
	private static WebElement dateOfBirth;
	
	@FindBy(how = How.ID, using = "SelectedCustomerRoleIds")
	private static WebElement customerRole;
	
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave;
	
	
	public AddNewCustomerPage() {
		super(Setup.getDriver());
	}
	public static WebElement getBtnCustomers() {
		return btnCustomers;
	}
	public static WebElement getBtnCustomer() {
		return btnCustomer;
	}
	public static WebElement getBtnAdd() {
		return btnAdd;
	}

	public static WebElement getEmailCustomer() {
		return emailCustomer;
	}

	public static WebElement getPasswordCustomer() {
		return passwordCustomer;
	}

	public static WebElement getFirstName() {
		return firstName;
	}
	public static WebElement getLastName() {
		return lastName;
	}
	public static WebElement getGenderMale() {
		return genderMale;
		
	}
	public static WebElement  getGenderFemale() {
		return genderFemale;
	}
	public static WebElement getDateOfBirth() {
		return dateOfBirth;
	}
	
	public static WebElement getCustomerRole() {
		return customerRole;
	}
	public static WebElement getBtnSave() {
		return btnSave;
	}
}
