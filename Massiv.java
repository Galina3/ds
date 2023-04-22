package homework;

import java.util.Arrays;
import java.util.Random;

public class Massiv {

        public static void main(String[] args) {

            Random random = new Random();
            int[] array = new int[15];

            for (int i = 0; i < 15; i++) {
                array[i] = random.nextInt(0,9);
            }

            System.out.println("array : " + Arrays.toString(array));

            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if(array[i] % 2 == 0 && array[i] != 0) {
                    count++;
                }
            }
            System.out.println("Count of even elements is : " + count);
        }
    }

