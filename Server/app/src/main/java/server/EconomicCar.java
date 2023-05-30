package server;

public class EconomicCar extends Car {

<<<<<<< HEAD
/**
 *
 * @author Erick
 * @author Rafael
 */
public class EconomicCar extends Car{

    public EconomicCar(int carID, String brand, String model, String fuelType, String gearType, int modelYear, double price) {
=======
    /**
     * @param carID
     * @param brand
     * @param model
     * @param fuelType
     * @param gearType
     * @param modelYear
     * @param price
     */
    public EconomicCar(int carID, String brand, String model, String fuelType, String gearType, int modelYear,
            double price) {
>>>>>>> 26e41e167ad1191ef539df19cae62113f4f71945
        super(carID, brand, model, fuelType, gearType, modelYear, price);
        this.carType = "Economic";
    }

    @Override
    public double discountedPrice() {
        long totalDay = (getRentedDates().get(getRentedDates().size() - 1).getTimeInMillis()
                - getRentedDates().get(getRentedDates().size() - 2).getTimeInMillis()) / (24 * 60 * 60 * 1000);
        if (7 <= totalDay && totalDay < 30) {
            price *= 0.97;
        } else if (totalDay >= 30) {
            price *= 0.92;
        }
        return price;
    }

    @Override
<<<<<<< HEAD
    public double additionalPrice(double price, boolean childSeat, boolean navigation, boolean wiFi, boolean gps, boolean fullTank, boolean tireProtection, boolean windowProtection, boolean headlightProtection, boolean comprehensiveProtection) {
        if(childSeat){
=======
    public double additionalPrice(double price, boolean childSeat, boolean navigation, boolean snowTire, boolean GPS,
            boolean scooter, boolean tireProtection, boolean windowProtection,
            boolean headlightProtection, boolean comprehensiveProtection) {
        if (childSeat) {
>>>>>>> 26e41e167ad1191ef539df19cae62113f4f71945
            price += 30;
        }
        if (navigation) {
            price += 20;
        }
<<<<<<< HEAD
        if(wiFi){
            price += 50;
        }
        if(gps){
            price += 60;
        }
        if(fullTank){
=======
        if (snowTire) {
            price += 50;
        }
        if (GPS) {
            price += 60;
        }
        if (scooter) {
>>>>>>> 26e41e167ad1191ef539df19cae62113f4f71945
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
