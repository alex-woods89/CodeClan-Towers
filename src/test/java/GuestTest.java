import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;
    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        guest = new Guest("Sammy", 400);
        bedroom = new Bedroom(5,101, "Double", 10);
        booking = new Booking(bedroom, guest, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Sammy", guest.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(400, guest.getWallet());
    }

    @Test
    public void canPayBill(){
        guest.payBill(booking);
        assertEquals(350, guest.getWallet());
    }

}
