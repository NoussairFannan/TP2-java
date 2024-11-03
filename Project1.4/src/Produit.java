public class Produit {
    public long id;
    public String nom;
    public String marque;
    public int prix;
    public String description;
    public int nmbStock;

    public Produit(long id, String nom, String marque, int prix, String description, int nmbStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nmbStock = nmbStock;
    }

    public Produit() {}

    @Override
    public String toString() {
        return "Produit [id=" + id + ", nom=" + nom +", marque="+ marque+", prix="+prix+", description="+description+", nombre de stock="+nmbStock+"]";
    }
}
