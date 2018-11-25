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
        
        System.out.println("Bee type: " + firstBeeHive.getBeeType());
        System.out.println("This hive is a " + firstBeeHive.getHiveSize() + " sized hive." );
        System.out.println("This hive has " + firstBeeHive.getNumRooms() + " rooms." );
        System.out.println("This hive has " + firstBeeHive.getRestingRooms() );
        System.out.println("This hive has " + firstBeeHive.getSpawnRooms() );
        
        
        /////////////// FACTORY DEMONSTRATION ///////////////
        
        BeeFactory beeFactory = new BeeFactory();
        
        Bee newBee = null;
        
        System.out.println("What type of bee would you like to create?");
        
        String typeOfBee = input.nextLine();
        
        newBee = beeFactory.makeBee(typeOfBee);
        
        newBee.beeDisplay();
        
        
        
        
        
        
        
    }

}
