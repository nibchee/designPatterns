package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.setName("Nirbhay");
        b1.setColor("White");
        b1.setWeight(12);

        Sparrow sparrow1 = new Sparrow();
        sparrow1.setColor("Blue");
        sparrow1.setLegSize("hey");


        Crow crow1 = new Crow();
        crow1.setSound("Kooooo");
        crow1.setWeight(34);

        List<Bird> birds = List.of(
                sparrow1,
                crow1,
                b1
        );

        List<Bird> children = new ArrayList<>();

        for (Bird parent : birds) {
            children.add(parent.clone());
        }

        Sparrow longLeggedSparrow = new Sparrow();
        longLeggedSparrow.setLegSize("100");

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setSound("kooko");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("sweetSoundCrow", sweetSoundCrow);
        birdRegistry.registerBird("longLeggedSparrow", longLeggedSparrow);

        List<String> getBirdOfTypes = List.of(
                "sweetSoundCrow",
                "longLeggedSparrow",
                "sweetSoundCrow"
        );

        List<Bird> requestedBird = new ArrayList<>();
        for (String type : getBirdOfTypes) {
            requestedBird.add(birdRegistry.getBird(type));
        }
    }
}
