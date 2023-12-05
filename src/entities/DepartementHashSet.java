package entities;

import interfaces.IDepartement;
import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> setDepartements;

    public DepartementHashSet() {
        setDepartements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        setDepartements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dept:setDepartements) {
            if (dept.getNomDepartement().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return setDepartements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        setDepartements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println("La liste des departements :");
        for (Departement dept:setDepartements)
            System.out.println("-"+dept);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        //On a implémenté l'interface Comparable dans la classe Departement pour créer la TreeSet plus facilement
        TreeSet triDepartements = new TreeSet<>(setDepartements);
        return triDepartements;
    }
}
