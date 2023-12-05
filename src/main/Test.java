package main;

import entities.Employe;
import entities.SocieteArrayList;

public class Test {
    public static void main(String[] args) {
        Employe e1=new Employe(1,"1","1","12",1);
        Employe e2=new Employe(2,"2","2","12",2);
        Employe e3=new Employe(3,"3","3","34",2);
        Employe e4=new Employe(4,"4","4","34",1);
        Employe e5=new Employe(5,"5","5","5",1);
        SocieteArrayList list = new SocieteArrayList();
        list.ajouterEmploye(e5);
        list.ajouterEmploye(e4);
        list.ajouterEmploye(e3);
        list.ajouterEmploye(e2);
        list.ajouterEmploye(e1);
        System.out.println("Premier Ajout :");
        list.displayEmploye();
        System.out.println("Existe-t-il un employe avec le nom '1' : "+list.rechercherEmploye("1"));
        Employe e6=new Employe(6,"5","6","6",6);
        System.out.println("Est-ce que l'employe e6 appartient à la liste: "+list.rechercherEmploye(e6));
        list.supprimerEmploye(e5);
        System.out.println("Apres la suppression du e5 :");
        list.displayEmploye();
        System.out.println("Apres le tri par id :");
        list.trierEmployeParId();
        list.displayEmploye();
        System.out.println("Apres le tri par nom de departement et grade :");
        list.trierEmployeParNomDepartementEtGrade();
        list.displayEmploye();
    }
}
