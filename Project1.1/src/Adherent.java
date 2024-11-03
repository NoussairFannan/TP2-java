public class Adherent extends Personne{
    public int numAdherent;

    public Adherent(String nom, String prenom, String email, long tel, int age, int numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("numero adherant : "+numAdherent);
    }
}
