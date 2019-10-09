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
}
