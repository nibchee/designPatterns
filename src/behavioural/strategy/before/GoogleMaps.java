package behavioural.strategy.before;

public class GoogleMaps {

    public void findPath(String from,String to,TransportMode mode){
        if(mode==TransportMode.WALK){
            System.out.println("Finding Path for waliking");
        }else if(mode==TransportMode.CAR){
            System.out.println("Finding Path for Car");
        }else if(mode==TransportMode.BIKE){
            System.out.println("Finding Path for Bike");
        }



    }
}
