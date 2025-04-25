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
public class ViolationEntry extends TrafficRecord {

    public ViolationEntry(DriverViolationInfo info) {
        super(info);
    }

    @Override
    public void recordViolation() {
        String type = info.getViolationType().toUpperCase();
        if (type.equals("SPEEDING") || type.equals("RED_LIGHT") || type.equals("NO_HELMET") || type.equals("DUI")) {
            info.setPaymentStatus("UNPAID");
            System.out.println("Violation Recorded:");
            System.out.println("Driver: " + info.getDriverName() + ", Plate: " + info.getVehiclePlate());
            System.out.println("Violation: " + info.getViolationType() + ", Status: " + info.getPaymentStatus());
        } else {
            System.out.println("Invalid violation type.");
        }
    }

    @Override
    public void assessFine() {
    }
    
    @Override
    public void processPayment() {
    }
}

