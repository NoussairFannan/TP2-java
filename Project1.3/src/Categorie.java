import java.util.ArrayList;
import java.util.Objects;

public class Categorie {
    public String nom;
    public String description;
    public ArrayList<Ordinateur> listOrd;

    public Categorie(String nom, String description, ArrayList<Ordinateur> listOrd) {
        this.nom = nom;
        this.description = description;
        this.listOrd = listOrd;
    }
    public Categorie(String nom, String description) {
        this.nom = nom;
        this.description = description;
        this.listOrd = new ArrayList<Ordinateur>();
    }
    private boolean verifExistance(Ordinateur ordRech){
        for (Ordinateur ord:listOrd){
            if(ord.prix==ordRech.prix && Objects.equals(ord.name, ordRech.name) && Objects.equals(ord.marque, ordRech.marque) && Objects.equals(ord.description, ordRech.description)){
                return true;
            }
        }
        return false;
    }
    public void ajouterOrd(Ordinateur ord){
        if(!verifExistance(ord)){
            listOrd.add(ord);
        }else{
            throw new IllegalStateException("element deja dans list");
        }
    }
    public void supprimerOrdinateur(Ordinateur ord){
        if(verifExistance(ord)){
            listOrd.remove(ord);
        }else{
            throw new IllegalStateException("element n'est pas dans la list");
        }
    }
    public void rechercherParPrix(int prix){
        for (Ordinateur ord:listOrd){
            if (ord.prix==prix){
                ord.showOrd();
            }
        }
    }
}
