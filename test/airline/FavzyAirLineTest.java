package airline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FavzyAirLineTest {
    private FavzyAir favzyAir;
    @BeforeEach
    void setUp(){
        favzyAir = new FavzyAir();

    }
    @Test
    public void testFavzyAirHasTenSeat(){
        boolean [] seats = favzyAir.getSeats();
        assertEquals(10,seats.length);
    }
    @Test
    public void testThatTheCustomersCanBookedFirstClassTicket() {
        int firstClassTicketBooking = 1;
        favzyAir.bookedTicket(firstClassTicketBooking);
        assertTrue(favzyAir.getSeats()[0]);
       favzyAir.bookedTicket(firstClassTicketBooking);
        assertTrue(favzyAir.getSeats()[1]);

        }
        @Test
        public void testThatCustomerCanBookEconomyClassTicket(){
        int economyClassTicketBookingRequest = 2;
        favzyAir.bookedTicket(economyClassTicketBookingRequest);
        assertTrue(favzyAir.getSeats()[5]);

        }
        @Test
    public void testThatExceptionIsThrownWhenBookingCategoryIsInvalid(){
        int invalidBookingCategory= 0;
        }

        }


