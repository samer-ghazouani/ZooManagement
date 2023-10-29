package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {
    public static void main(String[] args) {
        //Instruction 33
        System.out.println("Instruction 33 :");
        Zoo myZoo=new Zoo("myZoo","Tunis");
        Animal animal1=new Animal("1","1",1,true);
        Animal animal2=new Animal("2","2",2,true);
        Animal animal3=new Animal("3","3",3,true);
        Animal animal4=new Animal("4","4",4,true);
        Animal animal5=new Animal("5","5",-5,true);
        try {
            myZoo.addAnimal(animal1);
            System.out.println(myZoo.getNbrAnimals());
            myZoo.addAnimal(animal2);
            System.out.println(myZoo.getNbrAnimals());
            myZoo.addAnimal(animal3);
            System.out.println(myZoo.getNbrAnimals());
            myZoo.addAnimal(animal4);
            System.out.println(myZoo.getNbrAnimals());
        }
        catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------------------------------------------------------");
        //Instruction 34
        System.out.println("Instruction 34 :");
        try {
            myZoo.addAnimal(animal5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println(myZoo.getNbrAnimals());
        } catch (ZooFullException e) {
            throw new RuntimeException(e);
        }
    }
}