import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public void getAllGuitars() {
        for (Guitar guitar : guitars) {
            System.out.println(guitar);
        }
    }

    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            if (guitar.getBuilder() != searchGuitar.getBuilder())
                continue;
            String searchModel = searchGuitar.getModel().toLowerCase();
            if (searchModel != null && (!searchModel.equals("") &&
                    (!searchModel.equals(guitar.getModel().toLowerCase()))))
                continue;
            if (guitar.getType() != searchGuitar.getType())
                continue;
            if (guitar.getBackWood() != searchGuitar.getBackWood())
                continue;
            if (guitar.getTopWood() != searchGuitar.getTopWood())
                continue;
            return guitar;
        }
        return null;
    }

}
