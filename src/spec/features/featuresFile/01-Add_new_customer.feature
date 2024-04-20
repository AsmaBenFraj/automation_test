@addnewcustomer
Feature: Ajouter client
  ETQ utilisateur je souhaite ajouter un client

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @addnewcustomer
  Scenario: Je souhaite ajouter un nouveau customer
    When Je clique sur Catalog
    And Je clique sur Customers
    And Je clique sur Add new
    And Je remplis la formulaire
    And Je clique sur Save
