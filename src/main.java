import Singleton.Apiary;

public class main {

    public static void main(String[] args) {
        
        
        /////////////// SINGLETON DEMONSTRATION ///////////////
        
        //attempts to create two apiaries
        Apiary apiary1 = Apiary.getInstance();
        Apiary apiary2 = Apiary.getInstance();
        
        //uses the printing of apiary1 and apiary2's hashcodes that
        //only one apiary object can exist at a time
        System.out.println(apiary1.hashCode());
        System.out.println(apiary2.hashCode());
        
        
    }

}
