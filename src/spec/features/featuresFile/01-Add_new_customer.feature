@addnewcustomer
Feature: Add new customer
  As a user
  I want to be able to add a new client
  So that I can manage my clients efficiently

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @addnewcustomer
  Scenario: Je souhaite ajouter un nouveau customer
    When Je clique sur Customers
    And Je clique sur Customer
    And Je clique sur Add new  boutton
    And Je remplis la formulaire
      | email     | john@example.com |
      | password  | password123      |
      | firstName | John             |
      | lastName  | Doe              |
    And je choisis le gender
    And je choisis la date de naisssance
    And je choisis le role du customer
    And Je clique sur Save
