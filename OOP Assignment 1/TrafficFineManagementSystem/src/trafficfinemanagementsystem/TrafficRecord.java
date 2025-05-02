/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficfinemanagementsystem;

/**
 *
 * @author Gael
 */

public abstract class TrafficRecord {

    protected DriverViolationInfo info;

    public TrafficRecord(DriverViolationInfo info) {
        this.info = info;
    }

    public abstract void recordViolation();

    public abstract void assessFine();

    public abstract void processPayment();
    
}
