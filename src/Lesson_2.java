public class Lesson_2 {

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 3;
        int b = 5;

        int c = a + b;
        if (c >=0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отритцательная");
        }
    }

    public static void printColor(){
        int value = 9;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <=100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 53;
        int b = 12;

        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

}
