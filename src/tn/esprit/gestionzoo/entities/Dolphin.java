//Instruction 20
package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    //Instruction 22
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin() {
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    //Instruction 23
    @Override
    public String toString() {
        return "famille : "+family+", nom : "+name+", age : ,"+age+", mammifère : "+isMammal+", habitat : "+habitat+" et swimmingSpeed : "+swimmingSpeed;
    }
    //Instruction 24
    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
