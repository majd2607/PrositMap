/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td_map;

import java.util.TreeMap;
import java.util.Map;

/**
 *
 * @author Majd Tabessi
 */
public class SocieteTreeMap implements InterfaceSociete {

    TreeMap<Employe, Departement> TR = new TreeMap<Employe, Departement>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {

        TR.put(e, d);

    }

    @Override
    public void supprimerEmploye(Employe e) {
        TR.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> e : TR.entrySet()) {
            System.out.println(e.getKey() + "-" + e.getValue());

        }
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(TR.keySet());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(TR.values());
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(TR.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        if (TR.containsKey(e)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        if (TR.containsValue(e)) {
            return true;
        }
        return false;
    }

}
