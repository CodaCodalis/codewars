import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ranges.RangeException;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void negActRankNegRank() {
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
    @Test
    void posActRankNegRank() {
        User peter = new User();

        assertEquals(-8, peter.rank);
        assertEquals(0, peter.progress);
        assertEquals(10, peter.incProgress(1));
        assertEquals(1, peter.rank);
        assertEquals(10, peter.progress);
    }
    @Test
    void posActRankPosRank() {
        User peter = new User();

        assertEquals(-8, peter.rank);
        assertEquals(0, peter.progress);
        assertEquals(10, peter.incProgress(1));
        assertEquals(1, peter.rank);
        assertEquals(10, peter.progress);
        assertEquals(0, peter.incProgress(4));
        assertEquals(2, peter.rank);
        assertEquals(0, peter.progress);
    }
    @Test
    void negActRankNegRankNarrow() {
        User peter = new User();

        assertEquals(-8, peter.rank);
        assertEquals(0, peter.progress);
        assertEquals(3, peter.incProgress(-8));
        assertEquals(-8, peter.rank);
        assertEquals(3, peter.progress);
        assertEquals(63, peter.incProgress(-4));
        assertEquals(-7, peter.rank);
        assertEquals(63, peter.progress);
        assertEquals(64, peter.incProgress(-8));
        assertEquals(-7, peter.rank);
        assertEquals(64, peter.progress);
    }

    @Test
    void negActRankNegRankEdge() {
        User peter = new User();

        assertEquals(-8, peter.rank);
        assertEquals(0, peter.progress);
        assertEquals(3, peter.incProgress(-8));
        assertEquals(-8, peter.rank);
        assertEquals(3, peter.progress);
        assertEquals(13, peter.incProgress(1));
        assertEquals(1, peter.rank);
        assertEquals(13, peter.progress);
        assertEquals(13, peter.incProgress(-8));
        assertEquals(1, peter.rank);
        assertEquals(13, peter.progress);
        RangeException thrown = Assertions.assertThrows(RangeException.class, () -> {
            peter.incProgress(-9);
        });
        Assertions.assertEquals("out of range", thrown.getMessage());
    }

     @Test
    void nobodyKnowsTheTroubleIveSeen(){
        User peter = new User();
         assertEquals(-8, peter.rank);
         assertEquals(0, peter.progress);
         assertEquals(90, peter.incProgress(-1));
         assertEquals(-4, peter.rank);
         assertEquals(90, peter.progress);
         assertEquals(93, peter.incProgress(-4));
         assertEquals(96, peter.incProgress(-4));
         assertEquals(99, peter.incProgress(-4));
         assertEquals(2, peter.incProgress(-4));
         assertEquals(-3, peter.rank);
         assertEquals(2, peter.progress);
         assertEquals(62, peter.incProgress(1));
         assertEquals(-2, peter.rank);
         assertEquals(62, peter.progress);
     }
}