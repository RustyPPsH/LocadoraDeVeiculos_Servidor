package server;

public interface Price {
    double additionalPrice(double price, boolean childSeat, boolean navigation, boolean snowTire, boolean GPS,
            boolean scooter, boolean tireProtection, boolean windowProtection, boolean headlightProtection,
            boolean comprehensiveProtection);
}