import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Ordinateur ord1=new Ordinateur("EliteBook","HP",6000,"i7-7800",10);
        Ordinateur ord2=new Ordinateur("Envy","HP",10000,"i5-1022",15);
        Ordinateur ord3=new Ordinateur("Razer","Blade3",15000,"i9-13022",5);
        ArrayList<Ordinateur> array=new ArrayList<Ordinateur>();
        Categorie cat=new Categorie("PC","des pc portables");
        cat.ajouterOrd(ord1);
        cat.ajouterOrd(ord2);
        cat.ajouterOrd(ord3);
        Client client=new Client("Fannan","Noussair","noussairfannan@gmail.com", 28079);
        Commande commande1=new Commande("123456789",client,new Date(2024, Calendar.NOVEMBER,10), Commande.Etats.ANNULEE);
        Commande commande2=new Commande("987654321",client,new Date(2023, Calendar.NOVEMBER,10), Commande.Etats.LIVREE);
        Commande commande3=new Commande("000000000",client,new Date(2022, Calendar.NOVEMBER,10), Commande.Etats.EN_ATTENTE);
        ArrayList<LigneCommande> listLigneCom= new ArrayList<LigneCommande>();
        listLigneCom.add(new LigneCommande(2,commande1,ord1));
        listLigneCom.add(new LigneCommande(3,commande2,ord2));
        listLigneCom.add(new LigneCommande(1,commande3,ord3));
        System.out.println("----------------------------------------------------");
        listLigneCom.get(0).showLigneCommade();
        System.out.println("----------------------------------------------------");
        listLigneCom.get(1).showLigneCommade();
        System.out.println("----------------------------------------------------");
        listLigneCom.get(2).showLigneCommade();
        System.out.println("----------------------------------------------------");
    }
}
