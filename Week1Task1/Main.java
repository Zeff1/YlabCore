package Week1Task1;

public class Main {

    public static void main(String[] args) {
        int[][] randomArray = new int[10][10];
        System.out.println("Filling:");
        arrayfill(randomArray);
        arrayPrint(randomArray);
        System.out.println("Smallest number is: " + arrayMin(randomArray));
        System.out.println("Largest number is: " + arrayMax(randomArray));
        System.out.println("Mean is: " + arrayMean(randomArray));

    }

    public static void arrayfill(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = randomGenerator();
            }
        }
    }

    public static int randomGenerator() {
        int num = (int) (System.nanoTime() % 999);
        return num;
    }


    public static void arrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int arrayMin(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int arrayMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int arrayMean(int[][] array) {
        int mean = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                mean += array[i][j];
            }
        }
        mean = mean / (array.length * array[0].length);
        return mean;
    }
}


