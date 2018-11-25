package Factory;

public class BeeFactory {
    
    public Bee makeBee(String newBeeType) {
        
        Bee newBee = null;
        
        if(newBee.equals("WORKER") || newBee.equals("worker") ||newBee.equals("Worker")) {
            
            return new WorkerBee();
            
        } else
        if(newBee.equals("WARRIOR") || newBee.equals("warrior") ||newBee.equals("Warrior")) {
            
            return new WarriorBee();
            
        } else
        if(newBee.equals("QUEEN") || newBee.equals("queen") ||newBee.equals("Queen")) {
            
            return new QueenBee();
            
        }
        
        
    }

}
