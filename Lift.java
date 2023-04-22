package homework;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a height of a build");
        int heightOfBuild = scanner.nextInt();
        System.out.println("Enter a count for floors up");
        int countFloorUp = scanner.nextInt();
        System.out.println("Enter a count for floors down");
        int countFloorDown = scanner.nextInt();

        if (heightOfBuild > countFloorUp && countFloorUp > countFloorDown) {
            for (int i = 1; i < heightOfBuild; i++) {
                int result = (countFloorUp - countFloorDown) * i;
                if (heightOfBuild <= result + countFloorUp) {
                    System.out.println("number of lifts is " + (i + 1));
                    break;
                }
            }
        } else {
            System.out.println("Wrong parameters for this task!");
        }
    }
}


