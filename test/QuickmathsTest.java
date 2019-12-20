import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {


    //Her er der testet om sum og gennemsnit metoderne fungere ordentligt, hvilket de gør
    @Test
    public void testSum() {
        Quickmaths q = new Quickmaths();
        assertEquals(2, q.sum(1, 1));
        assertEquals(4, q.sum(2, 2));
        assertEquals(4, q.sum(1, 3));
    }

    @Test
    public void testGennemsnit() {
        Quickmaths q = new Quickmaths();
        assertEquals(2, q.gennemsnit(2, 2));
        assertEquals(2, q.gennemsnit(3,1));
        assertEquals(3, q.gennemsnit(5,1));
    }

}