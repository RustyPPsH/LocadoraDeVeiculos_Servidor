/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author RafaelSonoki
 */
    public interface ServiceInterface extends Remote {

    public int loginRequest (String username, String password) throws RemoteException;
    
    public boolean addPerson (Person p) throws RemoteException;
    
    public boolean addEconomicCar (Object economicCar) throws RemoteException;

    public boolean addLuxuryCar (Object luxuryCar) throws RemoteException;

    public boolean addComfortCar (Object ComfortCar) throws RemoteException;
    
    


}