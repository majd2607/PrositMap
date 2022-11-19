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
public class Departement {

    private int id;
    private String nom;

    Departement() {

    }

    Departement(int id, String n) {
        this.id = id;
        this.nom = n;
    }

    int getID() {
        return this.id;
    }

    String getNom() {
        return this.nom;
    }

    void setId(int id) {
        this.id = id;
    }

    void setNom(String n) {
        this.nom = n;
    }

    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nom=" + nom + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Departement m = (Departement) obj;
        return (m.id == this.id);
    }
}
