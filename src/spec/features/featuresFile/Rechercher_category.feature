@categoryname @tnr
Feature: Recherche catégorie produit
  ETQ utilisateur je souhaite chercher la catégorie du produit

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @categoryname
  Scenario: Je souhaite chercher le nom du produit
    When Je clique sur Catalog
    And Je clique sur Categories
    And Je saisis le nom du catégorie "book"
    And Je clique sur le bouton search
