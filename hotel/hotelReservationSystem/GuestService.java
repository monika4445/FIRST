package hotel.hotelReservationSystem;

import hotel.human.Guest.Guest;
import hotel.human.Guest.VIPGuest;

import java.util.Scanner;

public class GuestService {

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
        System.out.println("Enter Guest year of Birth ");
        int year = cc.nextInt();
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
                nationality, year, email, thePhone, maritalStatus, creditCard, customerId,
                documentNo, reservationId);
        return guest;
    }

    public VIPGuest createVip() {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter Guest first name");
        String firstName = m.next();
        System.out.println("Enter Guest last name");
        String lastName = m.next();
        System.out.println("Enter Guest address");
        String address = m.next();
        System.out.println("Enter Guest gender, m/f");
        char gender = m.next().charAt(0);
        System.out.println("Enter Guest contact");
        int contact = m.nextInt();
        System.out.println("Enter Guest nationality");
        String nationality = m.next();
        System.out.println("Enter Guest year of Birth ");
        int year = m.nextInt();
        System.out.println("Enter Guest email");
        String email = m.next();
        System.out.println("Enter Guest Phone number");
        long thePhone = m.nextLong();
        System.out.println("Enter Guest marital status, Y/N");
        char maritalStatus = m.next().charAt(0);
        System.out.println("Enter Guest Credit Card number");
        String creditCard = m.next();
        System.out.println("Enter Guest Customer Id");
        long customerId = m.nextLong();
        System.out.println("Enter Guest documentNo");
        String documentNo = m.next();
        System.out.println("Enter Guest Reservation Id");
        long reservationId = m.nextLong();
        System.out.println("Enter VIPGuest vip");
        String vip = m.next();
        System.out.println("Enter VIPGuest rentalId");
        int rentalId = m.nextInt();


        VIPGuest vipGuest = new VIPGuest(firstName, lastName, address, gender, contact,
                nationality, year, email, thePhone, maritalStatus, creditCard, customerId,
                documentNo, reservationId, vip, rentalId);
        return vipGuest;
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

    public Guest[] printAllGuestsSortedByYear(Guest[] guests) {
        boolean isActive = true;
        int countOfFors = 0;
        while (isActive) {
            isActive = false;
            for (int i = 0; i < guests.length - 1 - countOfFors; i++) {
                if (guests[i].getYear() > guests[i + 1].getYear()) {
                    Guest x = guests[i];
                    guests[i] = guests[i + 1];
                    guests[i + 1] = x;
                    isActive = true;
                }
            }
            countOfFors++;
        }
        return guests;

    }


}










