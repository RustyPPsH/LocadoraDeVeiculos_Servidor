package server;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.checkerframework.checker.units.qual.s;

public class ServiceImpl implements ServiceInterface {

    @Override
    public int loginRequest(String username, String password) throws RemoteException {
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login com sucesso");
            return 1; // Login com sucesso
        } else if (username.isEmpty()) {
            return 2; // Usuario vazio
        } else if (password.isEmpty()) {
            return 3; // Senha vazia
        } else {
            return 9; // Usuario ou senha invalidos
        }
    }

    @Override
    public boolean addPerson(Person p) throws RemoteException {

        SystemClass.customers.add(p);
        System.out.println("Person added");
        return true;

    }

    @Override
    public boolean addCar(Car e) throws RemoteException {

        SystemClass.cars.add(e);
        System.out.println("Car" + e + "added");
        return true;
    }

}
