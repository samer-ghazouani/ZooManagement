public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrAnimals=0;
    //Instruction 14
    final int nbrCages=25;
    //Puisque nbrCages devient une constante, il faut l'enlever du paramètre du constructeur
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    public Zoo(){

    }

    public void displayZoo(){
        System.out.println("nom : "+name+", cité: "+city+" et nombre de cages : "+nbrCages);
    }

    @Override
    public String toString(){
        return "nom : "+name+", cité: "+city+" et nombre de cages : "+nbrCages;
    }

    boolean addAnimal(Animal animal){
        if (this.searchAnimal(animal)==-1 && nbrAnimals!=nbrCages) {
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

    int searchAnimal(Animal animal){
        for (int i=0;i<nbrAnimals;i++)
            if (animals[i].name.equals(animal.name))
                return i;
        return  -1;
    }

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
    //Instruction 15
    boolean isZooFull(){
        if (nbrAnimals==nbrCages)
            return true;
        return false;
    }
    //Instruction 16
    //La méthode est statique pour qu'elle soit accessible à partir du nom de classe
    static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        else if (z1.nbrAnimals < z2.nbrAnimals) {
            return z2;
        }
        else
            return null;
    }
}
