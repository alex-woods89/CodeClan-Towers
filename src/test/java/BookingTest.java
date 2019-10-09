import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Guest guest1;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 101, "double", 10);
        guest1 = new Guest("Sammy", 100);
        booking = new Booking(bedroom, guest1, 5);
    }

    @Test
    public void hasGuestBooked(){
        assertEquals(guest1, booking.guestBooked());
    }

    @Test
    public void hasBedroomBooked(){
        assertEquals(bedroom, booking.bedroomBooked());
    }

    @Test
    public void countNumberOfNights(){
        assertEquals(5, booking.getNumberOfNights());
    }

    @Test
    public void canGetBill(){
        assertEquals(50, booking.getBill());

    }

}
