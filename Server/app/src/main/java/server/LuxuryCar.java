package server;

public class LuxuryCar extends Car {
    public LuxuryCar(int carID, String brand, String model, String fuelType, String gearType, int modelYear,
            double price) {
        super(carID, brand, model, fuelType, gearType, modelYear, price);
        this.carType = "Luxury";
    }

    @Override
    public double discountedPrice() {
        long totalDay = (getRentedDates().get(getRentedDates().size() - 1).getTimeInMillis()
                - getRentedDates().get(getRentedDates().size() - 2).getTimeInMillis()) / (24 * 60 * 60 * 1000);
        if (7 <= totalDay && totalDay < 30) {
            price *= 0.95;
        } else if (totalDay >= 30) {
            price *= 0.90;
        }
        return price;
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