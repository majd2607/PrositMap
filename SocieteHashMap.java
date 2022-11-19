/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td_map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Majd Tabessi
 */
public class SocieteHashMap implements InterfaceSociete {

    HashMap<Employe, Departement> HM = new HashMap<Employe, Departement>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {

        HM.put(e, d);

    }

    @Override
    public void supprimerEmploye(Employe e) {
        HM.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> e : HM.entrySet()) {
            System.out.println(e.getKey() + "-" + e.getValue());

        }
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(HM.keySet());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(HM.values());
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(HM.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        if (HM.containsKey(e)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        if (HM.containsValue(e)) {
            return true;
        }
        return false;
    }

}
