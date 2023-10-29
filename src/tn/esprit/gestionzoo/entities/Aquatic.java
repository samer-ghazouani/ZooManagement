package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public non-sealed abstract class Aquatic extends Animal {
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
    //Instruction 28
    public abstract void swim();
    //Instruction 31
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aquatic aquatic = (Aquatic) o;
        return  (aquatic.getName().equals(this.getName()) && aquatic.getAge()==this.getAge() && aquatic.getHabitat().equals(this.getHabitat()));
    }
}
