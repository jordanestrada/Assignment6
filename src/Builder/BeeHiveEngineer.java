package Builder;
/*
File: 
Author:   
Date: 

Description:
Creates a bee hive using the methods specified by BeeHiveBuilder
*/


public class BeeHiveEngineer {
    
    private BeeHiveBuilder beeHiveBuilder;
    
    public BeeHiveEngineer(BeeHiveBuilder beeHiveBuilder) {
        this.beeHiveBuilder = beeHiveBuilder;
    }
    
    public BeeHive getBeeHive() {
        
        return this.beeHiveBuilder.getBeeHive();
    }

    public void makeBeeHive() {
        
        this.beeHiveBuilder.buildBeeType();
        this.beeHiveBuilder.buildHiveSize();
        this.beeHiveBuilder.buildNumRooms();
        this.beeHiveBuilder.buildRestingRooms();
        this.beeHiveBuilder.buildSpawningRooms();
        
    }
}
