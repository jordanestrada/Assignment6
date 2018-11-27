package builder;

/*

Description:
Interface for building all the types of beehives.

*/

public interface BeeHiveBuilderInterface {
    
    public void buildBeeType();
    
    public void buildHiveSize();
    
    public void buildNumRooms();
    
    public void buildSpawningRooms();
    
    public void buildRestingRooms();
    
    public BeeHive getBeeHive();

}
