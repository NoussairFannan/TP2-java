import java.util.ArrayList;

public interface IMetierProduit {
    public void add(Produit p);
    public ArrayList<Produit> getAll();
    public ArrayList<Produit> findByNom(String motCle);
    public Produit findById(long id);
    public void delete(long id);

}
