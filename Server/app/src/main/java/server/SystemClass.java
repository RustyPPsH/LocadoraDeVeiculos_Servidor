package server;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;

<<<<<<< HEAD
/**
 *
 * @author Erick
 * @author Rafael
 */
=======
>>>>>>> 26e41e167ad1191ef539df19cae62113f4f71945
public class SystemClass {
    private static int id = 7;
    private static List<Person> customers = new ArrayList<>();
    private static List<Car> cars = new ArrayList<>();
    private static List<Car> rentedCars = new ArrayList<>();
    private static List<Person> rentedCustomers = new ArrayList<>();

    public static boolean addPerson(Person person, int licenceYear, int licenceMonth, int licenceDay, int birthdayYear,
            int birthdayMonth, int birthdayDay) {
        boolean isAdded = customers.add(person);
        return isAdded;
    }

    public static boolean removePerson(Person person) {
        boolean isRemoved = customers.remove(person);
        return isRemoved;
    }

    public static boolean addCar(Car car) {
        boolean isAdded = cars.add(car);
        id++;
        return isAdded;
    }

    public static boolean removeCar(Car car) {
        boolean isRemoved = cars.remove(car);
        id--;
        return isRemoved;
    }

    public static boolean addRentedCar(Car car) {
        boolean isAdded = rentedCars.add(car);
        id++;
        return isAdded;
    }

    public static boolean addRentedCustomer(Person person) {
        boolean isAdded = rentedCustomers.add(person);
        id++;
        return isAdded;
    }

    public static int generateId() {
        return id++;
    }

    public static int searchPerson(JComboBox<String> comboBox) {
        String selectedIdNumber = comboBox.getSelectedItem().toString();
        for (int i = 0; i < customers.size(); i++) {
            Person customer = customers.get(i);
            if (customer.getIdNumber().equals(selectedIdNumber)) {
                return i;
            }
        }
        return -1;
    }

    public static int searchCarByBrand(JComboBox<String> comboBox) {
        String selectedCar = comboBox.getSelectedItem().toString();
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            String carString = car.getBrand() + " " + car.getModel() + " (" + car.getModelYear() + ")";
            if (carString.equals(selectedCar)) {
                return i;
            }
        }
        return -1;
    }

    public static int searchCarByID(JComboBox<String> comboBox) {
        String selectedCarId = comboBox.getSelectedItem().toString();
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (String.valueOf(car.getCarID()).equals(selectedCarId)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean cancelReservation(JTextField idField) {
        String customerId = idField.getText();
        for (Person customer : customers) {
            if (customer.getIdNumber().equals(customerId)) {
                customer.clearRentedCars();
                return true;
            }
        }
        return false;
    }

    public static boolean isAvailable(GregorianCalendar pickupDate, int carPosition) {
        Car car = cars.get(carPosition);
        GregorianCalendar returnDate = car.getRentedDates().get(1);
        return pickupDate.compareTo(returnDate) >= 0;
    }

    public static boolean isNumeric(String number) {
        if (number == null) {
            return false;
        }
        try {
            Double.parseDouble(number);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
