package rmiClients;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
public static void main(String[] args) {
    try {


        Registry registry = LocateRegistry.getRegistry("127.0.0.1",9100);
         // Get the reference of exported object from RMI-Registry.
        product2 laptop = (product2)registry.lookup("l");
        product2 mobile = (product2)registry.lookup("m");
        product2 charger = (product2)registry.lookup("c");
        product2 bike = (product2)registry.lookup("b");


        String laptopName = laptop.getName();
        String laptopId = laptop.getId();
        String laptopDescription = laptop.getDescription();
        double price = laptop.getPrice();
        int laptopStock = laptop.getStock();
        System.out.println("Name:" + laptopName);
        System.out.println("Id:" + laptopId);
        System.out.println("Description: " + laptopDescription);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + laptopStock);

        System.out.println(laptop.getName());
        System.out.println(mobile.getName());
        System.out.println(charger.getName());
        System.out.println(bike.getName());
        
    } catch (Exception e) {
        System.out.println("Exception in client side" + e);
        }
    }
}