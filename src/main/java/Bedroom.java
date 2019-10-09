import java.util.ArrayList;

public class Bedroom {


    private int capacity;
    private int roomNumber;
    private String roomType;
    private ArrayList<Guest> guestsCheckedIn;


   public Bedroom(int capacity, int roomNumber, String roomType){
       this.capacity = capacity;
       this.roomNumber = roomNumber;
       this.roomType = roomType;
       this.guestsCheckedIn = new ArrayList<Guest>();
   }


    public int getCapacity() {
       return this.capacity;

    }

    public int getRoomNumber() {
       return this.roomNumber;
    }

    public String getType() {
       return this.roomType;
    }

    public int getGuestsCheckedIn(){
       return this.guestsCheckedIn.size();
    }

    public boolean hasCapacity(){
       return this.capacity > this.getGuestsCheckedIn();
    }

    public void addGuest(Guest guest){
       if(hasCapacity()) {
           this.guestsCheckedIn.add(guest);
       }
    }

    public void removeGuest(Guest guest) {
       this.guestsCheckedIn.remove(guest);
    }
}
