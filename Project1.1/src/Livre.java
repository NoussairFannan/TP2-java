public class Livre {
    public int ISBN;
    public Auteur auteur;
    public String titre;

    public Livre(int ISBN, Auteur auteur, String titre) {
        this.ISBN = ISBN;
        this.auteur = auteur;
        this.titre = titre;
    }

    public void afficher(){
        System.out.println("Livre-------------------");
        System.out.println("Titre : "+titre);
        System.out.println("ISBN : "+ISBN);
        auteur.afficher();
    }

}
