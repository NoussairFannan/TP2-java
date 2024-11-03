import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int choix = 0;
        MetierProduitImpl mpi = new MetierProduitImpl(new ArrayList<Produit>());
        Scanner myObj = new Scanner(System.in);

        while (choix != 6) {
            System.out.println("-----------------------------------------");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher des produits par mot clé");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Récupérer et afficher un produit par ID");
            System.out.println("5. Supprimer un produit par id");
            System.out.println("6. Quitter ce programme");
            System.out.println("Choisir l'une des opérations suivantes :");
            choix = Integer.parseInt(myObj.nextLine());

            switch (choix) {
                case 1:
                    if (mpi.getAll().isEmpty()) {
                        System.out.println("Liste de produits est vide");
                    } else {
                        for (Produit m : mpi.getAll()) {
                            System.out.println(m);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Donner le nom à rechercher:");
                    String motRe = myObj.nextLine();
                    ArrayList<Produit> produitsTrouves = mpi.findByNom(motRe);
                    if (produitsTrouves.isEmpty()) {
                        System.out.println("Aucun produit trouvé avec ce nom.");
                    } else {
                        for (Produit m : produitsTrouves) {
                            System.out.println(m);
                        }
                    }
                    break;

                case 3:
                    Produit p = new Produit();
                    System.out.println("Donner le nom du produit à ajouter:");
                    p.nom = myObj.nextLine();
                    System.out.println("Donner l'id du produit à ajouter:");
                    p.id = Long.parseLong(myObj.nextLine());
                    System.out.println("Donner la marque du produit à ajouter:");
                    p.marque = myObj.nextLine();
                    System.out.println("Donner le prix du produit à ajouter:");
                    p.prix = Integer.parseInt(myObj.nextLine());
                    System.out.println("Donner une description sur le produit à ajouter:");
                    p.description = myObj.nextLine();
                    System.out.println("Donner le nombre de stock du produit à ajouter:");
                    p.nmbStock = Integer.parseInt(myObj.nextLine());
                    mpi.add(p); // Ajouter le produit à la liste
                    System.out.println("Produit ajouté avec succès.");
                    break;

                case 4:
                    System.out.println("Donner l'id du produit à rechercher:");
                    long idRe = Long.parseLong(myObj.nextLine());
                    Produit produit = mpi.findById(idRe);
                    if (produit != null) {
                        System.out.println(produit);
                    }else{
                        System.out.println("Aucun element avec cet id");
                    }
                    break;

                case 5:
                    System.out.println("Donner l'id du produit à supprimer:");
                    long idSu = Long.parseLong(myObj.nextLine());
                    mpi.delete(idSu);
                    break;

                case 6:
                    System.out.println("Au revoir");
                    myObj.close();
                    break;

                default:
                    System.out.println("Valeur inattendue : " + choix);
                    break;
            }
        }
    }
}
