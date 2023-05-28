package server;


import java.rmi.RemoteException;
import java.util.ArrayList;

public class ServiceImpl implements ServiceInterface {

    public ServiceImpl() {
    }

    @Override
    public Boolean loginRequest (String username, String password, int loginMessage) throws RemoteException {

        if(username.equals("admin") && password.equals("admin")){
            return true;
        } else if(username.equals("")){
            loginMessage = 1;
            return false;
        } else if(password.equals("")){
            loginMessage = 2;
            return false; 
        } else {
            loginMessage = 3;
            return false;
        }

   
        
    }

    @Override
    public void carInfo(int carID, String carType, String brand, String model, String fuelType, String gearType, int modelYear, double price) throws RemoteException {
       
    }

    @Override
    public void personInfo(String name, String surname, String nationality, String idNumber, String birthdayDate, String licenceDate, String phone, String mail) {
        
    }
    


    
}
