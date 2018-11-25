package decorator;

public class Speed extends BeeDecorator {

    public Speed(BeeInterface newBee) {
        
        super(newBee);
        
        System.out.println("Adding speed points");
   
    }
    
    public String getBeeType() {
        return theBee.getBeeType();
    }

    public int getBeeStrength() {
        
        return theBee.getBeeStrength();
    }

    public int getBeeSpeed() {

        return theBee.getBeeSpeed() + 10;
    }

}