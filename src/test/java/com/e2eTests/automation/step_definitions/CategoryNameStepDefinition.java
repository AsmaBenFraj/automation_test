package com.e2eTests.automation.step_definitions;
import com.e2eTests.automation.page_objects.CategoryNamePage;
import com.e2eTests.automation.page_objects.ProductNamePage;

import io.cucumber.java.en.When;

public class CategoryNameStepDefinition {

	public CategoryNamePage categoryNamePage;

	public CategoryNameStepDefinition() {
		categoryNamePage = new CategoryNamePage();
	}

	@When("Je clique sur Categories")
	public void jeCliqueSurCategories() {
		CategoryNamePage.getBtnCategory().click();
	}


	@When("Je saisis le nom du catégorie {string}")
	public void jeSaisisLeNomDuCatégorie(String string) {
		CategoryNamePage.getCategoryName().sendKeys("book");
	
	}
	
}