public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;
    private Guest guest;

    public Booking(Bedroom bedroom, Guest guest, int nightsBooked){
        this.bedroom = bedroom;
        this.guest = guest;
        this.nightsBooked = nightsBooked;
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
}
