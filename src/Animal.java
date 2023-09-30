public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public Animal(){

    }

    @Override
    public String toString(){
        return "famille : "+family+", nom : "+name+", age : ,"+age+" et mammifère :"+isMammal;
    }
}
