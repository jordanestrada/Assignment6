package Factory;
/*

When provided the correct string, BeeFactory will use our abstract Bee 
class to implement the methods needed to make our Bee.
 
 */

public class BeeFactory {
    
    public Bee makeBee(String newBeeType) {
        
        Bee newBee = null;
        
        if(newBeeType.equals("WORKER") || newBeeType.equals("worker") ||newBeeType.equals("Worker")) {
            
            return new WorkerBee();
            
        } else
            
        if(newBeeType.equals("WARRIOR") || newBeeType.equals("warrior") ||newBeeType.equals("Warrior")) {
            
            return new WarriorBee();
            
        } else
            
        if(newBeeType.equals("QUEEN") || newBeeType.equals("queen") ||newBeeType.equals("Queen")) {
            
            return new QueenBee();
            
        } else return null;
        
        
    }

}
