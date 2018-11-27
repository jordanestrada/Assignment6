package builder;

/*

Description:
BeeHiveBlueprint sets up interface for setting values for all beehives.
Defines methods that will be set up.
Will be implemented by BeeHive.java

*/

public interface BeeHiveBlueprint {
    
    public void setBeeType(String type);
    
    public void setHiveSize(String size);
    
    public void setNumRooms(int num);
    
    public void setSpawningRooms(String spawn);
    
    public void setRestingRooms(String rest);

}
