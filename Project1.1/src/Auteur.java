public class Auteur extends Personne{
    public int numAuteur;

    public Auteur(String nom, String prenom, String email, long tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Numero Auteur : "+numAuteur);
    }
}
