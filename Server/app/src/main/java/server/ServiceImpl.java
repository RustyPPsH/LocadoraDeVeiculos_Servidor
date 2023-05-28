package server;


import java.rmi.RemoteException;
import java.util.ArrayList;

public class ServiceImpl implements ServiceInterface {

    public ServiceImpl() {
    }

    @Override
<<<<<<< HEAD
    public boolean loginAccess(String username, String password) {

        if (loginRequest == true){

            //implementar o login aqui
            return true;
        } else {
            return false;
        }

        
    }

    @Override
    public boolean cancelAccess(){
        return true;
    }

    @Override
    public boolean addCarAcess(){
        return true;
    }

    @Override
    public boolean displayCarAccess(){
        return true;
    }   

    @Override
    public boolean addCustomerAccess(){
        return true;
    }   

    @Override
    public boolean displayCustomerAccess(){
        return true;
    }

    @Override
    public boolean rentingExtrasAccess(){
        return true;
    }

    @Override
    public boolean rentingInformationAccess(){
        return true;
=======
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
        
>>>>>>> b00520f495621afd09f2d2e2f0cefde0c954780c
    }
    


    
}
