package listes;

public class Objet {

    private String name;
    private Integer numero;
    private String couleur;

    //constructeur
    public Objet(String name, Integer numero, String couleur) {
        this.name = name;
        this.numero = numero;
        this.couleur = couleur;
    }

    //constructeur vide
    public Objet(){}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    //Methode pour afficher les details
    @Override
    public String toString() {
        return "Objet [name=" + name + ", numero=" + numero + ", couleur=" + couleur + "]";
    }
    
    
        
    
}
