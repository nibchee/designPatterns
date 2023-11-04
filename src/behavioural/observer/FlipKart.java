package behavioural.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlipKart {
   static private Map<Events,List<Subscriber>> subscribers=new HashMap<>();
    public static void registerSubscriber(Events events,Subscriber subscriber){
        if(!subscribers.containsKey(events)){
            subscribers.put(events,new ArrayList<>());
        }
        subscribers.get(events).add(subscriber);

    }

    public static void unRegisterSubscriber(Events events,Subscriber subscriber){

        subscribers.get(events).remove(subscriber);

    }

    public  void  notify(Events events,Order order){
        for(Subscriber subscriber:subscribers.get(events)){
            subscriber.listen(order);
        }
    }

    public void placeOrder(Order order){
        this.notify(Events.ORDER_PLACED,order);
    }
}
