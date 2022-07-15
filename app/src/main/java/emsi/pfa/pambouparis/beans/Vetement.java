package emsi.pfa.pambouparis.beans;

public class Vetement {
    private int id;
    private String nom;
    private String description;
    private String image;
    private float prixdebase;
    private float prixdevente;
    private float tva;
    private float poids;
    private float stock;

    public Vetement(int id) {
        this.id = id;
    }
    public Vetement() {

    }

    public Vetement(int id, String nom, String description, String image, float prixdebase, float prixdevente, float tva, float poids, float stock) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.prixdebase = prixdebase;
        this.prixdevente = prixdevente;
        this.tva = tva;
        this.poids = poids;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrixdebase() {
        return prixdebase;
    }

    public void setPrixdebase(float prixdebase) {
        this.prixdebase = prixdebase;
    }

    public float getPrixdevente() {
        return prixdevente;
    }

    public void setPrixdevente(float prixdevente) {
        this.prixdevente = prixdevente;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }
}
