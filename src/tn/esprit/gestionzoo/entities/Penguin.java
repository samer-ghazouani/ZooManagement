//Instruction 20
package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    //Instruction 22
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin() {
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    //Instruction 23
    @Override
    public String toString() {
        return "famille : "+family+", nom : "+name+", age : ,"+age+", mammifère : "+isMammal+", habitat : "+habitat+" et swimmingDepth : "+swimmingDepth;
    }
}
