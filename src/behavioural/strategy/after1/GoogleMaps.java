package behavioural.strategy.after1;

public class GoogleMaps {

    public void findPath(String from, String to, TransportMode mode){
        PathCalculatorStrategy pathCalculatorStrategy=new PathCalculationStrategyFactory().getPathCalculationStrategyForMode(mode);
        pathCalculatorStrategy.calculatePath(from, to);


    }
}
