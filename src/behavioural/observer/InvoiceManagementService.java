package behavioural.observer;

public class InvoiceManagementService implements Subscriber{

    InvoiceManagementService(){
       FlipKart.registerSubscriber(Events.ORDER_PLACED,this);
    }

    public void listen(Order order){
     generateInvoice(order);
    }

    public void generateInvoice(Order order){
        System.out.println("Generating Invoice for Order"+order.toString());
    }
}
