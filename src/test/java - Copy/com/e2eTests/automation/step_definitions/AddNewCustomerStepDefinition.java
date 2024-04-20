package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.AddNewCustomerPage;
import com.e2eTests.automation.page_objects.ProductNamePage;

import io.cucumber.java.en.When;

public class AddNewCustomerStepDefinition {
	
	public AddNewCustomerPage addNewCustomerPage;

	public AddNewCustomerStepDefinition() {
		addNewCustomerPage = new AddNewCustomerPage();
	}
	
	
	
	@When("Je clique sur Customers")
	public void jeCliqueSurCustomers() {
		AddNewCustomerPage.getBtnCustomers().click();
	   
	}
	@When("Je clique sur Add new")
	public void jeCliqueSurAddNew() {
		AddNewCustomerPage.getBtnAddNew().click();
	   
	}
	@When("Je remplis la formulaire")
	public void jeRemplisLaFormulaire() {
	   
	}
	@When("Je clique sur Save")
	public void jeCliqueSurSave() {
	    
	}


}
