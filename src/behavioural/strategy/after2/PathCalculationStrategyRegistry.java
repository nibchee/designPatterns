package behavioural.strategy.after2;

import behavioural.strategy.after2.PathCalculatorStrategy;
import behavioural.strategy.after2.TransportMode;

import java.util.Map;

public class PathCalculationStrategyRegistry {
    private Map<TransportMode, PathCalculatorStrategy> strategies;
    public void register(TransportMode mode, PathCalculatorStrategy strategy){
           strategies.put(mode,strategy);
    }

    public PathCalculatorStrategy get(TransportMode mode){
        return strategies.get(mode);
    }
}
