package structural.decorator.icecream;

public class BlueCone implements IceCreamCone {

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getConstituents() {
        return "Blue Cone";
    }
}
