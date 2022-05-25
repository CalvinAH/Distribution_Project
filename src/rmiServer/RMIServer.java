package rmiServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer{
    public static void main(String[]args){
        try{

            System.setProperty("java.rmi.server.hostname","127.0.0.1");

            // create product object ..
            ProductsItems p1= new ProductsItems("Laptop","01","lenovo laptop", 1240.5, 0);
            ProductsItems p2= new ProductsItems("Mobile","02","Mi mobile", 240.1, 0);
            ProductsItems p3= new ProductsItems("Power Charger","03","Lenovo charger", 240.1, 0);
            ProductsItems p4= new ProductsItems("MoterBike","04","Yamaha Biker", 38000.24, 0);
            // Export p1,p2,p3- and p4 object using UnicastRemoteObject class
            productsServer stub1 = (productsServer) UnicastRemoteObject.exportObject(p1,0);
            productsServer stub2 = (productsServer) UnicastRemoteObject.exportObject(p2,0);
            productsServer stub3 = (productsServer) UnicastRemoteObject.exportObject(p3,0);
            productsServer stub4 = (productsServer) UnicastRemoteObject.exportObject(p4,0);
            
            // Register the exported class in RMI registry with some name,
            
            Registry registry=LocateRegistry.getRegistry("127.0.0.1",9100);
            registry.bind("1",stub1);
            registry.bind("m",stub2);
            registry.bind("c",stub3);
            registry.bind("1",stub4);
        }catch(Exception e){
            System.out.println("Some server error ..."+e);
        }    
    }
}    