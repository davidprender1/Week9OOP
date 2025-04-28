import ie.atu.week9sem2.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPassenger {
    Passenger myPass;
    @BeforeEach
    void setup()
    {
        myPass = new Passenger("Mr", "David", "Prendergast");
    }
    @Test
    void ConstructorSuccess()
    {
        assertEquals("Mr", myPass.getTitle());
        assertEquals("David", myPass.getFirstName());
        assertEquals("Prendergast", myPass.getLastName());
    }
    @Test
    void testTitle()
    {
        assertThrows(IllegalArgumentException.class,() -> {new Passenger("Dr", "David", "Prendergast");});
    }


}
