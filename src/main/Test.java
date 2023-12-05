package main;

import entities.*;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Departement d1 = new Departement(1,"1",1);
        Departement d2 = new Departement(2,"2",2);
        Departement d3 = new Departement(3,"3",3);
        Departement d4 = new Departement(4,"4",4);
        Departement d5 = new Departement(5,"5",5);
        DepartementHashSet set = new DepartementHashSet();
        set.ajouterDepartement(d3);
        set.ajouterDepartement(d5);
        set.ajouterDepartement(d2);
        set.ajouterDepartement(d4);
        set.ajouterDepartement(d1);
        System.out.println("Premier Ajout :");
        set.displayDepartement();
        System.out.println("Existe-t-il un département nommé '1' ? : "+set.rechercherDepartement("1"));
        Departement d6 = new Departement(6,"6",6);
        System.out.println("Est-ce-que d6 appartient à notre set ? : "+set.rechercherDepartement(d6));
        set.supprimerDepartement(d2);
        System.out.println("Apres la suppression du d2 :");
        set.displayDepartement();
        TreeSet<Departement> triSet = set.trierDepartementById();
        System.out.println("Apres le tri par id :");
        System.out.println("La liste des departements :");
        for (Departement dept:triSet)
            System.out.println("-"+dept);
    }
}
