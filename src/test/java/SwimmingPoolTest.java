import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwimmingPoolTest {

    private SwimmingPool swimmingPool;
    private Guest guest;

    @Test
    public void canGoForASwim(){
        Guest guest = new Guest("Sammy", 45);
        SwimmingPool swimmingPool = new SwimmingPool();
        swimmingPool.goForASwim(guest);
        assertEquals(1, swimmingPool.swimmerCount());
    }
}
