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
public class DriverViolationInfo {

    private String driverId;
    private String driverName;
    private String vehiclePlate;
    private String violationType;
    private double fineAmount;
    private String paymentStatus = "UNPAID";

    public DriverViolationInfo(String driverId, String driverName, String vehiclePlate, String violationType) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate;
        this.violationType = violationType;
    }

    DriverViolationInfo(int driverId, String name, String plate, String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Getters
    public String getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public String getViolationType() {
        return violationType;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    // Setters
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
