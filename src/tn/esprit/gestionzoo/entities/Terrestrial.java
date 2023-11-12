package tn.esprit.gestionzoo.entities;
//Instruction 37
import tn.esprit.gestionzoo.enumeration.*;
import tn.esprit.gestionzoo.interfaces.*;

public final class Terrestrial extends Animal implements Omnivore<Food>{
    private int nbrLegs;

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

    @Override
    public String toString() {
        return "famille : "+super.getFamily()+", nom : "+super.getName()+", age : ,"+super.getAge()+", mammifère : "+super.isMammal()+" et nbrLegs : "+nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat==Food.MEAT)
            System.out.println(super.getName()+" is eating "+meat);
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant==Food.PLANT)
            System.out.println(super.getName()+" is eating "+plant);
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        switch (food){
            case BOTH -> {
                System.out.println(super.getName()+" is eating "+food);
            }
            case PLANT -> {
                System.out.println(super.getName()+" is eating "+food+" but also can eat "+Food.MEAT);
            }
            default ->  {
                System.out.println(super.getName()+" is eating "+food+" but also can eat "+Food.PLANT);
            }
        }
    }
}
