//Instruction 1
package entities;

import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }
    //Instruction 2
    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectations.put(e,d);
    }
    //Instruction 3
    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employe, Departement> affectation : affectations.entrySet())
            System.out.println("Employe : "+affectation.getKey()+"  -->  Departement : "+affectation.getValue());
    }
    //Instruction 4
    public void supprimerEmploye (Employe e){
        //les méthodes equals et hashcode sont redéfinies dans la classe Employe
        affectations.remove(e);
    }
    //Instruction 5
    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        for (Map.Entry<Employe, Departement> affectation : affectations.entrySet())
            if (affectation.getKey().equals(e) && affectation.getValue().equals(d))
                affectations.remove(e);
    }
    //Instruction 6
    public void afficherEmployes(){
        for (Employe employe : affectations.keySet())
            System.out.println("- "+employe);
    }
    //Instruction 7
    public void afficherDepartements(){
        for (Departement departement : affectations.values())
            System.out.println("- "+departement);
    }
    //Instruction 8
    public boolean rechercherEmploye (Employe e){
        return affectations.containsKey(e);
    }
    //Instruction 9
    public boolean rechercherDepartement (Departement d){
        return affectations.containsValue(d);
    }
    //Instruction 10
    public TreeMap<Employe, Departement> trierMap(){
        //On a la methode compareTo redéfinie dans la classe Employe
        return new TreeMap<>(affectations);
    }
}
