package decorator;
/*

This decorator class adds 10 points to the bee strength without 
affecting any of the object's other values.
 
 */

public class Strength extends BeeDecorator {

    public Strength(BeeInterface newBee) {
        
        super(newBee);
        
        System.out.println("Adding strength points");
   
    }
    
    public String getBeeType() {
        return theBee.getBeeType();
    }

    public int getBeeStrength() {
        
        return theBee.getBeeStrength() + 10;
    }

    public int getBeeSpeed() {

        return theBee.getBeeSpeed();
    }

}