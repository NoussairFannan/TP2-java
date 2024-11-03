import java.util.ArrayList;

public class Client {
    public String nom,prenom,email;
    public long numtele;
    public ArrayList<Commande> listComEf;

    public Client(String nom, String prenom, String email, long numtele, ArrayList<Commande> listComEf) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numtele = numtele;
        this.listComEf = listComEf;
    }
    public Client(String nom, String prenom, String email, long numtele) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numtele = numtele;
    }
    public void showClient(){
        System.out.println("Client est: "+nom+" "+prenom+" avec un email :"+email+" et un numero telephone de :"+numtele);
    }
    public void ajouterCommande(Commande com){
        for(Commande comEf:listComEf){
            if(comEf.refernece.equals(com.refernece)){
                break;
            }
        }
        listComEf.add(com);
    }
    public void supprimerCommande(Commande com){
        for(Commande comEf:listComEf){
            if(comEf.refernece.equals(com.refernece)){
                listComEf.remove(com);
            }
        }
    }
}
