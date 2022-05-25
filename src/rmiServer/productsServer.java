package rmiServer;


import java.rmi.Remote;
import java.rmi.RemoteException;
public interface productsServer extends Remote{
    // Lets us define API ..
    public String getName()throws RemoteException;
    public String getId()throws RemoteException;
    public String getDescription()throws RemoteException;
    public double getPrice()throws RemoteException;
    public int getStock()throws RemoteException;
}