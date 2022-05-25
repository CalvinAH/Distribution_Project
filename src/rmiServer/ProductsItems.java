package rmiServer;


import java.rmi.RemoteException;

public class ProductsItems implements productsServer{
    // Attributes of product.
    public String name;
    public String id;
    public String description;
    public double price;
    public int stock;
    public ProductsItems(String newName,String newId, String newDescription,double newPrice, int newStock) throws RemoteException{
        this.name=newName;
        this.id=newId;
        this.description = newDescription;
        this.price = newPrice;
        this.stock = newStock;
    }
    public String getName()throws RemoteException{
        return this.name;
    }
    public String getId()throws RemoteException{
        return this.id;
    }
    public String getDescription()throws RemoteException{
        return this.description;
    }
    public double getPrice()throws RemoteException{
        return this.price;
    }
    public int getStock()throws RemoteException{
        return this.stock;
    }
}
