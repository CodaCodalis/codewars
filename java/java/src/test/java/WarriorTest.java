import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class WarriorTest {
    @Test
    void levelTest() {
        Warrior tom = new Warrior();
        assertEquals(1, tom.level());
        assertEquals(100, tom.experience());
        assertEquals("Pushover", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 900, 1));
        assertEquals("Novice", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 1000, 2));
        assertEquals("Fighter", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 1000, 3));
        assertEquals("Warrior", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 1000, 4));
        assertEquals("Veteran", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 1000, 5));
        assertEquals("Sage", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 1000, 6));
        assertEquals("Elite", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 1000, 7));
        assertEquals("Conqueror", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 1000, 8));
        assertEquals("Champion", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 1000, 9));
        assertEquals("Master", tom.rank());
        assertEquals("Defeated Chuck Norris", tom.training("Defeated Chuck Norris", 1000, 10));
        assertEquals("Greatest", tom.rank());
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
        assertEquals(3, bruce_lee.getRankInt(29));
        assertEquals(4, bruce_lee.getRankInt(39));
        assertEquals(5, bruce_lee.getRankInt(49));
        assertEquals(6, bruce_lee.getRankInt(59));
        assertEquals(7, bruce_lee.getRankInt(69));
        assertEquals(8, bruce_lee.getRankInt(79));
        assertEquals(9, bruce_lee.getRankInt(89));
        assertEquals(10, bruce_lee.getRankInt(99));
        assertEquals(11, bruce_lee.getRankInt(100));
    }

    @Test
    void defeatTest() {
        Warrior jackie_chan = new Warrior();

        assertEquals(1, jackie_chan.level());
        assertEquals(100, jackie_chan.experience());
        assertEquals("Pushover", jackie_chan.rank());
        assertEquals(new ArrayList<String>(), jackie_chan.achievements());
        assertEquals("Not strong enough", jackie_chan.training("Defeated Bruce Lee", 269, 6));
        assertEquals(100, jackie_chan.experience());
        assertEquals(1, jackie_chan.level());
        assertEquals("Pushover", jackie_chan.rank());
        assertEquals("Defeated Bruce Lee", jackie_chan.training("Defeated Bruce Lee", 790, 1));
        assertEquals(890, jackie_chan.experience());
        assertEquals(8, jackie_chan.level());
        assertEquals("Pushover", jackie_chan.rank());
        assertEquals("You've been defeated", jackie_chan.battle(19));
        assertEquals("An intense fight", jackie_chan.battle(9));
        assertEquals("An intense fight", jackie_chan.battle(13));
        assertEquals("A good fight", jackie_chan.battle(12));
        assertEquals("Easy fight", jackie_chan.battle(10));
        assertEquals("Invalid level", jackie_chan.battle(110));
        assertEquals("Defeated Bruce Lee", jackie_chan.training("Defeated Bruce Lee", 11000, 1));
    }
}
