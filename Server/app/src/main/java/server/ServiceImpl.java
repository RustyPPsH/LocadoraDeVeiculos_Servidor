package server;

import java.rmi.RemoteException;

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
    public void carInfo(int carID, String carType, String brand, String model, String fuelType, String gearType,
            int modelYear, double price) throws RemoteException {
        switch (carType) {
            case "Economic":
                new EconomicCar(carID, brand, model, fuelType, gearType, modelYear, price);
                break;
            case "Comfort":
                new ComfortCar(carID, brand, model, fuelType, gearType, modelYear, price);
                break;
            case "Luxury":
                new LuxuryCar(carID, brand, model, fuelType, gearType, modelYear, price);
                break;
            default:
                throw new RemoteException("Invalid car type.");
        }
        // Perform the necessary operations with the car information, such as storing it
        // in a database.
    }

    @Override
    public void personInfo(String name, String surname, String nationality, String idNumber, String birthdayDate,
            String licenceDate, String phone, String mail) {
        new Person(name, surname, nationality, idNumber, birthdayDate, licenceDate, phone, mail);
    }

}
