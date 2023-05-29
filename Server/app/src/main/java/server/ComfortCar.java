package server;

public class ComfortCar extends Car {

    public ComfortCar(int carID, String brand, String model, String fuelType, String gearType, int modelYear,
            double price) {
        super(carID, brand, model, fuelType, gearType, modelYear, price);
        this.carType = "Comfort";
    }

    @Override
    public double discountedPrice() {
        priceNew = price;
        long totalDay = (getRentedDates().get(getRentedDates().size() - 1).getTimeInMillis()
                - getRentedDates().get(getRentedDates().size() - 2).getTimeInMillis()) / (24 * 60 * 60 * 1000);
        if (7 <= totalDay && totalDay < 30) {
            priceNew *= 0.96;
        } else if (totalDay >= 30) {
            priceNew *= 0.91;
        }
        return priceNew;
    }

    @Override
    public double additionalPrice(double price, boolean childSeat, boolean navigation, boolean snowTire, boolean GPS,
            boolean scooter, boolean tireProtection, boolean windowProtection,
            boolean headlightProtection, boolean comprehensiveProtection) {
        if (childSeat) {
            price += 30;
        }
        if (navigation) {
            price += 20;
        }
        if (snowTire) {
            price += 50;
        }
        if (GPS) {
            price += 60;
        }
        if (scooter) {
            price += 15;
        }
        if (tireProtection) {
            price += 20;
        }
        if (windowProtection) {
            price += 25;
        }
        if (headlightProtection) {
            price += 15;
        }
        if (comprehensiveProtection) {
            price += 50;
        }
        return price;
    }

}