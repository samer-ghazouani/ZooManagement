//Instruction 20
package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    private int nbrLegs;
    //Instruction 22
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial() {
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    //Instruction 23
    @Override
    public String toString() {
        return "famille : "+family+", nom : "+name+", age : ,"+age+", mammifère : "+isMammal+" et nbrLegs : "+nbrLegs;
    }
}