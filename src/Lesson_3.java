import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3 {

    /**
     * 1.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     **/
    public static boolean checkSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 2.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static void isPositiveNumber(int number) {
        if (number >= 0) {
            System.out.println("This is positive number");
        } else {
            System.out.println("This is negative number");
        }
    }

    /**
     * 3.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
     * отрицательное, и вернуть false если положительное.
     */
    public static boolean isNegativeNumber(int number) {
        if (number < 0) {
            return true;
        } else
            return false;
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
     * указанную строку, указанное количество раз;
     */
    public static void repeatOutputOfLines(String line, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(line);
        }
    }

    /**
     * 5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
     * не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static void checkLeapYear(int year) {
        if (year % 4 == 0) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год не високосный");
        }
    }

    /**
     * 6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void replacingNumbersInArray() {
        int[] arr = {1, 1, 0, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    public static void fillingArray() {
        int[] arr = new int[100];
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            counter++;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void multiplyingNumbersByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов
     * равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
     */
    public static void fillingArrayDiagonals() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] = 1);
                } else {
                    System.out.print(arr[i][j] = 0);
                }
            }
            System.out.println();
        }
    }

    /**
     * 10. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
     * типа int длиной len, каждая ячейка которого равна initialValue.
     */
    public static int[] returnGivenArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return arr;
    }


    public static void main(String args[]) {
        int[] arr1 = returnGivenArray(5, 3);
        for (int o: arr1) {
            System.out.print(o + " ");
        }
    }

}
