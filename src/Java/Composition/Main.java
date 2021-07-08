/*

        2 Examples of Composition in OOP

 */

package Java.Composition;

public class Main {

    public static void main(String[] args) {

        /*
            OOP Composition - PC Example
            Classes: Case, Dimensions, Monitor, Motherboard, PC, Resolution
            Code for testing in commented section below.
         */

        /*
        Dimensions dimensions = new Dimensions(60, 60, 12);
        Case theCase = new Case("P8", "Thermaltake", "1050w",dimensions);

        Monitor theMonitor = new Monitor("OptiMax27C", "MSI",
                27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("Z490MegAce", "MSI",
                4,3, "Dragon 1.12");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();
         */


        /*
            OOP Composition - Bedroom Example
            Classes: Wall, Ceiling, Bed, Lamp
            Code for testing in commented section below.
         */

        /*
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 5, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Ryan's Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
         */

    }
}
