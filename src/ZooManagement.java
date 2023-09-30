public class ZooManagement {
    public static void main(String[] args) {
        //Instruction 15
        System.out.println("Instruction 15 :");
        Zoo z1=new Zoo("z1","Ariana");
        for (int i=0;i<25;i++)
            z1.addAnimal(new Animal(Integer.toString(i),Integer.toString(i),i,true));
        if (z1.isZooFull())
            System.out.println(z1.name+" est plein");
        else
            System.out.println(z1.name+" contient encore des cages vides");
        Zoo z2=new Zoo("z2","Tunis");
        for (int i=0;i<10;i++)
            z2.addAnimal(new Animal(Integer.toString(i),Integer.toString(i),i,true));
        if (z2.isZooFull())
            System.out.println(z2.name+" est plein");
        else
            System.out.println(z2.name+" contient encore des cages vides");
        System.out.println("-------------------------------------------------------------");
        //Instruction 16
        System.out.println("Instruction 16 :");
        Zoo z3=new Zoo("z3","Jandouba");
        for (int i=0;i<10;i++)
            z3.addAnimal(new Animal(Integer.toString(i),Integer.toString(i),i,true));
        System.out.println("Nombre d'animaux dans z1 est "+z1.nbrAnimals);
        System.out.println("Nombre d'animaux dans z2 est "+z2.nbrAnimals);
        System.out.println("Nombre d'animaux dans z3 est "+z3.nbrAnimals);
        Zoo z1z2 = Zoo.comparerZoo(z1,z2);
        if (z1z2!=null)
            System.out.println("Entre z1 et z2, celui qui a plus de nombre d'animaux est "+z1z2.name);
        else
            System.out.println("z1 et z2 ont le même nombre d'animaux");
        Zoo z2z3 = Zoo.comparerZoo(z2,z3);
        if (z2z3!=null)
            System.out.println("Entre z2 et z3, celui qui a plus de nombre d'animaux est "+z2z3.name);
        else
            System.out.println("z2 et z3 ont le même nombre d'animaux");
    }
}