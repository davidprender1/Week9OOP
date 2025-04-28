import ie.atu.week9sem2.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    void testTitleSuccess()
    {
        assertEquals("Mr", myPass.getTitle());
        Passenger myPass2  = new Passenger("Ms", "David", "Prendergast");
        assertEquals("Ms", myPass2.getTitle());
        Passenger myPass3  = new Passenger("Mrs", "David", "Prendergast");
        assertEquals("Mrs", myPass3.getTitle());
    }
    @ParameterizedTest
    @ValueSource(strings = {"Mr","Mrs", "Ms"})
    void testTitleSuccessAlso(String title)
    {
        Passenger myPass4 = new Passenger(title,"David","Prendergast");
    }
    @Test
    void testTitleFail()
    {
        assertThrows(IllegalArgumentException.class,() -> {new Passenger("Dr", "David", "Prendergast");});
        assertThrows(IllegalArgumentException.class,() -> {new Passenger("", "David", "Prendergast");});
    }


}
