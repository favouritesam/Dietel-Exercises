package femiWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedArrayNumberTest {
    ReversedArrayNumber reversedArrayNumber;

    @BeforeEach
    void startAllTestWith(){
        reversedArrayNumber = new ReversedArrayNumber();
        assertNotNull(reversedArrayNumber);
    }
    @Test
    public void testThatYourNumberCanReverse(){
        int[] number = {2,3,4,5};
        int[] count = {5,4,3,2,};
        assertArrayEquals(count,ReversedArrayNumber.reversedArray(number));
    }
}