package hotel.human.Guest;

import hotel.human.Human.Human;

import java.util.Scanner;

public class Guest extends Human {
    public String creditCard;
    public long customerId;
    public String documentNo;
    public long reservationId;

    public Guest() {
    }

    public Guest(String firstName, String lastName, String address, char gender,
                 int contact, String nationality, int dateOfBirth, String email, long thePhone,
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
        System.out.println("Contact: " + contact);
        System.out.println("Nationality: " + nationality);
        System.out.println("Year: " + dateOfBirth);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + thePhone);
        System.out.println("Marital status, Y/N: " + maritalStatus);
        System.out.println("Credit Card: " + creditCard);
        System.out.println("Customer Id: " + customerId);
        System.out.println("DocumentNo: " + documentNo);
        System.out.println("ReservationId: " + reservationId);
        System.out.println("--------------------------------");


    }


    public Guest create() {
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter Guest first name");
        String firstName = cc.next();
        System.out.println("Enter Guest last name");
        String lastName = cc.next();
        System.out.println("Enter Guest address");
        String address = cc.next();
        System.out.println("Enter Guest gender, m/f");
        char gender = cc.next().charAt(0);
        System.out.println("Enter Guest contact");
        int contact = cc.nextInt();
        System.out.println("Enter Guest nationality");
        String nationality = cc.next();
        System.out.println("Enter Guest date of Birth ");
        int dateOfBirth = cc.nextInt();
        System.out.println("Enter Guest email");
        String email = cc.next();
        System.out.println("Enter Guest Phone number");
        long thePhone = cc.nextLong();
        System.out.println("Enter Guest marital status, Y/N");
        char maritalStatus = cc.next().charAt(0);
        System.out.println("Enter Guest Credit Card number");
        String creditCard = cc.next();
        System.out.println("Enter Guest Customer Id");
        long customerId = cc.nextLong();
        System.out.println("Enter Guest documentNo");
        String documentNo = cc.next();
        System.out.println("Enter Guest Reservation Id");
        long reservationId = cc.nextLong();

        Guest guest = new Guest(firstName, lastName, address, gender, contact,
                nationality, dateOfBirth, email, thePhone, maritalStatus, creditCard, customerId,
                documentNo, reservationId);
        return guest;
    }

    public void printFullNamesOfGuests(Guest g1, Guest g2, Guest g3) {
        System.out.println(g1.fullName());
        System.out.println(g2.fullName());
        System.out.println(g3.fullName());

    }

    public void printAllGuestsEmail(Guest guest1, Guest g2, Guest g3) {
        System.out.println(guest1.email);
        System.out.println(g2.email);
        System.out.println(g3.email);
    }
}






