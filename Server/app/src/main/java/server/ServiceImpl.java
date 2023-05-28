package server;


import java.rmi.RemoteException;
import java.util.ArrayList;

public class ServiceImpl implements ServiceInterface {

    public ServiceImpl() {
    }

    @Override
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
    }
    


    
}
