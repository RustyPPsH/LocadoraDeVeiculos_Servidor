package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerMain {

    public static void main(String[] args) {
        try {
            String serviceName = "Yakuza Locadora de Veiculos";
            ServiceInterface rentalServer = new ServiceImpl();
            ServiceInterface stub = (ServiceInterface) UnicastRemoteObject.exportObject(rentalServer, 0);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind(serviceName, stub);
            System.out.println("Server is running. Object name in the server: '" + serviceName + "'");
        } catch (RemoteException re) {
            System.out.println("RemoteException: " + re.getMessage());
            re.printStackTrace();
        } catch (AlreadyBoundException abe) {
            System.out.println("AlreadyBoundException: " + abe.getMessage());
            abe.printStackTrace();
        }
    }
}
