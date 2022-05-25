package LabStore;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface PartFacade extends Remote {
    CoustmersItems findItems (CoustmersItems b) throws RemoteException;

    List<CoustmersItems> getAllItems() throws RemoteException;
}
