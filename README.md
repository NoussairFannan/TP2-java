# TP2-java
## Exercice 1:
Ce projet permet de gérer des adhérents, des auteurs, et des livres au sein d'une bibliothèque. Il inclut des classes représentant des personnes (auteurs et adhérents), ainsi que des livres avec leurs informations .

- **Personne** : Classe de base représentant une personne avec des informations telles que le nom, le prénom, l'email, le téléphone et l'âge.
- **Adherent** : Classe dérivée de `Personne` représentant un adhérent de la bibliothèque, avec un numéro d'adhérent spécifique.
- **Auteur** : Classe dérivée de `Personne` représentant un auteur, avec un numéro d'auteur spécifique.
- **Livre** : Classe représentant un livre avec un ISBN, un titre, et un auteur.
- **Main** : Classe principale pour exécuter l'application et afficher les informations des adhérents et des livres.

## Exercice 2:
Ce projet implémente une hiérarchie d'employés dans une organisation, avec des classes pour des rôles spécifiques (Ingénieur et Manager) héritant d'une classe abstraite `Employe`.

- **Employe** (classe abstraite) : Classe de base pour tous les employés, contenant des informations communes et des méthodes abstraites pour le calcul de salaire.
- **Ingenieur** : Classe dérivée de `Employe`, représentant les ingénieurs avec une spécialité spécifique (le salaire est calculé avec une majoration de 15%).
- **Manager** : Classe dérivée de `Employe`, représentant les managers avec un service spécifique (le salaire est calculé avec une majoration de 20%).
- **Main** : Classe principale pour exécuter l'application et afficher les informations des employés.

## Exercice 3:
Ce projet fournit une application de gestion de commandes pour des clients, des ordinateurs et leurs catégories associées.

- **Categorie** : Gère les catégories d'ordinateurs, permettant d'ajouter et de supprimer des ordinateurs, ainsi que de rechercher par prix.
- **Client** : Représente les clients avec leurs informations personnelles et une liste de commandes.
- **Commande** : Représente une commande avec des informations telles que la référence, la date, le client, et l'état de la commande.
- **LigneCommande** : Représente une ligne de commande spécifique avec une quantité et une référence à la commande et à l'ordinateur associé.
- **Ordinateur** : Représente les détails de chaque ordinateur, tels que le nom, la marque, le prix, la description, et le nombre en stock.
- **Main** : Classe principale qui sert de point d'entrée pour l'exécution de l'application, illustrant le fonctionnement de chaque classe.

## Exercice 4:
Ce projet est une simple application de gestion de produits en Java, permettant d'ajouter, afficher, rechercher et supprimer des produits. Le code est structuré avec une interface, des classes de modèle de données, une classe d'implémentation de gestion de produit et une classe principale pour l'interface utilisateur.

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
