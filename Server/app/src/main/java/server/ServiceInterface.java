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
    
    public boolean addPerson (String name, String surname) throws RemoteException;

    public boolean updatePerson (String name, String surname) throws RemoteException;

    public boolean removePerson(String name, String surname) throws RemoteException;
    
    public boolean addCar (String brand, String model) throws RemoteException;

    public boolean updateCar (String name, String surname) throws RemoteException;

    public boolean removeCar (String brand, String model) throws RemoteException;

    public boolean rentCar (String name, String surname, String brand, String model) throws RemoteException;

    public boolean rentCarCancel (String name, String surname, String brand, String model) throws RemoteException;

}