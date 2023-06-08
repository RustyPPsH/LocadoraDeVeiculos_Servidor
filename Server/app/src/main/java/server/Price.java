package server;

/**
 *
 * @author Erick
 * @author Rafael
 */
public interface Price {  
    public double additionalPrice(double price, boolean childSeat, boolean navigation, boolean wiFi, boolean gps, boolean fullTank, boolean tireProtection, boolean windowProtection, boolean headlightProtection, boolean comprehensiveProtection);
}
