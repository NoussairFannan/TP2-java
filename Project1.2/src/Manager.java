public class Manager extends Employe {
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.20;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Service: " + service);
    }
}
