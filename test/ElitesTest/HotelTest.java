package ElitesTest;

import elitesHotel.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    Hotel hotel;
    @BeforeEach
    void startAllTestWith(){
        hotel = new Hotel(10);
        assertNotNull(hotel);
    }

    @Test
    void testThatRoomCanBeBooked(){
        assertEquals ("room successfully booked !!!",hotel.bookRoom("favzy"));


    }
    @Test
    void testUserCanCheckOut(){
        hotel.bookRoom("favzy");
        assertTrue(hotel.checkOut(1));

    }
    @Test
    void getAllRoomsTest(){

        assertEquals(10,hotel.getRooms());

    }

    @Test
    void getBookedRoomsTest(){
        assertTrue(hotel.bookedRooms(2));
    }

    @Test
    void getAllAvailableRoomsTest(){
        assertEquals(8,hotel.availableRooms());
    }

    @Test
    void bookedRoomsTest(){
         assertEquals("room successfully booked !!!", hotel.bookRoom("favzy"));
    }
    @Test
    void getRoomGuestTest(){
        hotel.bookRoom("Goodness");
        assertEquals ("Goodness",hotel.roomGuest());

    }
    @Test
    void getAllRoomsGuestTest(){
      hotel.bookRoom("Daniel");
        hotel.bookRoom("ben");
        hotel.bookRoom("ned");
//      assertEquals(3,hotel.allRoomGuest());
        String []names = {"Daniel","ben","ned", null,null,null,null,null,null,null};
        assertArrayEquals(names, hotel.getAllGuest());
//        assertEquals(3,hotel.getOccupiedRoomCount());

    }
}










