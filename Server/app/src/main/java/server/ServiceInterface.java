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

Boolean loginRequest (String username, String password, int loginMessage) throws RemoteException;

public void carInfo (int carID, final String carType, String brand, String model, String fuelType, String gearType, int modelYear, final double price) throws RemoteException;

public void personInfo (String name, String surname, String nationality, String idNumber, String birthdayDate, String licenceDate, String phone, String mail) throws RemoteException;


    
    


}