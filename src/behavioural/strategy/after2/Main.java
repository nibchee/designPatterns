package behavioural.strategy.after2;

public class Main {
    public static void main(String[] args) {
        PathCalculationStrategyRegistry pathCalculationStrategyRegistry=new PathCalculationStrategyRegistry();
        pathCalculationStrategyRegistry.register(TransportMode.CAR,new CarPathCalculatorStrategy());
        pathCalculationStrategyRegistry.register(TransportMode.BIKE,new BikePathCalculatorStrategy());
        pathCalculationStrategyRegistry.register(TransportMode.WALK,new WalkPathCalculatorStrategy());

        GoogleMaps googleMaps=new GoogleMaps(pathCalculationStrategyRegistry);
    }
}
