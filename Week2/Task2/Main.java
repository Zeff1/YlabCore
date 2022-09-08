package Week2.Task2;

/*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */

public class Main {
    public static int[] numArray = {3, 4, 2, 7, 6, 8, 5, 5};

    public static void main(String[] args) {
        sortByTenSum(numArray);
    }

    public static void sortByTenSum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 10)
                    System.out.println("[" + array[i] + "," + array[j] + "]");
                return;
            }
        }
        System.out.println("Pair not found!");
    }
}
