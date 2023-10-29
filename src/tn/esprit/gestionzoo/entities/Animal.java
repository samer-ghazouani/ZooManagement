package tn.esprit.gestionzoo.entities;

public sealed class Animal permits Aquatic, Terrestrial{
    //Instruction 22
    //Il faut rendre les attributs protected
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.setAge(age);
        this.isMammal = isMammal;
    }

    public Animal(){
        this.setAge(0);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>=0)
            this.age = age;
        else{
            System.out.println("L'age ne peut pas être negatif donc on le rend 0 par defaut");
            this.age = 0;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString(){
        return "famille : "+family+", nom : "+name+", age : ,"+age+" et mammifère : "+isMammal;
    }
}
