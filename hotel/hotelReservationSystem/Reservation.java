package hotel.hotelReservationSystem;

import hotel.entity.Room;

import java.util.Date;

public class Reservation extends Room {
    private int id;
    private Date checkInDate;
    private Date checkOutDate;
    private String fullName;
    private String email;
    private long phone;
    private String specialRequest;

    public Reservation() {
    }

    public Reservation(int id, Date checkInDate, Date checkOutDate, String fullName,
                       String email, long phone, String specialRequest) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.specialRequest = specialRequest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    @Override
    public String toString() {
        return "Reservation[ id=" + id + " ]";
    }


}
