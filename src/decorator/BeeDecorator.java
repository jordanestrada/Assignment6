package decorator;
/*

This decorator class uses our decorator objects to make changes to our methods.
 
 */

abstract class BeeDecorator implements BeeInterface {
    
    protected BeeInterface theBee;
    
    public BeeDecorator(BeeInterface newBee) {
        
        theBee = newBee;
        
    }
    
    public String getBeeType() {
        return theBee.getBeeType();
    }

    public int getBeeStrength() {
        
        return theBee.getBeeStrength();
    }

    public int getBeeSpeed() {

        return theBee.getBeeSpeed();
    }

}
