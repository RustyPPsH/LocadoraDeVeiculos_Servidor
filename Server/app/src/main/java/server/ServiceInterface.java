/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceInterface extends Remote {

<<<<<<< HEAD
public int loginRequest (String username, String password) throws RemoteException;

public void CarInfo (int carID, final String carType, String brand, String model, String fuelType, String gearType, int modelYear, final double price) throws RemoteException;
=======
        int loginRequest(String username, String password) throws RemoteException;
>>>>>>> 26e41e167ad1191ef539df19cae62113f4f71945

        void carInfo(int carID, String carType, String brand, String model, String fuelType, String gearType,
                        int modelYear, double price) throws RemoteException;

        void personInfo(String name, String surname, String nationality, String idNumber, String birthdayDate,
                        String licenceDate, String phone, String mail) throws RemoteException;

}
