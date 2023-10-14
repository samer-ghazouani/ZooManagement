package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        //Instruction 21
        Aquatic fish = new Aquatic();
        Terrestrial lion = new Terrestrial();
        Dolphin dolf = new Dolphin();
        Penguin pen = new Penguin();
        //Instruction 22
        //On remarque des erreurs au niveau de la création des objets puisque le constructeur par défaut maintenant est le constructeur paramétré qu'on crée.
        //Pour corriger ces erreurs il faut créer un autre constructeur non paramétré dans chaque classe fille
        //Instruction 23
        System.out.println("Instruction 23 :");
        System.out.println(fish);
        System.out.println(lion);
        System.out.println(dolf);
        System.out.println(pen);
        System.out.println("-------------------------------------------------------------");
        //Instruction 24
        System.out.println("Instruction 24 :");
        fish.swim();
        dolf.swim();
        pen.swim();
        //On remarque que fish (de classe Aquatic) et pen (de classe Penguin) donne le même résultat puisque la classe Penguin est la fille de Aquatic
        //Par contre dolf (de classe Dolphin) ne donne pas le même résultat que sa classe mère pusique dans la classe Dolphin on a redéfini la fonction swim()
    }
}