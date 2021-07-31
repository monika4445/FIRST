package hotel.hotelReservationSystem;

import hotel.human.Guest.Guest;
import hotel.human.Guest.VIPGuest;
import hotel.service.FoodService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuestService service = new GuestService();

        Guest guest1 = service.create();
        Guest guest2 = service.create();
        Guest guest3 = service.create();
        Guest[] guests = {guest1, guest2, guest3};


        VIPGuest vipGuest1 = service.createVip();
        VIPGuest vipGuest2 = service.createVip();
        VIPGuest vipGuest3 = service.createVip();
        VIPGuest vipGuest4 = service.createVip();
        VIPGuest[] vipGuests = {vipGuest1, vipGuest2, vipGuest3, vipGuest4};


        FoodService myService = new FoodService();

        ArrayList<ArrayList<String>> Food = new ArrayList<>();

        ArrayList<String> seaFoods = new ArrayList<>();
        seaFoods.add("Crab");
        seaFoods.add("Shrimps");
        seaFoods.add("Lobster");
        seaFoods.add("Crayfish");
        seaFoods.add("Prawn");
        seaFoods.add("Barnacles");

        ArrayList<String> Pasta = new ArrayList<>();
        Pasta.add("Fusilli Pasta");
        Pasta.add("Ditalini Pasta");
        Pasta.add("Bow Tie Pasta");
        Pasta.add("Egg Noodles Pasta");

        ArrayList<String> fastFood = new ArrayList<>();
        fastFood.add("Hamburger");
        fastFood.add("Hotdog");

        ArrayList<String> Drinks = new ArrayList<>();
        Drinks.add("Aperol Cocktail");
        Drinks.add("Bahama Mama");
        Drinks.add("Coconut Mojito");
        Drinks.add("Between the Sheets");
        Drinks.add("Daiquiri (Classic)");
        Drinks.add("Coffee");
        Drinks.add("Wine");
        Drinks.add("Beer");
        Drinks.add("Coca-Cola");
        Drinks.add("Milk");
        Drinks.add("Orange Juice");

        Food.add(seaFoods);
        Food.add(Pasta);
        Food.add(fastFood);
        Food.add(Drinks);


        Scanner ss = new Scanner(System.in);
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("Enter command number");
            System.out.println("1. Print full names of guests");
            System.out.println("2. Print all guests email");
            System.out.println("3. Print all guests sorted by year");
            System.out.println("4. Exit");
            int command = ss.nextInt();


            switch (command) {
                case 1:
                    service.printFullNamesOfGuests(guest1, guest2, guest3);
                    break;
                case 2:
                    service.printAllGuestsEmail(guest1, guest2, guest3);
                    break;
                case 3:
                    service.printAllGuestsSortedByYear(guests);
                    break;
                case 4:
                    myService.printFoodMenu(Food);
                    break;
                case 5:
                    isMenuActive = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid command number");

            }
        }
    }
}
