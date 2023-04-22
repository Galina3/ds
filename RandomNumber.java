package homework;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100,999);
        System.out.println("number is " + number);
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        System.out.println(first + " " + second + " " + third);

        if (first >= second && first >= third) {
            System.out.println(first);
        } else if (first <= third && second <= third) {
            System.out.println(third);
        } else {
            System.out.println(second);
        }
    }
}
