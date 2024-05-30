package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class SearchDiscountPage extends BasePage {
	
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Promotions']")
	private static WebElement btnPromotions;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Discounts']")
	private static WebElement btnDiscounts;

	@FindBy(how = How.ID, using = "SearchStartDate")
	private static WebElement searchStartDate;
	
	@FindBy(how = How.ID, using = "SearchEndDate")
	private static WebElement searchEndDate;
	
	@FindBy(how = How.ID, using = "SearchDiscountTypeId")
	private static WebElement searchDiscountTypeId;

	@FindBy(how = How.ID, using = "SearchDiscountName")
	private static WebElement searchDiscountName;
	
	@FindBy(how = How.ID, using = "IsActiveId")
	private static WebElement searchIsActiveId;
	
	@FindBy(how = How.ID, using = "search-discounts")
	private static WebElement btnSearchdiscounts;
	
	
	public SearchDiscountPage()  {
		super(Setup.getDriver());
	}
	public static WebElement getBtnPromotions() {
		return btnPromotions;
	}
	public static WebElement getBtnDiscounts() {
		
		return btnDiscounts;
	}
	public static WebElement getSearchStartDate() {
		return searchStartDate;
	}
	public static WebElement getSearchEndDate() {
		return searchEndDate;
	}
	public static WebElement getSearchDiscountTypeId() {
		return searchDiscountTypeId;
	}
	public static WebElement getSearchDiscountName() {
		return searchDiscountName;
	}
	public static WebElement getSearchIsActiveId() {
		return searchIsActiveId;
	}
	public static WebElement getBtnSearchdiscounts() {
		return  btnSearchdiscounts;
	}
}


