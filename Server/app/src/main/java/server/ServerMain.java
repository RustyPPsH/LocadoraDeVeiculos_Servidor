package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class ServerMain extends ServiceImpl{

    public static void main(String args[]) {
        try {
            
            String serviceName = "Yakuza Locadora de Veiculos";
            ServiceInterface rentalServer = new ServiceImpl();
            ServiceInterface stub = (ServiceInterface) UnicastRemoteObject.exportObject(rentalServer, 0);
            Registry registry = LocateRegistry.getRegistry();             
            registry.bind(serviceName, rentalServer);
            System.out.println("Servidor no ar. Nome do objeto no servidor: \'" + serviceName + "\'");
        } catch (RemoteException re) {
            System.out.println("Excecao: " + re.getMessage());
        } catch (AlreadyBoundException abe) {
            System.out.println("Excecao: " + abe.getMessage());
        }

    }
}