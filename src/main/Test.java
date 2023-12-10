package main;

import entities.*;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        //Instruction 2
        Employe e1 = new Employe(1,"1","1","1",1);
        Employe e2 = new Employe(2,"2","2","2",2);
        Employe e3 = new Employe(3,"3","3","3",3);
        Departement d1 = new Departement(1,"1",10);
        Departement d2 = new Departement(2,"2",20);
        Departement d3 = new Departement(3,"3",30);
        AffectationHashMap affectations = new AffectationHashMap();
        affectations.ajouterEmployeDepartement(e2,d2);
        affectations.ajouterEmployeDepartement(e3,d3);
        affectations.ajouterEmployeDepartement(e1,d3);
        //Instruction 3
        System.out.println("Instruction 3 :");
        System.out.println("Avant changement :");
        affectations.afficherEmployesEtDepartements();
        affectations.ajouterEmployeDepartement(e1,d1);
        System.out.println("Aprés changement :");
        affectations.afficherEmployesEtDepartements();
        //On remarque que l'ajout de nouveau département d1 a écrasé l'ancien département d3 et le remplacé
        System.out.println("------------------------------------------------------------");
        //Instruction 4
        System.out.println("Instruction 4 :");
        Employe e4 = new Employe(4,"4","4","2",4);
        affectations.ajouterEmployeDepartement(e4,d2);
        System.out.println("Avant suppression de e4 :");
        affectations.afficherEmployesEtDepartements();
        affectations.supprimerEmploye(e4);
        System.out.println("Aprés suppression de e4 :");
        affectations.afficherEmployesEtDepartements();
        System.out.println("------------------------------------------------------------");
        //Instruction 5
        System.out.println("Instruction 5 :");
        Employe e5 = new Employe(5,"5","5","5",5);
        Departement d5 = new Departement(5,"5",50);
        affectations.ajouterEmployeDepartement(e5,d5);
        System.out.println("Avant suppression de e5 qui travaille dans d5 :");
        affectations.afficherEmployesEtDepartements();
        affectations.supprimerEmployeEtDepartement(e5,d5);
        System.out.println("Aprés suppression de e5 qui travaille dans d5 :");
        affectations.afficherEmployesEtDepartements();
        System.out.println("------------------------------------------------------------");
        //Instruction 6
        System.out.println("Instruction 6 :");
        System.out.println("Liste employes :");
        affectations.afficherEmployes();
        System.out.println("------------------------------------------------------------");
        //Instruction 7
        System.out.println("Instruction 7 :");
        System.out.println("Liste departements :");
        affectations.afficherDepartements();
        System.out.println("------------------------------------------------------------");
        //Instruction 8
        System.out.println("Instruction 8 :");
        System.out.println("Est-ce que e1 fait partie de notre collection ? : "+affectations.rechercherEmploye(e1));
        System.out.println("------------------------------------------------------------");
        //Instruction 9
        System.out.println("Instruction 9 :");
        System.out.println("Est-ce que d5 fait partie de notre collection ? : "+affectations.rechercherDepartement(d5));
        System.out.println("------------------------------------------------------------");
        //Instruction 10
        System.out.println("Instruction 10 :");
        TreeMap<Employe,Departement> tree = affectations.trierMap();
        for (Map.Entry<Employe, Departement> t : tree.entrySet())
            System.out.println("Employe : "+t.getKey()+"  -->  Departement : "+t.getValue());
    }
}
