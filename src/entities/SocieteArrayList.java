package entities;

import interfaces.IGestion;
import java.util.*;

public class SocieteArrayList implements IGestion<Employe>,Comparator<Employe>{
    private ArrayList<Employe> listeEmploye;

    public SocieteArrayList() {
        listeEmploye = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmploye.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listeEmploye)
            if (e.getNom().equals(nom))
                return true;
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmploye.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmploye.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println("La liste des employes :");
        for (Employe e: listeEmploye)
            System.out.println("-"+e);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmploye);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(listeEmploye,new SocieteArrayList());
    }

    @Override
    public int compare(Employe e1, Employe e2) {
        if (e1.getNomDepartement().compareTo(e2.getNomDepartement())==0)
            return e1.getGrade() - e2.getGrade();
        return e1.getNomDepartement().compareTo(e2.getNomDepartement());
    }
}
