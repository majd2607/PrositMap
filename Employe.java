/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td_map;

/**
 *
 * @author Majd Tabessi
 */
public class Employe implements Comparable<Employe> {

    private int cin;
    private String mat;
    private String nom, prenom;

    Employe() {

    }

    Employe(int cin, String mat, String nom, String prenom) {
        this.cin = cin;
        this.mat = mat;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCin() {
        return this.cin;
    }

    public String getMatricule() {
        return this.mat;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setMatricule(String mat) {
        this.mat = mat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" + "cin=" + cin + ", mat=" + mat + ", nom=" + nom + ", prenom=" + prenom + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        if (obj == null) {
            return false;
        }

        Employe e = (Employe) obj;
        return (this.getCin() == e.getCin());
    }

    @Override
    public int hashCode() {
        return 30;
    }

    @Override
    public int compareTo(Employe o) {
        return this.cin - o.cin;
    }

}
