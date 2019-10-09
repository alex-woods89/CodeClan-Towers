import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(5, "Mint Suite");
        guest = new Guest("Sammy",75);
        guest1 = new Guest("Marcellus", 200);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetName(){
        assertEquals("Mint Suite", conferenceRoom.getName());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void cantAddGuestsOverCapacity(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(5, conferenceRoom.getGuestCount());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest1);
        conferenceRoom.removeGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }
}
