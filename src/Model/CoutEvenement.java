/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author manou
 */
public class CoutEvenement {
private int id ;
private int coutCtegorie;
private int demendeEvenement;
private int nbBillet;
private double prix;

    public CoutEvenement(int id, int coutCtegorie, int demendeEvenement, int nbBillet, double prix) {
        this.id = id;
        this.coutCtegorie = coutCtegorie;
        this.demendeEvenement = demendeEvenement;
        this.nbBillet = nbBillet;
        this.prix = prix;
    }

    public CoutEvenement(int coutCtegorie, int demendeEvenement, int nbBillet, int prix) {
        this.coutCtegorie = coutCtegorie;
        this.demendeEvenement = demendeEvenement;
        this.nbBillet = nbBillet;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoutCtegorie() {
        return coutCtegorie;
    }

    public void setCoutCtegorie(int coutCtegorie) {
        this.coutCtegorie = coutCtegorie;
    }

    public int getDemendeEvenement() {
        return demendeEvenement;
    }

    public void setDemendeEvenement(int demendeEvenement) {
        this.demendeEvenement = demendeEvenement;
    }

    public int getNbBillet() {
        return nbBillet;
    }

    public void setNbBillet(int nbBillet) {
        this.nbBillet = nbBillet;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

      @Override
    public String toString() {
        return "cout evenemet "+"\n"+ "CoutCategorie"+"\n" + coutCtegorie +"\n" + "demendeEvenement"+"\n" + demendeEvenement +"\n" +"\n" + " nbBillet"+ "\n" + nbBillet + "\n" + "\n"+" prix "+"\n" +prix+"";
    }
}
