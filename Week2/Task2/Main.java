package Week2.Task2;

/*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */

import java.util.Arrays;

public class Main {
    public static int[] numArray = {3, 4, 2, 7, 6, 8, 5, 5};

    public static void main(String[] args) {
        sortByTenSum(numArray);
    }

    public static void sortByTenSum(int[] array) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 10) {
                    result[0] = array[i];
                    result[1] = array[j];
                    System.out.println(Arrays.toString(result));
                }
            }
        }
        if (result[0] == 0 && result[1] == 0)
            System.out.println("Pair not found!");
    }
}
