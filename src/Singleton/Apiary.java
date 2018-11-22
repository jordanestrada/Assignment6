package Singleton;

public class Apiary {
    
    private static Apiary apiary;
    
    private Apiary() {
        
    }
    
    public static Apiary getInstance() {
        
        if(apiary == null) {
            apiary = new Apiary();
        }
        
        return apiary;
    }


}
