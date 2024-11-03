public class Main {
    public static void main(String[] args) {
        Personne pers=new Adherent("fannan","noussair","nou@gmail.com",212666666,21,13);
        Auteur aut=new Auteur("ghallali","yahya","yah@gmail.com",212666666,21,14);
        Livre liv=new Livre(1321414,aut,"Boite a merveille");
        pers.afficher();
        liv.afficher();
    }
}