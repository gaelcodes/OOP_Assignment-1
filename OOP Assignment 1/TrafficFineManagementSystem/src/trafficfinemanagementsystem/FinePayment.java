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
public class FinePayment extends TrafficRecord {

    public FinePayment(DriverViolationInfo info) {
        super(info);
    }

    @Override
    public void processPayment() {
        if ("PAID".equalsIgnoreCase(info.getPaymentStatus())) {
            System.out.println("Error: Fine already paid.");
            return;
        }

        info.setPaymentStatus("PAID");
        System.out.println("Payment Successful!");
        System.out.println("Receipt:");
        System.out.println("Driver: " + info.getDriverName());
        System.out.println("Vehicle Plate: " + info.getVehiclePlate());
        System.out.println("Paid Amount: " + info.getFineAmount() + " RWF");
        System.out.println("Payment Status: " + info.getPaymentStatus());
    }

    @Override
    public void recordViolation() {
    }
    
    @Override
    public void assessFine() {
    }
}

