package structural.decorator.icecream;

public class OrangeCone implements IceCreamCone {
    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getConstituents() {
        return "Orange Cone";
    }
}
