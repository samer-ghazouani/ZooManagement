//Instruction 5
public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimals=0;
    //Instruction 6
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    //Instruction 7
    public Zoo(){

    }
    //Instruction 8
    public void displayZoo(){
        System.out.println("nom : "+name+", cité: "+city+" et nombre de cages : "+nbrCages);
    }
    //Instruction 9
    @Override
    public String toString(){
        return "nom : "+name+", cité: "+city+" et nombre de cages : "+nbrCages;
    }
    //Instruction 10
    boolean addAnimal(Animal animal){
        //Instruction 12
        //Pour assurer que les animaux sont unique on doit d'abord chercher le nouvelle animau dans le zoo avant de l'ajouter
        if (this.searchAnimal(animal)==-1 && nbrAnimals!=nbrCages) {
            animals[nbrAnimals]=animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }
    //Instruction 11
    public void displayAnimals(){
        System.out.println("Les animaux dans "+name+" sont : ");
        for (int i=0;i<nbrAnimals;i++)
            System.out.println("- "+animals[i]);
    }

    int searchAnimal(Animal animal){
        for (int i=0;i<nbrAnimals;i++)
            if (animals[i].name.equals(animal.name))
                return i;
        return  -1;
    }
    //Instruction 13
    boolean removeAnimal(Animal animal){
        if (this.searchAnimal(animal)!=-1) {
            for (int i = this.searchAnimal(animal); i < nbrAnimals-1; i++)
                animals[i] = animals[i + 1];
            animals[nbrAnimals-1]=null;
            nbrAnimals--;
            return true;
        }
        return false;
    }
}
