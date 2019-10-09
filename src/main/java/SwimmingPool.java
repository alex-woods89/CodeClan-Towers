import java.util.ArrayList;

public class SwimmingPool {

    private ArrayList<Guest> guests;



    public SwimmingPool(){
        this.guests = new ArrayList<Guest>();
    }

    public void goForASwim(Guest guest){
        this.guests.add(guest);
    }

    public int swimmerCount() {
        return this.guests.size();
    }
}
