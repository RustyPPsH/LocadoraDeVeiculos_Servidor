package server;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class ServiceImpl implements ServiceInterface {

    @Override
    public int loginRequest(String username, String password) throws RemoteException {
        if (username.equals("admin") && password.equals("admin")) {

            System.out.println("Login com sucesso");
            return 1; // Login com sucesso
        } else if (username.isEmpty()) {

            System.out.println("Login Recusado: Usuario vazio");
            return 2; // Usuario vazio
        } else if (password.isEmpty()) {

            System.out.println("Login Recusado: Senha vazia");
            return 3; // Senha vazia
        } else {

            System.out.println("Login Recusado: Usuario ou senha invalidos");
            return 9; // Usuario ou senha invalidos
        }
    }

    @Override
    public boolean addPerson(String name, String surname) throws RemoteException {

        System.out.println("Cliente " + name + " " + surname + " adicionado");
        return true;

    }

    @Override
    public boolean updatePerson(String name, String surname) throws RemoteException {

        System.out.println("Cliente " + name + " " + surname + " atualizado");
        return true;
    }

    @Override
    public boolean removePerson(String name, String surname) throws RemoteException {

        System.out.println("Cliente " + name + " " + surname + " removido");
        return true;
    }

    @Override
    public boolean addCar(String brand, String model) throws RemoteException {

        System.out.println("Carro " + brand + " " + model + " adicionado");
        return true;
    }

    @Override
    public boolean updateCar(String brand, String model) throws RemoteException {

        System.out.println("Carro " + brand + " " + model + " atualizado");
        return true;
    }

    @Override
    public boolean removeCar(String brand, String model) throws RemoteException {

        System.out.println("Carro " + brand + " " + model + " removido");
        return true;
    }

    @Override
    public boolean rentCar (String name, String surname, String brand, String model) throws RemoteException{

        System.out.println("Carro " + brand + " " + model + " alugado por " + name + " " + surname + " com sucesso");
        return true;
    }

    @Override
    public boolean rentCarCancel (String name, String surname, String brand, String model) throws RemoteException{
            
            System.out.println("Carro " + brand + " " + model + " alugado por " + name + " " + surname + " cancelado com sucesso");
            return true;
    }

}
