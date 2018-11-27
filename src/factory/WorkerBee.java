package factory;
/*

WorkerBee will implement our abstract Bee class with the 
information unique to WorkerBee
 
 */

public class WorkerBee extends Bee {
    
    public WorkerBee() {
        setType("Worker Bee");
        setSkills("assembles rooms & feeds resting warrior bees.");
    }

}
