import java.util.ArrayList;

public class MetierProduitImpl implements IMetierProduit{
    ArrayList<Produit> listprod = new ArrayList<Produit>();

    public MetierProduitImpl(ArrayList<Produit> listprod) {
        this.listprod = listprod;
    }

    @Override
    public void add(Produit p) {
        listprod.add(p);
    }

    @Override
    public ArrayList<Produit> getAll() {
        return listprod;
    }

    @Override
    public ArrayList<Produit> findByNom(String motCle) {
        ArrayList<Produit> newlist=new ArrayList<Produit>();
        for(Produit ele:listprod){
            if(motCle.equals(ele.nom)){
                newlist.add(ele);
            }
        }
        return newlist;
    }

    @Override
    public Produit findById(long id) {
        for(Produit ele:listprod){
            if(id==ele.id){
                return ele;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        for (int i = 0; i < listprod.size(); i++) {
            if (listprod.get(i).id == id) {
                listprod.remove(i);
                System.out.println("Le produit a ete supprime avec succes");
                return;
            }
        }
        System.out.println("Aucun produit avec cet id trouve");
    }
}
