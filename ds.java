package task1;

import java.util.Random;

public class ds {
    public static void main(String[] args) {
        getHoursSecondsLeft();
    }

    public static void getHoursSecondsLeft(){
        // Генерация случайного числа секунд от 0 до 28800
        Random random = new Random();
        int secondsLeft = random.nextInt(28801); // 28 801 — исключительная верхняя граница
        System.out.println("Random seconds left: " + secondsLeft);
        System.out.println("-------------------------------");

        if(secondsLeft > 0) {
            // Подсчитайте количество оставшихся полных часов
            int hoursLeft = secondsLeft / 3600;

            // Отображение оставшегося времени в часах с помощью оператора if
            if (hoursLeft >= 1) {
                System.out.print(hoursLeft + " hour");
                if (hoursLeft > 1) {
                    System.out.print("s");
                }
                System.out.println(" left");
            } else {
                System.out.println("Less than an hour left");
            }

            // Отображение количества оставшихся секунд для тех, кто понимает
            System.out.println(secondsLeft + " seconds left");
        }
        else{
            System.out.println(secondsLeft);
        }
    }
}
