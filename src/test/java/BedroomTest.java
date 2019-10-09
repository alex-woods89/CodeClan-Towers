import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 101, "single", 10);
        guest = new Guest("Sammy", 100);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("single", bedroom.getType());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.getGuestsCheckedIn());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestsCheckedIn());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuestsCheckedIn());
    }

    @Test
    public void cannotAddGuest(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestsCheckedIn());
    }

    @Test
    public void canGetNightlyRate(){
        assertEquals(10, bedroom.getNightlyRate());
    }
}
