package hotel.human.Guest;

public class VIPGuest extends Guest {
    private String vip;
    private int rentalId;

    public VIPGuest(String firstName, String lastName, String address, char gender, int contact, String nationality, int year, String email, long thePhone, char maritalStatus, String creditCard, long customerId, String documentNo, long reservationId, String vip, int rentalId) {
    }


    public VIPGuest(String vip, int rentalId) {
        super();
        this.vip = vip;
        this.rentalId = rentalId;
    }

    public String getVip() {
        return vip;
    }

    public void setVip() {
        this.vip = vip;
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Vip: " + vip);
        System.out.println("RentalId: " + rentalId);

    }
}
