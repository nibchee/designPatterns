package behavioural.strategy.after2;

public class GoogleMaps {
    private PathCalculationStrategyRegistry pathCalculationStrategyRegistry=new PathCalculationStrategyRegistry();

    public GoogleMaps(PathCalculationStrategyRegistry registry){
        this.pathCalculationStrategyRegistry=registry;
    }

    public void findPath(String from, String to, TransportMode mode){
        PathCalculatorStrategy pathCalculatorStrategy= pathCalculationStrategyRegistry.get(mode);
        pathCalculatorStrategy.calculatePath(from, to);


    }
}
