package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        //Instruction 26
        Zoo myZoo = new Zoo("myZoo", "Tunis");
        Dolphin dolf1 = new Dolphin("fish", "dolf1", 1, true, "Sea", 10.0f);
        Dolphin dolf2 = new Dolphin("fish", "dolf2", 2, true, "Sea", 20.0f);
        Aquatic pen1 = new Penguin("fish", "pen1", 1, false, "North Pole", 10.0f);
        Aquatic pen2 = new Penguin("fish", "pen2", 2, false, "North Pole", 20.0f);
        myZoo.addAquaticAnimal(dolf1);
        myZoo.addAquaticAnimal(dolf2);
        myZoo.addAquaticAnimal(pen1);
        myZoo.addAquaticAnimal(pen2);
        //Instruction 27
        System.out.println("Instruction 27 :");
        dolf1.swim();
        dolf2.swim();
        pen1.swim();
        pen2.swim();
        System.out.println("-------------------------------------------------------------");
        //On remarque que pour les penguins et puisqu'on n'a pas redefine la methode swim() on affiche "Aquatic animal swimming"
        //Instruction 29
        System.out.println("Instruction 29 :");
        System.out.println("Max Depth = " + myZoo.maxPenguinSwimmingDepth());
        System.out.println("-------------------------------------------------------------");
        //Instruction 30
        System.out.println("Instruction 30 :");
        myZoo.displayNumberOfAquaticsByType();
        System.out.println("-------------------------------------------------------------");
        //Instruction 31
        System.out.println("Instruction 31 :");
        Dolphin identicalDolf1 = new Dolphin("Another fish family", "dolf1", 1, true, "Sea", 100.0f);
        System.out.println("Are dolf1 and dolf2 identical ? : "+dolf1.equals(dolf2));
        System.out.println("Are dolf1 and identicalDolf1 identical ? : "+dolf1.equals(identicalDolf1));
    }
}