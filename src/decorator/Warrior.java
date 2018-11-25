package decorator;

public class Warrior extends BeeDecorator {

    public Warrior(BeeInterface newBee) {
        
        super(newBee);
        
        System.out.println("Making Warrior Bee");
   
    }
    
    public String getBeeType() {
        return theBee.getBeeType() + "Warrior Bee";
    }

    public int getBeeStrength() {
        
        return theBee.getBeeStrength() + 25;
    }

    public int getBeeSpeed() {

        return theBee.getBeeSpeed() + 15;
    }

}
