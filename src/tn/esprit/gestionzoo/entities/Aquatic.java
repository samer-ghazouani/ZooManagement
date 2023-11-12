package tn.esprit.gestionzoo.entities;
//Instruction 37
import tn.esprit.gestionzoo.enumeration.*;
import tn.esprit.gestionzoo.interfaces.*;

import java.util.Objects;

public non-sealed abstract class Aquatic extends Animal implements Carnivore<Food>{
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public Aquatic() {
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "famille : "+super.getFamily()+", nom : "+super.getName()+", age : ,"+super.getAge()+", mammifère : "+super.isMammal()+" et habitat : "+habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aquatic aquatic = (Aquatic) o;
        return  (aquatic.getName().equals(this.getName()) && aquatic.getAge()==this.getAge() && aquatic.getHabitat().equals(this.getHabitat()));
    }

    @Override
    public void eatMeat(Food meat){
        if (meat == Food.MEAT) {
            System.out.println(super.getName() + " is eating " + meat);
        } else {
            System.out.println(super.getName() + " doesn't eat " + meat);
        }
    }
}
