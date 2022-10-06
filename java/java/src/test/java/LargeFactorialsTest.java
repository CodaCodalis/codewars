import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargeFactorialsTest {
    @Test
    public void BasicTests()
    {
        assertEquals("1", LargeFactorials.fact(1));
        assertEquals("120", LargeFactorials.fact(5));
        assertEquals("362880", LargeFactorials.fact(9));
        assertEquals("1307674368000", LargeFactorials.fact(15));
    }

}