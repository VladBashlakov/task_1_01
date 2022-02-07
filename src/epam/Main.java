package epam;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        //1
        System.out.println(compareSumPartsOfNumber(1213));
        //2
        System.out.println(solveEquation(1.120, 2.031, 3.301));
        //3
        getPerimeterAndAreaOfTriangle(2, 3);
        //4
        System.out.println(checkIfDotOnPlot(1, 20));
        //5
        System.out.println(getExtent(2, -3, 2));
        //6
        System.out.println(getSumOfMinAndMaxNumbers(3, -101, 7));
        //7
        computeFunction(2, 9, 1);
        //8
        printNumbersMultiplesOfDivider(10, 2);
        //9
        mergeArrays(5);
        //10
        buildMatrix(14);

    }

    public static boolean compareSumPartsOfNumber(int number) {
        char[] charArray = (number + "").toCharArray();
        int[] numbers = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            numbers[i] = Character.getNumericValue(charArray[i]);
        }
        return (numbers[0] + numbers[1] == numbers[2] + numbers[3]);
    }

    public static double solveEquation(double a, double b, double c) {
        return (b + Math.sqrt((b * b) + (4 * a * c))) / (2 * a) - ((Math.pow(a, 3) * c) + (Math.pow(b, -2)));
    }

    public static void getPerimeterAndAreaOfTriangle(double a, double b) {
        System.out.println("perimeter = " + (a + b + (Math.sqrt((b * b) + (a * a)))));
        System.out.println("area = " + (0.5 * a * b));
    }

    public static boolean checkIfDotOnPlot(int x, int y) {
        if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            return true;
        }
        return (x >= -4 && x <= 4 && y >= -3 && y <= 0);
    }

    public static String getExtent(double a, double b, double c) {
        double[] arr = {a, b, c};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = Math.pow(arr[i], 2);
            } else {
                arr[i] = Math.pow(arr[i], 4);
            }
        }
        return Arrays.toString(arr);
    }

    public static int getSumOfMinAndMaxNumbers(int a, int b, int c) {
        int[] numbers = {a, b, c};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return min + max;
    }

    public static void computeFunction(double start, double end, double h) {
        double result;

        for (double i = start; i <= end; i += h) {
            double tgx = (Math.tan(i));
            double ctgx = 1 / tgx;

            result = (Math.sin(i) * Math.sin(i)) - ((ctgx - tgx) / ((ctgx) + tgx));
            System.out.println("    " + i + "     " + result + "    ");
        }
    }

    public static void printNumbersMultiplesOfDivider(int size, int divider) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            if (numbers[i] % divider == 0) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void mergeArrays(int divider) {
        int[] arr = {2, 3, 4, 5, 1, 2, 3, 5, 1, 2, 3, 4, 5, 8, 8, 8, 8, 8};
        int[] arr1 = {41, 5, 112, 4, 12, 412, 4, 5, 12, 5};
        int[] newArr = new int[arr.length + arr1.length];

        for (int i = 0; i < divider; i++) {
            newArr[i] = arr[i];
        }
        for (int i = divider, j = 0; i < arr1.length + arr1.length / 2; i++, j++) {
            newArr[i] = arr1[j];
        }
        for (int i = divider + arr1.length, j = divider; i < newArr.length; i++, j++) {
            newArr[i] = arr[j];
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void buildMatrix(int number) {
        int[][] numbers = new int[number + 1][number];

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < number; j++) {
                    numbers[i][j] = j;
                }
            } else {
                for (int j = 0; j < number; j++) {
                    numbers[i][j] = number - j;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = 0; i1 < number; i1++) {
                System.out.print(numbers[i][i1]);
            }
            System.out.println();
        }
    }

}









