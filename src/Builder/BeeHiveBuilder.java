package Builder;
/*

Description:
Concrete bee hive builder class assembling a finished product.
Assembles one example of a type of beehive (houses warrior bees, medium sized, 25 
rooms, no spawning rooms and one resting room).

*/

public class BeeHiveBuilder implements BeeHiveBuilderInterface {
    
    // beeHive object created whenever BeeHiveBuilder(); is called
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
        beeHive.setSpawningRooms("no spawning rooms.");
        
    }

    public void buildRestingRooms() {
        beeHive.setRestingRooms("one resting room.");
        
    }

    public BeeHive getBeeHive() {
       
        return this.beeHive;
    }

    

}
