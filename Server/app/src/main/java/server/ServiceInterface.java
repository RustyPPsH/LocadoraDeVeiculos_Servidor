/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceInterface extends Remote {

        int loginRequest(String username, String password) throws RemoteException;

        void carInfo(int carID, String carType, String brand, String model, String fuelType, String gearType,
                        int modelYear, double price) throws RemoteException;

        void personInfo(String name, String surname, String nationality, String idNumber, String birthdayDate,
                        String licenceDate, String phone, String mail) throws RemoteException;

}
