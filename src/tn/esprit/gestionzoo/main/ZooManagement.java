package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;
import tn.esprit.gestionzoo.enumeration.*;

public class ZooManagement {
    public static void main(String[] args) {
        //Instruction 38
        //on ne peut pas créer un objet de type aquatic de façon directe, car c'est une classe abstraite
        Aquatic dolphin=new Dolphin("Fish","Dolf",5,true,"Sea",100.5f);
        Penguin penguin=new Penguin("Birds","Pen",10,false,"North Pole",50.7f);
        Terrestrial pig=new Terrestrial("Suidae","Pig",1,true,4);

        Food[] foods= {Food.MEAT,Food.PLANT,Food.BOTH};
        for (Food food: foods) {
            dolphin.eatMeat(food);
            penguin.eatMeat(food);
            pig.eatMeat(food);
            pig.eatPlant(food);
            pig.eatPlantAndMeat(food);
        }
    }
}