package edu.ou.maintenance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaintenanceCalculatorTest {
    private final MaintenanceCalculator calculator = new MaintenanceCalculator();

    @Test
    void gasolineCost() {
        assertEquals(100.0, calculator.calculate("GAS", 1000), 0.0001);
    }

    @Test
    void electricCost() {
        assertEquals(60.0, calculator.calculate("EV", 1000), 0.0001);
    }

    @Test
    void negativeMileageRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculate("GAS", -100));
    }

    @Test
    void unknownTypeRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculate("DIESEL", 1000));
    }
}
