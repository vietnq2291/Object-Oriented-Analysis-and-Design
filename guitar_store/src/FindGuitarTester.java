public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        // print all guitars
        inventory.getAllGuitars();

        // find guitar for Bin
        Guitar whatBinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        Guitar guitar = inventory.search(whatBinLikes);

        if (guitar != null) {
            System.out.println("Bin, you migh like this: " + guitar);
        } else {
            System.out.println("Sorry Bin, we have nothing for you!");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("gui001", 200, Builder.ANY, "Amazingly", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
        inventory.addGuitar("gui002", 200, Builder.PRS, "Martin", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ALDER);
        inventory.addGuitar("gui003", 200, Builder.COLLINGS, "Super", Type.ELECTRIC, Wood.COCOBOLO, Wood.CEDAR);
        inventory.addGuitar("gui004", 200, Builder.ANY, "Bruh", Type.ELECTRIC, Wood.SITKA, Wood.ADIRONDACK);
        inventory.addGuitar("gui005", 200, Builder.COLLINGS, "Analog", Type.ELECTRIC, Wood.ALDER, Wood.CEDAR);
        inventory.addGuitar("gui999", 123, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("gui006", 200, Builder.OLSON, "Deep", Type.ACOUSTIC, Wood.SITKA, Wood.ADIRONDACK);
        inventory.addGuitar("gui007", 200, Builder.RYAN, "Taylor", Type.ACOUSTIC, Wood.COCOBOLO, Wood.MAHOGANY);

    }

}
