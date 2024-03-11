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

    public static void main(String[] args) {
        repeatOutputOfLines("hgif", 3);
    }

}
