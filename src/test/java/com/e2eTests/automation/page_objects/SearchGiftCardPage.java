package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class SearchGiftCardPage extends BasePage {
	
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Sales']")
	private static WebElement btnSales;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Gift cards']")
	private static WebElement btnGiftCards;

	@FindBy(how = How.ID, using = "RecipientName")
	private static WebElement recipientName;
	
	@FindBy(how = How.ID, using = "ActivatedId")
	private static WebElement activatedId;
	
	@FindBy(how = How.ID, using = "CouponCode")
	private static WebElement couponCode;

	@FindBy(how = How.ID, using = "search-giftcards")
	private static WebElement btnSearchGiftCards;
	
	public SearchGiftCardPage()  {
		super(Setup.getDriver());
	}
	public static WebElement getBtnSales() {
		return btnSales;
	}
	public static WebElement getBtnGiftCards() throws InterruptedException {
		Thread.sleep(4000);
		return btnGiftCards;
	}
	public static WebElement getRecipientName() {
		return recipientName;
	}
	public static WebElement getActivatedId() {
		return activatedId;
	}
	public static WebElement getCouponCode() {
		return couponCode;
	}

	public static WebElement getBtnSearchGiftCards() {
		return btnSearchGiftCards;
	}

}

