package Builder;

/*
File: 
Author:   
Date: 

Description:
BeeHiveBlueprint sets up interface for creating all beehives.
Defines methods that will be set up.
Will be implemented by Beehive.Java

*/

public interface BeeHiveBlueprint {
    
    public void setBeeType(String type);
    public void setHiveSize(String size);
    public void setNumRooms(int num);
    public void setSpawningRooms(String sRooms);
    public void setRestingRooms(String rRooms);

}
