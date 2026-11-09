package edu.ou.maintenance;

public class Main {
    public static void main(String[] args) {
        MaintenanceCalculator calculator = new MaintenanceCalculator();
        double cost = calculator.calculate("GAS", 1000);
        System.out.println("Maintenance cost: $" + cost);
    }
}
