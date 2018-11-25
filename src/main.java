import java.util.Scanner;

import Builder.BeeHive;
import Builder.BeeHiveBuilder;
import Builder.BeeHiveEngineer;
import Factory.Bee;
import Factory.BeeFactory;
import Singleton.Apiary;


public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        /////////////// SINGLETON DEMONSTRATION ///////////////
        
        //attempts to create two apiaries
        Apiary apiary1 = Apiary.getInstance();
        Apiary apiary2 = Apiary.getInstance();
        
        //uses the printing of apiary1 and apiary2's hashcodes to show that
        //only one apiary object can exist at a time
        System.out.println(apiary1.hashCode());
        System.out.println(apiary2.hashCode());
        
        
        /////////////// BUILDER DEMONSTRATION ///////////////
        
        
        BeeHiveBuilder testBeeHive = new BeeHiveBuilder();
        
        BeeHiveEngineer beeHiveEngineer = new BeeHiveEngineer(testBeeHive);
        
        beeHiveEngineer.makeBeeHive();
        
        BeeHive firstBeeHive = beeHiveEngineer.getBeeHive();
        
        System.out.println("");
        System.out.println("Bee type: " + firstBeeHive.getBeeType());
        System.out.println("This hive is a " + firstBeeHive.getHiveSize() + " sized hive." );
        System.out.println("This hive has " + firstBeeHive.getNumRooms() + " rooms." );
        System.out.println("This hive has " + firstBeeHive.getRestingRooms() );
        System.out.println("This hive has " + firstBeeHive.getSpawnRooms() );
        System.out.println("");
        
        /////////////// FACTORY DEMONSTRATION ///////////////
        
        boolean again = true;
        String typeOfBee = null;
        
        //our initial bee factory is created
        BeeFactory beeFactory = new BeeFactory();
        Bee newBee = null;
        
        
        //while & catch try block used to ensure valid entry
        while(again) {
            try {
                
                //user is prompted to select the type of bee our bee factory will create
                System.out.println("What type of bee would you like to create?");
                System.out.println("enter: WARRIOR, QUEEN, or WORKER");
                typeOfBee = input.nextLine();
                
                //bee factory creates a bee based on user selection and displays bee info
                newBee = beeFactory.makeBee(typeOfBee);
                newBee.beeDisplay();
                again = false;
                
            }
            catch(NullPointerException ex) {
                System.out.println("Invalid entry");
            }
        } 
        
    }

}
