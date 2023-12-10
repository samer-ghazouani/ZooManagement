package entities;

import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectations.put(e,d);
    }

    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employe, Departement> affectation : affectations.entrySet())
            System.out.println("Employe : "+affectation.getKey()+"  -->  Departement : "+affectation.getValue());
    }

    public void supprimerEmploye (Employe e){
        //les méthodes equals et hashcode sont redéfinies dans la classe Employe
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        for (Map.Entry<Employe, Departement> affectation : affectations.entrySet())
            if (affectation.getKey().equals(e) && affectation.getValue().equals(d))
                affectations.remove(e);
    }

    public void afficherEmployes(){
        for (Employe employe : affectations.keySet())
            System.out.println("- "+employe);
    }

    public void afficherDepartements(){
        for (Departement departement : affectations.values())
            System.out.println("- "+departement);
    }

    public boolean rechercherEmploye (Employe e){
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap(){
        return new TreeMap<>(affectations);
    }
}
