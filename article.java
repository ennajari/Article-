import java.util.*;
// BY A_Ennajari
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
        Scanner scanner = new Scanner(System.in);

        // Saisie pour le premier article
        System.out.println("Saisir les informations pour le premier article :");
        System.out.print("Référence : ");
        String reference1 = scanner.nextLine();
        System.out.print("Désignation : ");
        String designation1 = scanner.nextLine();
        System.out.print("Prix HT : ");
        double prixHT1 = scanner.nextDouble();
        System.out.print("Taux TVA : ");
        double tauxTVA1 = scanner.nextDouble();

        article article1 = new article(reference1, designation1, prixHT1, tauxTVA1);

        // Affichage des informations du premier article
        System.out.println("\nInformations du premier article :");
        article1.afficherArticle();

        // Saisie pour le deuxième article
        System.out.println("\nSaisir les informations pour le deuxième article :");
        System.out.print("Référence : ");
        scanner.nextLine(); // Pour consommer la nouvelle ligne restante
        String reference2 = scanner.nextLine();
        System.out.print("Désignation : ");
        String designation2 = scanner.nextLine();
        System.out.print("Prix HT : ");
        double prixHT2 = scanner.nextDouble();
        System.out.print("Taux TVA : ");
        double tauxTVA2 = scanner.nextDouble();

        article article2 = new article(reference2, designation2, prixHT2, tauxTVA2);

        // Affichage des informations du deuxième article
        System.out.println("\nInformations du deuxième article :");
        article2.afficherArticle();

        // Fermeture du scanner
        scanner.close();
    }
}