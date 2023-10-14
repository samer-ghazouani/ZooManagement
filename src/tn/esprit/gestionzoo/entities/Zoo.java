//Instruction 19
//On rend les differents méthodes publique pour l'accéder dans l'autre package
package tn.esprit.gestionzoo.entities;

public class Zoo {
    //Instruction 18
    //Pour restreindre l’accès aux attributs on les rend privés
    //on n'a pas besoin de getter et setter pour le tableau d'animaux
    private Animal[] animals;
    //on ajoute un getter et setter pour le nom et on assure dans le setter qu'il ne doit pas être vide
    private String name;
    //on ajoute un getter et setter pour le cité
    private String city;
    //on ajoute seulement un getter pour nombre d'animaux
    private int nbrAnimals;
    //Le nombre de cages est une constante statique donc elle doit être publique
    public static final int NUMBER_OF_CAGES=25;
    //Pour assurer que le nom de zoo n'est pas vide on utilise le setter de nom dans le constructeur
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

    //Pour eviter que le nom soit vide si l'utilisateur saisit un nom non valide on le donne une valeur par defaut "myZoo"
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
    //Instruction 17
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
