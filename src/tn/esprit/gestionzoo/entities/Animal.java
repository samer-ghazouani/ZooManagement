//Instruction 19
package tn.esprit.gestionzoo.entities;

public class Animal {
    //Instruction 18
    //Pour restreindre l’accès aux attributs on les rend privés et on ajoute des getters et setters pour chaque attributs
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    //Pour assurer que l'age de l'aniimal n'est pas negatif on utilise le setter de l'age dans le constructeur
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
    //Pour eviter que l'age soit negatif si l'utilisateur saisit un age invalide on le donne une valeur par defaut 0
    public void setAge(int age) {
        if (age>=0)
            this.age = age;
        else
            this.age = 0;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString(){
        return "famille : "+family+", nom : "+name+", age : ,"+age+" et mammifère :"+isMammal;
    }
}
