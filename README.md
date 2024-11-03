# TP2-java
## Exercice 1:
## Exercice 2:
## Exercice 3:
## Exercice 4:
Ce programme est une simple application de gestion de produits en Java, permettant d'ajouter, afficher, rechercher et supprimer des produits. Le code est structuré avec une interface, des classes de modèle de données, une classe d'implémentation de gestion de produit et une classe principale pour l'interface utilisateur.

### Classes et interfaces:
#### Classe Produit:
Cette classe représente un produit.

#### Interface IMetierProduit:
L'interface IMetierProduit définit les méthodes pour la gestion des produits.

#### Classe MetierProduitImpl:
Cette classe implémente l'interface IMetierProduit et fournit la logique de gestion des produits en utilisant une liste d'objets Produit.

#### Classe Application:
La classe Application est la classe principale qui contient la méthode main. Elle permet à l'utilisateur d'interagir avec le programme via un menu en console. Alors l'utilisateur peut:

- Crée une instance de MetierProduitImpl pour gérer la liste de produits.
- Affiche un menu dans une boucle while qui permet de sélectionner les actions suivantes :
- Afficher la liste de tous les produits.
- Rechercher des produits par nom.
- Ajouter un nouveau produit.
- Rechercher et afficher un produit par ID.
- Supprimer un produit par ID.
- Quitter le programme.

Chaque option du menu exécute une méthode appropriée de l'instance MetierProduitImpl et affiche les résultats.
