package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class AddNewCustomerPage extends BasePage {
	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	private static WebElement menuCustomers;

	@FindBy(how = How.XPATH, using = " //a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	private static WebElement btnCustomers;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNew;
	
	
	
	public AddNewCustomerPage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuCustomers() {
		return menuCustomers;
	}

	public static WebElement getBtnCustomers() {
		return btnCustomers;
	}

	public static WebElement getBtnAddNew() {
		return btnAddNew;
		
	}


	
	}




