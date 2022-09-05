import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class WarriorTest {
    @Test
    void tomTest() {
        Warrior tom = new Warrior();
        assertEquals(1, tom.level());
        assertEquals(100, tom.experience());
        assertEquals("Pushover", tom.rank());
    }

    @Test
    void bruce_leeTest() {
        Warrior bruce_lee = new Warrior();

        assertEquals(1, bruce_lee.level());
        assertEquals(100, bruce_lee.experience());
        assertEquals("Pushover", bruce_lee.rank());
        assertEquals(new ArrayList<String>(), bruce_lee.achievements());
        assertEquals("Defeated Chuck Norris", bruce_lee.training("Defeated Chuck Norris", 9000, 1));
        assertEquals(9100, bruce_lee.experience());
        assertEquals(91, bruce_lee.level());
        assertEquals("Master", bruce_lee.rank());
        assertEquals("A good fight", bruce_lee.battle(90));
        assertEquals(9105, bruce_lee.experience());
        assertEquals(Arrays.asList("Defeated Chuck Norris"), bruce_lee.achievements());
    }
}