package factory;
/*

This is our abstract class the factory will be populating based 
on which bee is being created
 
 */

public abstract class Bee {
    
    private String skills;
    private String type;
    
    

    public String getType() {
        return type;
    }
    
    public void setType(String newType) {
        this.type = newType;
    }
    
    public String getSkills() {
        return skills;
    }
    
    public void setSkills(String newSkills) {
        this.skills = newSkills;
    }
    
    public void beeDisplay() {
        
        System.out.println("--------------- LETS GET READY TO BUMBLE ---------------");
        System.out.println("This is a " + getType());
        System.out.println("This bee " + getSkills());
    }
    
    

}
