/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficfinemanagementsystem;

import java.util.Scanner;

/**
 *
 * @author Gael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        DriverViolationInfo info = null;

        while (true) {

            System.out.println("\n=== Traffic Fine Management System ===");
            System.out.println("1. Record Violation");
            System.out.println("2. Assess Fine");
            System.out.println("3. Process Payment");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter Driver ID (16 digits): ");
                    int driverId;
                    while (true) {
                        System.out.print("Enter an integer (must be greater than or equal to 0): ");
                        if (scanner.hasNextInt()) {
                            driverId = scanner.nextInt();
                            if (driverId >= 0 && driverId <= 16) {
                                break;
                            } else {
                                System.out.println("Invalid input! Integer must be greater than or equal to 0. Please try again.");
                            }
                        } else {
                            System.out.println("Invalid input! Please enter a valid integer.");
                            scanner.next(); // Clear invalid input
                        }
                    }

                    System.out.println("Enter Driver Name: ");
                    String name = "";
                    while (true) {
                        System.out.print("Enter a string (no numbers or special characters): ");
                        name = scanner.nextLine();
                        if (name.matches("[a-zA-Z\\s]+")) {
                            break;
                        } else {
                            System.out.println("Invalid input! String cannot contain numbers or special characters. Please try again.");
                        }
                    }


                    System.out.println("Enter Vehicle Plate (e.g., RAB123D): ");

                    String plate = scanner.nextLine();
                    if (!plate.matches("[A-Z]{3}\\d{3}[A-Z]")) {
                        System.out.println("Invalid plate format.");
                        break;
                    }

                    System.out.println("Enter Violation Type: ");
                    String type = "";

                    while (true) {
                        System.out.print("Enter a string (no numbers or special characters): ");
                        type = scanner.nextLine();
                        if (type.matches("[a-zA-Z\\s]+")) {
                            break;
                        } else {
                            System.out.println("Invalid input! String cannot contain numbers or special characters. Please try again.");
                        }
                    }

                    info = new DriverViolationInfo(driverId, name, plate, type);
                    new ViolationEntry(info).recordViolation();
                    break;

                case 2:
                    if (info == null) {
                        System.out.println("Please record a violation first.");
                        break;
                    }
                    new FineAssessment(info).assessFine();
                    break;

                case 3:
                    if (info == null || info.getFineAmount() == 0) {
                        System.out.println("Please assess the fine before paying.");
                        break;
                    }
                    new FinePayment(info).processPayment();
                    break;

                case 4:
                    System.out.println("Exiting the system..., Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.Try again!!!!!");
            }
        }
    }

}
