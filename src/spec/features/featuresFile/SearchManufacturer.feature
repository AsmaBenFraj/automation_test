@searchmanufacturer
Feature: Search a manufacturer name
  As a user
  I want to search a manufacturer name

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home
@searchmanufacturer
  Scenario: Je souhaite trouver le fabricant 
    When Je clique sur Catalog
    And Je clique sur Manufacturers
    And Je saisie le nom 
    And Je choisis le type de son etat
    And Je clique sur search
    