import java.util.Date;

public class Commande {
    public String refernece;
    public Client client;
    public Date date;
    public Etats etats;

    public Commande(String refernece, Client client, Date date, Etats etats) {
        this.refernece = refernece;
        this.client = client;
        this.date = date;
        this.etats = etats;
    }

    public void showCom() {
        System.out.println("Commande est: de reference "+refernece+", de date "+date+", avec une etats:"+etats);
        client.showClient();
    }

    enum Etats{
        EN_ATTENTE,
        EXPEDIEE,
        LIVREE,
        ANNULEE
    }

}
