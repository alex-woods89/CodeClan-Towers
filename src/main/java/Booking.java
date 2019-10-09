public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;
    private Guest guest;
    private int bill;

    public Booking(Bedroom bedroom, Guest guest, int nightsBooked){
        this.bedroom = bedroom;
        this.guest = guest;
        this.nightsBooked = nightsBooked;
        this.bill = nightsBooked * bedroom.getNightlyRate();
    }

    public Guest guestBooked() {
        return this.guest;
    }

    public Bedroom bedroomBooked() {
        return this.bedroom;
    }

    public int getNumberOfNights() {
        return this.nightsBooked;
    }

    public int getBill(){
        return this.bill;
    }
}
