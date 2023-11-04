package behavioural.strategy.after1;

public class PathCalculationStrategyFactory {
    public   PathCalculatorStrategy getPathCalculationStrategyForMode(TransportMode mode){
          if(mode==TransportMode.CAR){
              return  new CarPathCalculatorStrategy();
          }else if(mode ==TransportMode.WALK){
              return new WalkPathCalculatorStrategy();
          }
          else if(mode==TransportMode.BIKE){
              return  new BikePathCalculatorStrategy();
          }

          return null;
    }
}
