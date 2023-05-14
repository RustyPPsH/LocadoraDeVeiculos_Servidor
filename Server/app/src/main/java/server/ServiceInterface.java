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

public void CarInfo (int carID, final String carType, String brand, String model, String fuelType, String gearType, int modelYear, final double price) throws RemoteException;

public void PersonInfo (String name, String surname, String nationality, String idNumber, String birthdayDate, String licenceDate, String phone, String mail) throws RemoteException;


    
    


}