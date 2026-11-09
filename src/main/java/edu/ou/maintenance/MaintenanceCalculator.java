package edu.ou.maintenance;

public class MaintenanceCalculator {
    public double calculate(String type, int mileage) {
        if (type == null || mileage < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (type.equals("GAS")) {
            return 80 + mileage * 0.025;
        }
        if (type.equals("EV")) {
            return 50 + mileage * 0.01;
        }
        throw new IllegalArgumentException("Unknown type");
    }
}
