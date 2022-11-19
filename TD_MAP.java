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
public class TD_MAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employe e1 = new Employe(01555222, "01A", "majd", "tabessi");
        Employe e2 = new Employe(54489325, "02B", "med", "wahchi");
        Employe e3 = new Employe(42598015, "03C", "yacine", "khouni");

        Departement d1 = new Departement(1, "GL");
        Departement d2 = new Departement(2, "BI");
        Departement d3 = new Departement(3, "Mobile");

        SocieteHashMap SH = new SocieteHashMap();

        SH.ajouterEmployeDepartement(e1, d1);
        SH.ajouterEmployeDepartement(e2, d2);
        SH.ajouterEmployeDepartement(e3, d3);
        System.out.println("------------------------DEPARTEMENT-----------------------");

        SH.afficherLesDepartements();
        System.out.println("-------------------------EMPLOYES-------------------------");
        SH.afficherLesEmployes();
        System.out.println("***********************************************************");
        SH.afficherLesEmployesLeursDepartements();

        SocieteTreeMap ST = new SocieteTreeMap();
        ST.ajouterEmployeDepartement(e1, d1);
        ST.ajouterEmployeDepartement(e2, d2);
        ST.ajouterEmployeDepartement(e3, d3);
        System.out.println("-------------------------EMPLOYES TREE MAP------------------");
        ST.afficherLesEmployes();
    }

}
