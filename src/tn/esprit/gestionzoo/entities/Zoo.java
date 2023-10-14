package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;
    public static final int NUMBER_OF_CAGES=25;
    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.setName(name);
        this.city = city;
    }

    public Zoo(){
        this.setName("MyZoo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && name.strip().isEmpty()==false)
            this.name = name;
        else{
            System.out.println("Le nom ne doit pas être vide donc on le rend MyZoo par default");
            this.name = "MyZoo";
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void displayZoo(){
        System.out.println("nom : "+name+", cité: "+city+" et nombre d'animales : "+nbrAnimals);
    }

    @Override
    public String toString(){
        return "nom : "+name+", cité: "+city+" et nombre d'animales : "+nbrAnimals;
    }

    public boolean addAnimal(Animal animal){
        if (this.searchAnimal(animal)==-1 && this.isZooFull()==false) {
            animals[nbrAnimals]=animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    public void displayAnimals(){
        System.out.println("Les animaux dans "+name+" sont : ");
        for (int i=0;i<nbrAnimals;i++)
            System.out.println("- "+animals[i]);
    }

    public int searchAnimal(Animal animal){
        for (int i=0;i<nbrAnimals;i++)
            if (animals[i].getName().equals(animal.getName()))
                return i;
        return  -1;
    }

    public boolean removeAnimal(Animal animal){
        if (this.searchAnimal(animal)!=-1) {
            for (int i = this.searchAnimal(animal); i < nbrAnimals-1; i++)
                animals[i] = animals[i + 1];
            animals[nbrAnimals-1]=null;
            nbrAnimals--;
            return true;
        }
        return false;
    }

    public boolean isZooFull(){
        if (nbrAnimals==NUMBER_OF_CAGES)
            return true;
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        else if (z1.nbrAnimals < z2.nbrAnimals) {
            return z2;
        }
        else
            return null;
    }
}
