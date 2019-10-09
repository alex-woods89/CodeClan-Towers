import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guestsCheckedIn;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guestsCheckedIn = new ArrayList<Guest>();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public int getGuestCount() {
        return this.guestsCheckedIn.size();
    }

    public boolean hasCapacity(){
        return this.capacity > this.getGuestCount();
    }


    public void addGuest(Guest guest) {
        if(hasCapacity()){
        this.guestsCheckedIn.add(guest);}
    }

    public void removeGuest(Guest guest) {
        this.guestsCheckedIn.remove(guest);
    }
}
