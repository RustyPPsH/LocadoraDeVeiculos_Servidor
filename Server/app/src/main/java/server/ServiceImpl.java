package server;

import java.rmi.RemoteException;

public class ServiceImpl implements ServiceInterface {

@Override
    public int loginRequest(String username, String password) throws RemoteException {
        if (username.equals("admin") && password.equals("admin")) {
                Person rafaelSonoki = new Person("Rafael", "Sonoki", "T.C.", "25474284635", "05/07/1995", "24/03/2017", "48984252659", "rafaelsonoki@hotmail.com");
                Person erickVieira = new Person("Erick", "Vieira", "T.C", "00849341906", "13/03/1994", "18/03/2020", "48999101832", "erickvieira@outlook.com");
                Person guilhermeMenegotto = new Person("Guilherme", "Menegotto", "T.C.", "14865923547", "19/07/2000", "04/12/2018", "5456317589", "guimenegotoo@outlook.com");

                SystemClass.customers.add(rafaelSonoki);
                SystemClass.customers.add(erickVieira);
                SystemClass.customers.add(guilhermeMenegotto);

                EconomicCar renaultSymbol = new EconomicCar(1, "Renault", "Symbol", "Gasoline", "Manuel", 2017, 137);
                EconomicCar hyundaiHB20 = new EconomicCar(2, "Hyundai", "HB20", "Gasoline", "Automatic", 2018, 140);
                ComfortCar toyotaCorolla = new ComfortCar(3, "Toyota", "Corolla", "Fuel", "Automatic", 2018, 190);
                ComfortCar nissanVersa = new ComfortCar(4, "Nissan", "Versa", "Gasoline", "Automatic", 2019, 240);
                LuxuryCar audiA3 = new LuxuryCar(5, "Audi", "A3", "Gasoline", "Automatic", 2019, 392.48);
                LuxuryCar mercedesC200d = new LuxuryCar(6, "Mercedes-Benz", "C 200 d", "Fuel", "Automatic", 2020, 597.70);

                SystemClass.cars.add(renaultSymbol);
                SystemClass.cars.add(hyundaiHB20);
                SystemClass.cars.add(toyotaCorolla);
                SystemClass.cars.add(nissanVersa);
                SystemClass.cars.add(audiA3);
                SystemClass.cars.add(mercedesC200d);
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
    public boolean addPerson (Person p)throws RemoteException{


        SystemClass.customers.add(p);


        return true;
    }

    @Override
    public boolean addEconomicCar (EconomicCar economicCar) throws RemoteException {

        SystemClass.cars.add(new EconomicCar(economicCar.getCarID(), economicCar.getBrand(), economicCar.getModel(), economicCar.getFuelType(), economicCar.getGearType(), economicCar.getModelYear(), economicCar.getPrice()));


        return true;
    }

    @Override
    public boolean addComfortCar (ComfortCar comfortCar) throws RemoteException {

        SystemClass.cars.add(new ComfortCar(comfortCar.getCarID(), comfortCar.getBrand(), comfortCar.getModel(), comfortCar.getFuelType(), comfortCar.getGearType(), comfortCar.getModelYear(), comfortCar.getPrice()));



        return true;
    }

    @Override
    public boolean addLuxuryCar (LuxuryCar luxuryCar) throws RemoteException {

        SystemClass.cars.add(new LuxuryCar(luxuryCar.getCarID(), luxuryCar.getBrand(), luxuryCar.getModel(), luxuryCar.getFuelType(), luxuryCar.getGearType(), luxuryCar.getModelYear(), luxuryCar.getPrice()));


        return true;
    }


}