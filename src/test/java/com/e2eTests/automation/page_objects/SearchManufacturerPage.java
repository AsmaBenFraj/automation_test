package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class SearchManufacturerPage extends BasePage {
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Manufacturers']")
	private static WebElement btnManufacturers;

	@FindBy(how = How.ID, using = "SearchManufacturerName")
	private static WebElement writeManufacturerName;

	@FindBy(how = How.ID, using = "SearchPublishedId")
	private static WebElement btnSelectType;

	@FindBy(how = How.ID, using = "search-manufacturers")
	private static WebElement btnSearchManufacturers;
	
	public SearchManufacturerPage()  {
		super(Setup.getDriver());
	}
	public static WebElement getBtnManufacturers() {
		return btnManufacturers;
	}
	public static WebElement getWriteManufacturerName() {
		return writeManufacturerName;
	}
	public static WebElement getBtnSelectType() {
		return btnSelectType;
	}

	public static WebElement getBtnSearchManufacturers() {
		return btnSearchManufacturers;
	}

}
