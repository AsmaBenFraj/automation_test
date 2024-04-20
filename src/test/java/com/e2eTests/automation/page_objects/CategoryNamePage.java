package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class CategoryNamePage extends BasePage{
	
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement menuCatalog;

	@FindBy(how = How.XPATH, using = " //p[normalize-space()='Categories']")
	private static WebElement btnCategory;

	@FindBy(how = How.ID, using = "SearchCategoryName")
	private static WebElement categoryName;
	
	@FindBy(how = How.ID, using = "search-categories")
	private static WebElement searchCategory;
	
	public CategoryNamePage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuCatalog() {
		return menuCatalog;
	}

	public static WebElement getBtnCategory() {
		return btnCategory;
	}

	public static WebElement getCategoryName() {
		return categoryName;
		
	}

	public static WebElement getSearchCategory() {
		return searchCategory;
	}
	}