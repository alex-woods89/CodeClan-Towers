import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 101, "single");
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

//    @Test
//    public void canAddGuest(){
//        bedroom.addGuest();
//    }
}
