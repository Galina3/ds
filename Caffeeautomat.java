package homework;

import java.util.Scanner;

public class Caffeeautomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number of drink");
        System.out.println("1 - espresso, 2 - americano, 3 - cappuccino, 4 - tea");
        int numberOfDrink = scanner.nextInt();
        if (numberOfDrink >= 1 && numberOfDrink <= 4) {

            switch (numberOfDrink) {

                case 1:
                    makingEspresso();
                    drinkReady();
                    break;
                case 2:
                    makingEspresso();
                    System.out.println("Adding a water to your drink...");
                    drinkReady();
                    break;
                case 3:
                    makingEspresso();
                    System.out.println("Adding a frothed milk to your drink...");
                    drinkReady();
                    break;
                case 4:
                    System.out.println("Choose a tea bag...");
                    System.out.println("Adding water...");
                    drinkReady();
                    break;
            }
        } else {
            System.out.println("Wrong number of a drink!");
        }
    }

    public static void drinkReady() {
        System.out.println("Your drink is ready. Enjoy it!");
    }

    public static void makingEspresso() {
        System.out.println("Starting process of making espresso...");
    }

}
