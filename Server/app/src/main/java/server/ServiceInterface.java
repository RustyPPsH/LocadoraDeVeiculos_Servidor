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

public boolean loginAccess (String username, String password) throws RemoteException;

public boolean cancelAccess () throws RemoteException;

public boolean addCarAcess () throws RemoteException;

public boolean displayCarAccess () throws RemoteException;

public boolean addCustomerAccess () throws RemoteException;

public boolean displayCustomerAccess () throws RemoteException;

public boolean rentingExtrasAccess () throws RemoteException;

public boolean rentingInformationAccess () throws RemoteException;

}