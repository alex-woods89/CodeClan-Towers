import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom;
    private ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 101, "double");
        bedroom1 = new Bedroom(4, 202, "family");
        conferenceRoom = new ConferenceRoom(5, "Mint Suite");
        conferenceRoom1 = new ConferenceRoom(8, "Succulent Suite");
        hotel = new Hotel("CodeClan Towers");
    }

    @Test
    public void canGetName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void canCountBedrooms(){
        assertEquals(0, hotel.bedroomCount());
    }

   @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.bedroomCount());
   }

   @Test
   public void canCountConferenceRooms(){
        assertEquals(0, hotel.conferenceRoomCount());
   }

   @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
   }

   

}
