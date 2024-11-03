public class Ordinateur {
    public String name;
    public String marque;
    public int prix;
    public String description;
    public int nmbStock;

    public Ordinateur(String name, String marque, int prix, String description, int nmbStock) {
        this.name = name;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nmbStock = nmbStock;
    }

    public int prixTotale(int quantite){
        return prix*quantite;
    }
    public void  showOrd() {
        System.out.println("Ordinateur est: " + name + ", de marque " + marque + ", de prix " + prix +"DH, avec un nombre de stock de "+nmbStock+ " avec " + description);
    }
}
