package Builder;

public class BeeHive implements BeeHiveBlueprint {
    
    private String beeType;
    private String hiveSize;
    private int numRooms;
    private String spawnRooms;
    private String restingRooms;
    
    public void setBeeType(String type) {
        
       beeType = type;
        
    }
    
    public String getBeeType(){
        
        return beeType;
        
    }


    public void setHiveSize(String size) {
        
        hiveSize = size;
        
    }
    
    public String getHiveSize(){
        
        return hiveSize;
        
    }


    public void setNumRooms(int num) {
        
        numRooms = num;
        
    }
    
    public int getNumRooms(){
        
        return numRooms;
        
    }


    public void setSpawningRooms(String sRooms) {
        
        spawnRooms = sRooms;
        
    }
    
    public String getSpawnRooms(){
        
        return spawnRooms;
        
    }


    public void setRestingRooms(String rRooms) {
        
        restingRooms = rRooms;
        
    }
    
    public String getRestingRooms(){
        
        return restingRooms;
        
    }

}
