package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.SearchManufacturerPage;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.When;

public class SearchManufacturerStepDefinition {
	
	public SeleniumUtils seleniumUtils;
	public SelectFromListUtils selectFromListUtils;
	
	public SearchManufacturerPage searchManufacturerPage;
	
	public SearchManufacturerStepDefinition() {
		
		seleniumUtils = new SeleniumUtils();
		
		selectFromListUtils = new SelectFromListUtils();
		
		searchManufacturerPage = new SearchManufacturerPage();
	
	
	}

@When("Je clique sur Manufacturers")
public void je_clique_sur_manufacturers() throws InterruptedException {
	
	Thread.sleep(3000);
	
	seleniumUtils.click(SearchManufacturerPage.getBtnManufacturers());
}

@When("Je saisie le nom")
public void je_saisie_le_nom() {
	
	SearchManufacturerPage.getWriteManufacturerName().sendKeys("Apple"); 
}

@When("Je choisis le type de son etat")
public void je_choisis_le_type_de_son_etat() {
	
	selectFromListUtils.selectDropDownListByVisibleText(SearchManufacturerPage.getBtnSelectType(), "Published only");
}

@When("Je clique sur search")
public void je_clique_sur_search() {
	
	seleniumUtils.click(SearchManufacturerPage.getBtnSearchManufacturers());
}
}