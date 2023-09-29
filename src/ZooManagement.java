import java.util.Scanner;
//Instruction 1
public class ZooManagement {
    int nbrCages = 20;
    String zooName = "myZoo";

    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
        System.out.println("Instruction 1 :");
        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages.");
        System.out.println("-------------------------------------------------------------");
        //Instruction 2
        Scanner clavier = new Scanner(System.in);
        System.out.println("Instruction 2 :");
        System.out.print("Saisir le nombre de cages : ");
        int cages = clavier.nextInt();
        clavier.nextLine(); //nextInt laisse la touche Entrée enfoncée pour eviter le bug on ajoute cette ligne
        System.out.print("Saisir le nom du zoo : ");
        String name = clavier.nextLine();
        ZooManagement zmSaisi = new ZooManagement();
        zmSaisi.nbrCages = cages;
        zmSaisi.zooName = name;
        System.out.println("-------------------------------------------------------------");
        //Instruction 3
        System.out.println("Instruction 3 :");
        System.out.println(zmSaisi.zooName + " comporte " + zmSaisi.nbrCages + " cages.");
        clavier.close();
    }
}