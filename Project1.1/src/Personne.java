public class Personne {
    public String nom;
    public String prenom;
    public String email;
    public long tel;
    public int age;

    public Personne(String nom, String prenom, String email, long tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }
    public void afficher(){
        System.out.println("Personne----------------");
        System.out.println("nom : "+nom);
        System.out.println("prenom : "+prenom);
        System.out.println("email : "+email);
        System.out.println("telephone : "+tel);
        System.out.println("age : "+age);
    }
}
