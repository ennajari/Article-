import java.util.*;

public class article {
	
    private String reference;
    private String designation;
    private double prixHT;
    private double tauxTVA;

    public String getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public void setTauxTVA(double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    // Constructeur par défaut
    public article() {
        this.designation = "";
        this.reference = "";
        this.prixHT = 0;
        this.tauxTVA = 0;
    }

    // Constructeur initialisant tous les attributs
    public article(String reference, String designation, double prixHT, double tauxTVA) {
        this.designation = designation;
        this.reference = reference;
        this.prixHT = prixHT;
        this.tauxTVA = tauxTVA;
    }

    // Constructeur qui permet de renseigner la référence et la désignation
    public article(String reference, String designation) {
        this.reference = reference;
        this.designation = designation;
    }

    // Constructeur de recopie
    public article(article articleACopier) {
        this.reference = articleACopier.reference;
        this.designation = articleACopier.designation;
        this.prixHT = articleACopier.prixHT;
        this.tauxTVA = articleACopier.tauxTVA;
    }

    // Méthode pour calculer le prix TTC
    public double calculerPrixTTC() {
        return prixHT + (prixHT * tauxTVA / 100);
    }

    // Méthode pour afficher les informations de l'article
    public void afficherArticle() {
        System.out.println("Designation : " + this.designation);
        System.out.println("Reference : " + this.reference);
        System.out.println("Prix HT : " + this.prixHT);
        System.out.println("Taux TVA : " + this.tauxTVA);
        System.out.println("Prix TTC : " + this.calculerPrixTTC());
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        article article1 = new article();
        article1.afficherArticle(); // Affiche les informations avec les valeurs par défaut

        article article2 = new article("123", "Produit A", 50.0, 20.0);
        article2.afficherArticle(); // Affiche les informations de l'article2

        article article3 = new article("456", "Produit B");
        article3.setPrixHT(75.0); // Modification du prix HT après l'instanciation
        article3.afficherArticle(); // Affiche les informations de l'article3
    }
}
