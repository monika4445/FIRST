package hotel.human.Guest;

public class VIPGuest extends Guest {
    private String vip;
    private String rentalId;

    public VIPGuest(String vip, String rentalId) {
        super();
        this.vip = vip;
        this.rentalId = rentalId;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getRentalId() {
        return rentalId;
    }

    public void setRentalId(String rentalId) {
        this.rentalId = rentalId;
    }
}
