@searchgiftcard
Feature: Search a gift card for customer
  As a user
  I want to search a gift card for customer

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @searchgiftcard
  Scenario: Je souhaite trouver gift card pour customer
    When Je clique sur Sales
    And Je clique sur Gift cards
    And Je saisie le Recipient name "Asma"
    And Je choisis l'etat de la carte
    And Je saisie Gift card coupon code
    And Je clique sur search gift card
