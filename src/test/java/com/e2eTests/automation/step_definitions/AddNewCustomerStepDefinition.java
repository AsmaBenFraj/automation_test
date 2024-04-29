package com.e2eTests.automation.step_definitions;

import java.util.Map;

import org.openqa.selenium.WebElement;
import com.e2eTests.automation.page_objects.AddNewCustomerPage;
import com.e2eTests.automation.utils.*;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class AddNewCustomerStepDefinition {
	
	

	public SeleniumUtils seleniumUtils;

	public SelectFromListUtils selectFromListUtils;

	public AddNewCustomerPage addNewCustomerPage;

	public AddNewCustomerStepDefinition() {

		addNewCustomerPage = new AddNewCustomerPage();

		seleniumUtils = new SeleniumUtils();

		selectFromListUtils = new SelectFromListUtils();

	}

	@When("Je clique sur Customers")
	public void jeCliqueSurCustomers() {

		AddNewCustomerPage.getBtnCustomers().click();
	}

	@When("Je clique sur Customer")
	public void jeCliqueSurCustomer() {

		AddNewCustomerPage.getBtnCustomer().click();

	}

	@When("Je clique sur Add new  boutton")
	public void jeCliqueSurAddNewBoutton() {
		AddNewCustomerPage.getBtnAdd().click();

	}

	@When("Je remplis la formulaire")
	public void jeRemplisLaFormulaire(DataTable dataTable) {

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		String email = dataMap.get("email");
		WebElement element = AddNewCustomerPage.getEmailCustomer();
		seleniumUtils.writeText(element, email);
		seleniumUtils.writeText(AddNewCustomerPage.getPasswordCustomer(), dataMap.get("password"));
		seleniumUtils.writeText(AddNewCustomerPage.getFirstName(), dataMap.get("firstName"));
		seleniumUtils.writeText(AddNewCustomerPage.getLastName(), dataMap.get("lastName"));

	}

	@When("je choisis le gender")
	public void jeChoisisLeGender() {
		// AddNewCustomerPage.getGenderMale().click();
		seleniumUtils.click(AddNewCustomerPage.getGenderFemale());
	}

	@When("je choisis la date de naisssance")
	public void jeChoisisLaDateDeNaisssance() {

		AddNewCustomerPage.getDateOfBirth().sendKeys("01/06/1985");
	}

	@When("je choisis le role du customer")
	public void jeChoisisLeRoleDuCustomer() {

		selectFromListUtils.selectDropDownListByVisibleText(AddNewCustomerPage.getCustomerRole(), "Registered");

	}

	@When("Je clique sur Save")
	public void jeCliqueSurSave() throws InterruptedException {

		AddNewCustomerPage.getBtnSave();
		
		 //seleniumUtils.click(AddNewCustomerPage.getBtnSave());
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);

	}

}
