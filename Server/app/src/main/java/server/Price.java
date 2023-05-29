/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Erick
 * @author Rafael
 */
public interface Price {  
    public double additionalPrice(double price, boolean childSeat, boolean navigation, boolean wiFi, boolean gps, boolean fullTank, boolean tireProtection, boolean windowProtection, boolean headlightProtection, boolean comprehensiveProtection);
}
