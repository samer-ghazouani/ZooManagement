//Instruction 20
package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {
    //Instruction 22
    //Il faut rendre l'attribut protected
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
    //Instruction 23
    @Override
    public String toString() {
        return "famille : "+super.getFamily()+", nom : "+super.getName()+", age : ,"+super.getAge()+", mammifère : "+super.isMammal()+" et habitat : "+habitat;
    }
    //Instruction 24
    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}
