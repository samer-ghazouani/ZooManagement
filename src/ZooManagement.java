public class ZooManagement {
    public static void main(String[] args) {
        //Instruction 5
        Animal lion = new Animal();
        lion.family = "Lion";
        lion.name = "Simba";
        lion.age = 8;
        lion.isMammal = true;
        Zoo myZoo = new Zoo();
        myZoo.animals= new Animal[3];
        myZoo.name="myZoo";
        myZoo.city="Tunis";
        myZoo.nbrCages=3;
        //Instruction 6
        //On remarque une erreur au niveau de la création des objets puisque avant d'ajouter le constructeur paramétré java utilise le constructeur par défaut qui n'a pas besoin de paramètres donc pas d'erreur mais maintenant le constructeur qu'on a créé est devenu le constructeur par défaut et on a besoin d'ajouter les paramètres.
        //Instruction 7
        //Pour résoudre ce problème, on ajoute un autre constructeur non paramétré.
        Animal elephant = new Animal("Elephant","Babar",10,true);
        Animal chicken = new Animal("Chicken","Wings",6,false);
        Animal fish = new Animal("Fish","Nemo",4,false);
        //Instruction 8
        System.out.println("Instruction 8 :");
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        //On remarque que la méthode qu'on a créée affiche les attributs de notre objet par contre les 2 dernières instructions, et puisqu'on n'a pas redéfini la méthode toString, affichent le nom de notre classe suivie de l'adresse mémoire
        System.out.println("-------------------------------------------------------------");
        //Instruction 9
        //On remarque maintenant que les 3 instructions affiche la même chose
        System.out.println("Instruction 9 :");
        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(chicken);
        System.out.println(fish);
        System.out.println("-------------------------------------------------------------");
        //Instruction 10
        System.out.println("Instruction 10 :");
        if (myZoo.addAnimal(lion))
            System.out.println("L'ajout du "+lion.family+" a bien été fait.");
        else
            System.out.println("On ne peut pas ajouter "+lion.family+"! Toutes les cages sont occupées.");
        if (myZoo.addAnimal(elephant))
            System.out.println("L'ajout du "+elephant.family+" a bien été fait.");
        else
            System.out.println("On ne peut pas ajouter "+elephant.family+"! Toutes les cages sont occupées.");
        if (myZoo.addAnimal(chicken))
            System.out.println("L'ajout du "+chicken.family+" a bien été fait.");
        else
            System.out.println("On ne peut pas ajouter "+chicken.family+"! Toutes les cages sont occupées.");
        if (myZoo.addAnimal(fish))
            System.out.println("L'ajout du "+fish.family+" a bien été fait.");
        else
            System.out.println("On ne peut pas ajouter "+fish.family+"! Toutes les cages sont occupées.");
        //On remarque que l'ajout de fish est impossible puisque le nombre de cages de myZoo est 3 et on a déjà ajouté lions, elephant et chicken
        System.out.println("-------------------------------------------------------------");
        //Instruction 11
        System.out.println("Instruction 11 :");
        myZoo.displayAnimals();
        Zoo newZoo1 = new Zoo("newZoo1","Jandouba",5);
        newZoo1.addAnimal(lion);
        if (newZoo1.searchAnimal(lion)==-1)
            System.out.println("Animal introuvable!");
        else
            System.out.println(lion.name+" existe dans la cage N°"+newZoo1.searchAnimal(lion));
        //La méthode retourne l'emplacement de lion dans newZoo
        Animal newLion = new Animal("Lion","Simba",8,true);
        newZoo1.addAnimal(newLion);
        if (newZoo1.searchAnimal(newLion)==-1)
            System.out.println("Animal introuvable!");
        else
            System.out.println(newLion.name+" existe dans la cage N°"+newZoo1.searchAnimal(newLion));
        System.out.println("-------------------------------------------------------------");
        //La méthode retourne l'emplacement du premier lion ajouté et pas de newLion
        //Instruction 12
        //Pour eviter le problème on doit assurer que chaque zoo est compsoé de differents animaux (pas d'animaux identiques)
        //On modifie la méthode addAnimal de façon quel cherche si l'animal existe deja dans le zoo et s'il ya des cages vides avant de l'ajouter
        System.out.println("Instruction 12 :");
        Zoo newZoo2 = new Zoo("newZoo2","Sfax",3);
        if(newZoo2.addAnimal(lion))
            System.out.println("L'ajout du "+lion.family+" a bien été fait.");
        else
            System.out.println(lion.family+" existe déjà ou pas de cage vide.");
        if(newZoo2.addAnimal(newLion))
            System.out.println("L'ajout du "+newLion.family+" a bien été fait.");
        else
            System.out.println(newLion.family+" existe déjà ou pas de cage vide.");
        newZoo2.displayAnimals();
        System.out.println("-------------------------------------------------------------");
        //Instruction 13
        System.out.println("Instruction 13 :");
        System.out.println("Avant suppression :");
        myZoo.displayAnimals();
        if (myZoo.removeAnimal(lion))
            System.out.println("Succès de la suppression de "+lion.name);
        else
            System.out.println("Animal introuvable!");
        System.out.println("Aprés suppression :");
        myZoo.displayAnimals();
    }
}