package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.SearchDiscountPage;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.When;

public class SearchDiscountStepDefinition {
	
	public SeleniumUtils seleniumUtils;
	public SelectFromListUtils selectFromListUtils;
	public SearchDiscountPage searchDiscountPage;

	public SearchDiscountStepDefinition() {
		
		seleniumUtils = new SeleniumUtils();
		selectFromListUtils = new SelectFromListUtils();
		searchDiscountPage = new SearchDiscountPage();

	}

	@When("Je clique sur Promotions")
	public void jeCliqueSurPromotions() {
		seleniumUtils.click(SearchDiscountPage.getBtnPromotions());
	}

	@When("Je clique sur Disounts")
	public void jeCliqueSurDisounts() throws InterruptedException {
		Thread.sleep(4000);
		seleniumUtils.click(SearchDiscountPage.getBtnDiscounts());
	}

	@When("Je saisie la date de debut discount")
	public void jeSaisieLaDateDeDebutDiscount() {
		SearchDiscountPage.getSearchStartDate().sendKeys("04/10/2024");
	}

	@When("Je saisie la date de fin discount")
	public void jeSaisieLaDateDeFinDiscount() {
		SearchDiscountPage.getSearchEndDate().sendKeys("30/10/2024");
	}

	@When("Je choisis le type du discount")
	public void jeChoisisLeTypeDuDiscount() {
		
		selectFromListUtils.selectDropDownListByValue(SearchDiscountPage.getSearchDiscountTypeId(), "1");
	}

	@When("Je saisie le discount name {string}")
	public void jeSaisieLeDiscountName(String name) {
		
			seleniumUtils.writeText(SearchDiscountPage.getSearchDiscountName(), name);
	}

	@When("Je choisis Is Active")
	public void jeChoisisIsActive() {
		selectFromListUtils.selectDropDownListByVisibleText(SearchDiscountPage.getSearchIsActiveId(), "Active only");
		
	}

	@When("Je clique sur search discount")
	public void jeCliqueSurSearchDiscount() {
		seleniumUtils.click(SearchDiscountPage.getBtnDiscounts());
		;
	}

}
