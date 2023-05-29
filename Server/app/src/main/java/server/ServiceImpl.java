package server;


import java.rmi.RemoteException;
import java.util.ArrayList;

public class ServiceImpl implements ServiceInterface {

    @Override
    public int loginRequest (String username, String password) throws RemoteException {

        if(username.equals("admin") && password.equals("admin")){
            return 1;
        } else if(username.equals("")){
            return 2;
        } else if(password.equals("")){;
            return 3; 
        } else {
            return 9;
        }

   
        
    }

    @Override
    public void carInfo(int carID, String carType, String brand, String model, String fuelType, String gearType, int modelYear, double price) throws RemoteException {
       
    }

    @Override
    public void personInfo(String name, String surname, String nationality, String idNumber, String birthdayDate, String licenceDate, String phone, String mail) {
        
    }
    
}
