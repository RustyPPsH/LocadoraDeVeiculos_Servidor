package server;


import java.rmi.RemoteException;
import java.util.ArrayList;

public class ServiceImpl implements ServiceInterface {

    @Override
    public int loginRequest(String username, String password) throws RemoteException {
        if (username.equals("admin") && password.equals("admin")) {
            return 1; // Successful login
        } else if (username.isEmpty()) {
            return 2; // Empty username
        } else if (password.isEmpty()) {
            return 3; // Empty password
        } else {
            return 9; // Invalid username or password
        }
    }

    @Override
    public void CarInfo(int carID, String carType, String brand, String model, String fuelType, String gearType, int modelYear, double price) throws RemoteException {
       
    }

    @Override
    public void PersonInfo(String name, String surname, String nationality, String idNumber, String birthdayDate, String licenceDate, String phone, String mail) {
        
    }
    
}
