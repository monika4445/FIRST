package hotel.hotelReservationSystem;

import hotel.human.Guest.Guest;

import java.util.Scanner;

public class Repl {
    public static void main(String[] args) {
        Guest service = new Guest();
        Guest guest1 = service.create();
        Guest guest2 = service.create();
        Guest guest3 = service.create();
        Guest[] guests = {guest1, guest2, guest3};

        Scanner ss = new Scanner(System.in);
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("Enter command number");
            System.out.println("1. Print full names of guests");
            System.out.println("2.Print all guests email");
            int command = ss.nextInt();

            switch (command) {
                case 1:
                    service.printFullNamesOfGuests(guest1, guest2, guest3);
                    break;
                case 2:
                    service.printAllGuestsEmail(guest1, guest2, guest3);
                    break;
                case 3:
                    isMenuActive = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid command number");

            }
        }
    }
}
