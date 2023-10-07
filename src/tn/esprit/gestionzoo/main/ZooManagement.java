//Instruction 19
package tn.esprit.gestionzoo.main;
//Il faut importer l'autre package pour créer les différents objets
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        //Instruction 17
        System.out.println("Instruction 17 :");
        Zoo z1=new Zoo("z1","Ariana");
        for (int i=0;i<25;i++)
            z1.addAnimal(new Animal(Integer.toString(i),Integer.toString(i),i,true));
        if (z1.addAnimal(new Animal()))
            System.out.println("L'ajout a bien été fait.");
        else
            System.out.println(z1.getName() +" est plein.");
        System.out.println("-------------------------------------------------------------");
        //Instruction 18
        System.out.println("Instruction 18 :");
        Zoo newZoo=new Zoo();
        Animal newAnimal=new Animal();
        System.out.println("Avant modification :");
        System.out.println("Le nom de zoo est : "+newZoo.getName());
        System.out.println("L'age de l'animal est : "+newAnimal.getAge());
        newZoo.setName("     ");
        newAnimal.setAge(-13);
        System.out.println("Aprés tester d'utiliser un nom de zoo vide et un age negatif :");
        System.out.println("Le nom de zoo est : "+newZoo.getName());
        System.out.println("L'age de l'animal est : "+newAnimal.getAge());
        newZoo.setName("newZoo");
        newAnimal.setAge(10);
        System.out.println("Aprés modification :");
        System.out.println("Le nom de zoo est : "+newZoo.getName());
        System.out.println("L'age de l'animal est : "+newAnimal.getAge());
    }
}