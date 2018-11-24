package Builder;

public class BeeHiveBuilder implements BeeHiveBuilderInterface {
    
    private BeeHive beeHive;
    
    public BeeHiveBuilder() {
        this.beeHive = new BeeHive();
        
    }

    public void buildBeeType() {
        
        beeHive.setBeeType("Warrior Bee");
        
    }

    public void buildHiveSize() {
        
        beeHive.setHiveSize("Medium");
        
    }

    public void buildNumRooms() {
        
        beeHive.setNumRooms(25);
        
    }

    public void buildSpawningRooms() {
        beeHive.setSpawningRooms("No spawning rooms in this hive.");
        
    }

    public void buildRestingRooms() {
        beeHive.setRestingRooms("One resting room in this hive.");
        
    }

    public BeeHive getBeeHive() {
       
        return this.beeHive;
    }

    

}
