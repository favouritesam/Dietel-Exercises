package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarApplicationTest {
    private Car car;

    @BeforeEach
    void setUP(){
        car = new Car();

    }
    @Test
    public void testThatCarHasModel(){
        String model = car.getModel();
    }
@Test
    public void testThatCarHasYear(){
        String year = car.getYear();
}
@Test
    public void testThatCarHasPrice(){
        double price = car.getPrice();

    }
    @Test
    public void testThatCarHasDiscountPrice(){
//        double priceDiscount = car.getpriceDiscount();
    }

}
