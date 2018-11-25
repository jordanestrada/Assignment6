package decorator;

/*

This decorator class adds base attributes of a worker bee.
 
 */

public class Worker extends BeeDecorator {

    public Worker(BeeInterface newBee) {
        
        super(newBee);
        
        System.out.println("Making Worker Bee");
   
    }
    
    public String getBeeType() {
        return theBee.getBeeType() + "Worker Bee";
    }

    public int getBeeStrength() {
        
        return theBee.getBeeStrength() + 5;
    }

    public int getBeeSpeed() {

        return theBee.getBeeSpeed() + 35;
    }

}