import builder.BeeHive;
import builder.BeeHiveBuilder;
import builder.BeeHiveEngineer;
import decorator.BeeInterface;
import decorator.BlankBee;
import decorator.Speed;
import decorator.Strength;
import decorator.Warrior;
import factory.Bee;
import factory.BeeFactory;
import java.util.Scanner;
import singleton.Apiary;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in, "UTF-8");
        
         
        /////////////// SINGLETON DEMONSTRATION ///////////////
        
        //attempts to create two apiaries
        Apiary apiary1 = Apiary.getInstance();
        Apiary apiary2 = Apiary.getInstance();
        
        //uses the printing of apiary1 and apiary2's hashcodes to show that
        //only one apiary object can exist at a time
        System.out.println(apiary1.hashCode());
        System.out.println(apiary2.hashCode());
        
        
        /////////////// BUILDER DEMONSTRATION ///////////////
        
        //make a BeeHiveBuilder object that will build our bee hive
        BeeHiveBuilder testBeeHive = new BeeHiveBuilder();
        
        //engineer creates our bee hive based on fields set by BeeHiveBuilder
        BeeHiveEngineer beeHiveEngineer = new BeeHiveEngineer(testBeeHive);
        beeHiveEngineer.makeBeeHive();
        BeeHive firstBeeHive = beeHiveEngineer.getBeeHive();
        
        System.out.println("");
        System.out.println("Bee type: " + firstBeeHive.getBeeType());
        System.out.println("This hive is a " + firstBeeHive.getHiveSize() + " sized hive.");
        System.out.println("This hive has " + firstBeeHive.getNumRooms() + " rooms.");
        System.out.println("This hive has " + firstBeeHive.getRestingRooms());
        System.out.println("This hive has " + firstBeeHive.getSpawnRooms());
        System.out.println("");
        
        /////////////// FACTORY DEMONSTRATION ///////////////
        
        boolean again = true;
        String typeOfBee = "";
        
        //our initial bee factory is created
        BeeFactory beeFactory = new BeeFactory();
        Bee newBee = null;
        
        
        //while & catch try block used to ensure valid entry
        while (again) {
            try {
                
                //user is prompted to select the type of bee our bee factory will create
                System.out.println("What type of bee would you like to create?");
                System.out.println("enter: WARRIOR, QUEEN, or WORKER");
                
                if (input.hasNextLine()) {
                    
                    typeOfBee = input.nextLine();
                    
                    //bee factory creates a bee based on user selection and displays bee info
                    newBee = beeFactory.makeBee(typeOfBee);
                    //}
                
                    newBee.beeDisplay();
                    again = false;
                }
            } catch (NullPointerException ex) {
                System.out.println("Invalid entry");
            }
        } 

        
        /////////////// DECORATOR DEMONSTRATION ///////////////
        
        //bee object is created, and attributes are added to the blank object with our
        //various decorator constructors
        System.out.println("");
        BeeInterface theBee = new Strength(new Speed(new Warrior(new BlankBee())));
        System.out.println("Bee Type: " + theBee.getBeeType());
        System.out.println("Bee Strength: " + theBee.getBeeStrength());
        System.out.println("Bee Speed: " + theBee.getBeeSpeed());
        
        
        
        
        
    }

}
