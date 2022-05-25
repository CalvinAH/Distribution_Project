package Login;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginServer extends UnicastRemoteObject implements loginFacade{

    private TreeMap Admin = new TreeMap<String,String>();
    
    public LoginServer() throws RemoteException{
        super();
    }
    
    
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            LoginServer obj = new LoginServer();
            
            reg.rebind("rmi://localhost/service", obj);
            
            System.out.println("Server Running...");
        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String login(String username, String password) throws RemoteException {
        init();
        
        String response = search(username, password);
        
        return response;
    }
    
    
    private String search(String username , String password){
        String response = "";
        
        Set set = Admin.entrySet();
        Iterator itr = set.iterator();
        boolean flag = false;
        
        while(itr.hasNext()){
            response = "";
            Map.Entry entry = (Map.Entry) itr.next();
            String user = entry.getKey().toString();
            String pass = entry.getValue().toString();
            
            if(username.equals(user)){
                flag = true;
                if(password.equals(pass)){
                    response = "LOGIN_SUCCESFUL";
                }else{
                    response = "PASSWORD_INCORRECT";
                }                
                break;
            }           
        }
        if(! flag){
            response = "USER_NOT_EXISTS";
        }
        
        return response;
    }
    
    private void init(){
        Admin.put("user1", "1234");
        Admin.put("user2", "1234");
    }
    
}