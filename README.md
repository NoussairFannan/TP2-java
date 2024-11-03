# TP2-java
## Exercice 1:
## Exercice 2:

## Exercice 3:
Ce programme fournit une application de gestion de commandes pour des clients, des ordinateurs et leurs catégories associées.

- **Categorie** : Gère les catégories d'ordinateurs, permettant d'ajouter et de supprimer des ordinateurs, ainsi que de rechercher par prix.
- **Client** : Représente les clients avec leurs informations personnelles et une liste de commandes.
- **Commande** : Représente une commande avec des informations telles que la référence, la date, le client, et l'état de la commande.
- **LigneCommande** : Représente une ligne de commande spécifique avec une quantité et une référence à la commande et à l'ordinateur associé.
- **Ordinateur** : Représente les détails de chaque ordinateur, tels que le nom, la marque, le prix, la description, et le nombre en stock.
- **Main** : Classe principale qui sert de point d'entrée pour l'exécution de l'application, illustrant le fonctionnement de chaque classe.

## Exercice 4:
Ce programme est une simple application de gestion de produits en Java, permettant d'ajouter, afficher, rechercher et supprimer des produits. Le code est structuré avec une interface, des classes de modèle de données, une classe d'implémentation de gestion de produit et une classe principale pour l'interface utilisateur.

- **Classe Produit** : Cette classe représente un produit.

- **Interface IMetierProduit** : L'interface IMetierProduit définit les méthodes pour la gestion des produits.

- **Classe MetierProduitImpl** : Cette classe implémente l'interface IMetierProduit et fournit la logique de gestion des produits en utilisant une liste d'objets Produit.

- **Classe Application** : La classe Application est la classe principale qui contient la méthode main. Elle permet à l'utilisateur d'interagir avec le programme via un menu en console.

Alors l'utilisateur peut:

- Afficher la liste de tous les produits.
- Rechercher des produits par nom.
- Ajouter un nouveau produit.
- Rechercher et afficher un produit par ID.
- Supprimer un produit par ID.
