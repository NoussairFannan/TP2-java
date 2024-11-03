public class LigneCommande {
    public int quantite;
    public Commande com;
    public Ordinateur ord;

    public LigneCommande(int quantite, Commande com, Ordinateur ord) {
        this.quantite = quantite;
        this.com = com;
        this.ord = ord;
    }
    public void showLigneCommade(){
        ord.showOrd();
        com.showCom();
        System.out.println("Quantite : "+quantite);
    }
}
