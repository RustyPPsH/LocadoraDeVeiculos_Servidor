package server;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public abstract class Car implements Price {
    private int carID;
    protected String carType;
    private String brand;
    private String model;
    private String fuelType;
    private String gearType;
    private int modelYear;
    protected double price;
    protected double priceNew;
    private List<GregorianCalendar> rentedDates = new ArrayList<>();
    private List<String> rentedPrice = new ArrayList<>();
    private boolean childSeat;
    private boolean navigationSystem;
    private boolean snowTire;
    private boolean GPS;
    private boolean scooter;
    private boolean tireProtection;
    private boolean windowProtection;
    private boolean headlightProtection;
    private boolean comprehensiveDamagePackage;

    public Car() {
    }

    public Car(int carID, String brand, String model, String fuelType, String gearType, int modelYear, double price) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.gearType = gearType;
        this.modelYear = modelYear;
        this.price = price;
    }

    public int getCarID() {
        return carID;
    }

    public String getCarType() {
        return carType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getGearType() {
        return gearType;
    }

    public int getModelYear() {
        return modelYear;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceNew() {
        return priceNew;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPriceNew(double priceNew) {
        this.priceNew = priceNew;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        if (!rentedDates.isEmpty()) {
            output.append("\n").append(formatDate(rentedDates.get(rentedDates.size() - 2)));
            output.append("\n").append(formatDate(rentedDates.get(rentedDates.size() - 1)));
        }

        return "INFORMACAO DO VEICULO"
                + "\nID=" + carID
                + "\nTipo=" + carType
                + "\nMarca=" + brand
                + "\nModelo=" + model
                + "\nCombustível=" + fuelType
                + "\nMarcha=" + gearType
                + "\nAno Modelo=" + modelYear
                + "\nPreço=" + price
                + output;
    }

    private String formatDate(GregorianCalendar calendar) {
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are indexed starting from 0
        int year = calendar.get(Calendar.YEAR);

        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public abstract double discountedPrice();

    public List<GregorianCalendar> getRentedDates() {
        return rentedDates;
    }
}