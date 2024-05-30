@searchdiscount
Feature: Search a discount details
  As a user
  I want to search a discount details

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @searchdiscount
  Scenario: Je souhaite trouver discount details
    When Je clique sur Promotions
    And Je clique sur Disounts
    And Je saisie la date de debut discount
    And Je saisie la date de fin discount
    And Je choisis le type du discount
    And Je saisie le discount name "ABCD ROY"
    And Je choisis Is Active
    And Je clique sur search discount
