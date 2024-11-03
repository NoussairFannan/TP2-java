public class Main {
    public static void main(String[] args) {
        // Instanciation d'un ingénieur
        Ingenieur ingenieur = new Ingenieur("Ghalali", "Yahya", "yah@example.com", "0123456789", 3000, "Développement");

        // Instanciation d'un manager
        Manager manager = new Manager("Fannan", "Noussair", "nous@example.com", "0987654321", 4000, "Informatique");

        // Affichage des informations de l'ingénieur
        System.out.println("Informations de l'ingénieur:");
        ingenieur.afficher();

        // Affichage des informations du manager
        System.out.println("Informations du manager:");
        manager.afficher();
    }
}
