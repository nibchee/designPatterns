package structural.decorator.icecream;

public class Customer {

    /*
    Other Examples
    Pizza
    Coffee Machine
     */
    public static void main(String[] args) {

        IceCreamCone iceCreamCone = new ChocolateScoop(
                new VanillaScoop(
                        new OrangeCone()
                )
        );

        System.out.println(iceCreamCone.getCost());
        System.out.println(iceCreamCone.getConstituents());

    }
}
