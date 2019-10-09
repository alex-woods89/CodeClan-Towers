import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private Guest guest;


    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();
        this.guest = guest;
    }


    public String getName() {
        return this.name;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void checkInToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkInToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutOfBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public void checkOutOfConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
    }

    public void bookRoom(Bedroom bedroom, Guest guest, int capacity) {
        if(capacity > bookingCount()){
        Booking newBooking = new Booking(bedroom, guest, capacity);
        bookings.add(newBooking);}
    }

    public int bookingCount() {
        return this.bookings.size();
    }

    public ArrayList<Bedroom> getEmptyRooms(){
        ArrayList<Bedroom> emptyRooms = new ArrayList<Bedroom>();
        for(Bedroom individualBedroom : bedrooms){
            if(individualBedroom.getGuestsCheckedIn() == 0){
                emptyRooms.add(individualBedroom);
            }
        }
        return emptyRooms;
    }

//    public void checkInFully(){
//        for(Booking booking : bookings){
//            if(booking.guestBooked() == guest){
//                this.checkInToBedroom(guest, bedroom);
//            }
//        }
//    }


}
