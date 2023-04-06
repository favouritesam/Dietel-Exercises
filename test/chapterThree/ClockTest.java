package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    private  Clock clock;
    @BeforeEach
    void setUp() {
        clock = new Clock(12, 59, 59);
    }

    @Test
        public void testForTheHour(){
            clock.setHour(10);
            assertEquals(10, clock.getHour());
        }
        @Test
    public void testForTheMinute(){
        clock.setMinute(5);
        assertEquals(5,clock.getMinute());
        }
        @Test
    public void testForSecond(){
        clock.setSecond(55);
        assertEquals(55,clock.getSecond());
        }
}