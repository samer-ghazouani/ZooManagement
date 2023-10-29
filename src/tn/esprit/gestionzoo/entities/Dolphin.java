package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

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

    @Override
    public String toString() {
        return "famille : "+super.getFamily()+", nom : "+super.getName()+", age : ,"+super.getAge()+", mammifère : "+super.isMammal()+", habitat : "+habitat+" et swimmingSpeed : "+swimmingSpeed;
    }

    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
