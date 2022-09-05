import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void incProgress() {
        User pete = new User();

        assertEquals(-8, pete.rank);
        assertEquals(0, pete.progress);
        assertEquals(10, pete.incProgress(-7));
        assertEquals(-8, pete.rank);
        assertEquals(10, pete.progress);
        assertEquals(0, pete.incProgress(-5));
        assertEquals(-7, pete.rank);
        assertEquals(0, pete.progress);
    }
}