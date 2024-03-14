package Task1;

import java.util.Scanner;

public class AnimalApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat tom = new Cat("Tom");
        Bowl bowl = new Bowl();
        System.out.print("Введите количество еды в миске: ");
        bowl.setAmountOfFoodInBowl(scanner.nextInt());
        System.out.print("Введите сколько еды необходимо для кота: ");
        tom.setRequiredAmountOfFeed(scanner.nextInt());
        tom.eat(tom.getRequiredAmountOfFeed(), bowl.getAmountOfFoodInBowl());
        System.out.println(tom.getName() + " сыт? - " + tom.isSatiety());
    }
}
