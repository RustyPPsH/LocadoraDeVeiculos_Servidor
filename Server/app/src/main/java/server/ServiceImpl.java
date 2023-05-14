package server;


import java.rmi.RemoteException;
import java.util.ArrayList;

public class ServiceImpl implements ServiceInterface {

    public ServiceImpl() {
    }

    @Override
    public void CarInfo(int carID, String carType, String brand, String model, String fuelType, String gearType, int modelYear, double price) throws RemoteException {
       
    }

    @Override
    public void PersonInfo(String name, String surname, String nationality, String idNumber, String birthdayDate, String licenceDate, String phone, String mail) {
        
    }
    
}
