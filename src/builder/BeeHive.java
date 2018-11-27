package builder;
/*

Description:
Concrete Beehive class based off of BeeHiveBluePrint interface.
Contains the setters and getters.

*/

public class BeeHive implements BeeHiveBlueprint {
    
    private String beeType;
    private String hiveSize;
    private int numRooms;
    private String spawnRooms;
    private String restingRooms;
    
    public void setBeeType(String type) {
        
        beeType = type;
        
    }
    
    public String getBeeType() {
        
        return beeType;
        
    }


    public void setHiveSize(String size) {
        
        hiveSize = size;
        
    }
    
    public String getHiveSize() {
        
        return hiveSize;
        
    }


    public void setNumRooms(int num) {
        
        numRooms = num;
        
    }
    
    public int getNumRooms() {
        
        return numRooms;
        
    }


    public void setSpawningRooms(String spawn) {
        
        spawnRooms = spawn;
        
    }
    
    public String getSpawnRooms() {
        
        return spawnRooms;
        
    }


    public void setRestingRooms(String rest) {
        
        restingRooms = rest;
        
    }
    
    public String getRestingRooms() {
        
        return restingRooms;
        
    }

}
