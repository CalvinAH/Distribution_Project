package rmiClients;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface product2 extends Remote {

    public String getName()throws RemoteException;
    public String getId()throws RemoteException;
    public String getDescription()throws RemoteException;
    public double getPrice()throws RemoteException;
    public int getStock()throws RemoteException;
}