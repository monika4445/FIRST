package hotel.human.Guest;

import hotel.human.Human;

public class Guest extends Human {
    public String creditCard;
    public long customerId;
    public String documentNo;
    public long reservationId;

    public Guest() {
    }

    public Guest(String firstName, String lastName, String address, char gender,
                 int contact, String nationality, int year, String email, long thePhone,
                 char maritalStatus, String creditCard, long customerId, String documentNo, long reservationId) {
    }


    public Guest(long customerId, String documentNo, String creditCard, long reservationId) {
        this.customerId = customerId;
        this.creditCard = creditCard;
        this.documentNo = documentNo;
        this.reservationId = reservationId;
    }



    public String fullName() {
        return firstName + " " + lastName;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    @Override
    public String toString() {
        return "Guest{" + "--------------------------------" +
                "creditCard='" + creditCard + '\'' +
                ", customerId=" + customerId +
                ", documentNo='" + documentNo + '\'' +
                ", reservationId=" + reservationId + "--------------------------------" + "}";
    }

    public void printInfo() {
        System.out.println("--------------------------------");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + (gender == 'm' ? "Male" : "Female"));
        System.out.println("Nationality: " + nationality);
        System.out.println("Year: " + year);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + thePhone);
        System.out.println("Marital status, Y/N: " + maritalStatus);
        System.out.println("Credit Card: " + creditCard);
        System.out.println("Customer Id: " + customerId);
        System.out.println("DocumentNo: " + documentNo);
        System.out.println("ReservationId: " + reservationId);
        System.out.println("--------------------------------");


    }


}

