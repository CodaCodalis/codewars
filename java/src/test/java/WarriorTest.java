package src.test.java;

import org.junit.jupiter.api.Test;
import src.main.java.Warrior;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void level() {
        Warrior tom = new Warrior();
        assertEquals(1, tom.level());
        assertEquals(100, tom.experience());
        assertEquals("Pushover", tom.rank());
    }

    @Test
    void experience() {
    }

    @Test
    void rank() {
    }

    /*
    @Test
    public void testWarrior() {
        Warrior tom = new Warrior();
        assertEquals(1,          tom.level());
        assertEquals(100,        tom.experience());
        assertEquals("Pushover", tom.rank());
    }
    */
}