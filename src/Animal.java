//Instruction 5
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    //Instruction 6
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    //Instruction 7
    public Animal(){

    }
    //Instruction 9
    @Override
    public String toString(){
        return "famille : "+family+", nom : "+name+", age : ,"+age+" et mammifère :"+isMammal;
    }
}
