public class Guest {

    private String name;
    private int wallet;



    public Guest(String name, int wallet){

        this.name = name;
        this.wallet = wallet;
    }

    public String getName(){
        return this.name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void payBill(Booking booking) {
        if (this.getWallet() > booking.getBill()) {
             this.wallet -= booking.getBill();
        }
    }

}
