package com.e2eTests.automation.step_definitions;


import com.e2eTests.automation.page_objects.SearchGiftCardPage;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.When;

public class SearchGiftCardStepDefinition {
	
	public SeleniumUtils seleniumUtils;

	public SelectFromListUtils selectFromListUtils;

	public SearchGiftCardPage searchGiftCardPage;

	public SearchGiftCardStepDefinition() {

		searchGiftCardPage = new SearchGiftCardPage();

		seleniumUtils = new SeleniumUtils();

		selectFromListUtils = new SelectFromListUtils();

	}

	
	
	@When("Je clique sur Sales")
	public void je_clique_sur_sales() {
		SearchGiftCardPage.getBtnSales().click();
	   
	}

	@When("Je clique sur Gift cards")
	public void je_clique_sur_gift_cards() {
		SearchGiftCardPage.getBtnGiftCards().click();
	    
	}

	@When("Je saisie le Recipient name")
	public void je_saisie_le_recipient_name() {
		SearchGiftCardPage.getRecipientName().sendKeys("Asma");
	    
	}

	@When("Je choisis l'etat de la carte")
	public void je_choisis_l_etat_de_la_carte() {
		selectFromListUtils.selectDropDownListByVisibleText(SearchGiftCardPage.getActivatedId(), "Actived");
	    
	}

	@When("Je saisie Gift card coupon code")
	public void je_saisie_gift_card_coupon_code() {
		SearchGiftCardPage.getCouponCode().sendKeys("2050");
	    
	}

	@When("Je clique sur search gift card")
	public void je_clique_sur_search_gift_card() {
		SearchGiftCardPage.getBtnSearchGiftCards().click();
	}



}
