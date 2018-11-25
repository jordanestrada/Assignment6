package decorator;

public class Queen extends BeeDecorator {

    public Queen(BeeInterface newBee) {
        
        super(newBee);
        
        System.out.println("Making Queen Bee");
   
    }
    
    public String getBeeType() {
        return theBee.getBeeType() + "Warrior Bee";
    }

    public int getBeeStrength() {
        
        return theBee.getBeeStrength() + 35;
    }

    public int getBeeSpeed() {

        return theBee.getBeeSpeed() + 5;
    }

}
