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
    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Sammy");
        bedroom = new Bedroom(2, 101, "double", 10);
        bedroom1 = new Bedroom(4, 202, "family", 15);
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

   @Test
    public void canCheckInToBedroom(){
        hotel.checkInToBedroom(guest, bedroom);
        assertEquals(1, bedroom.getGuestsCheckedIn());
   }

   @Test
    public void canCheckInToConferenceRoom(){
        hotel.checkInToConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getGuestCount());
   }

   @Test
    public void canCheckOutOfBedroom(){
       hotel.checkInToBedroom(guest, bedroom);
       hotel.checkOutOfBedroom(guest, bedroom);
       assertEquals(0, bedroom.getGuestsCheckedIn());
   }

   @Test
    public void canCheckOutOfConferenceRoom(){
       hotel.checkInToConferenceRoom(guest, conferenceRoom);
       hotel.checkOutOfConferenceRoom(guest, conferenceRoom);
       assertEquals(0, conferenceRoom.getGuestCount());

   }

   @Test
    public void canBookRoom(){
        hotel.bookRoom(bedroom, guest, 5);
        assertEquals(1, hotel.bookingCount());
   }


}
