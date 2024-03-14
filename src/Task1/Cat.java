package Task1;

public class Cat extends Animal {

    final int maximumRunningDistance = 200;
    private String name;
    private boolean satiety = false;

    private int requiredAmountOfFeed;


    public Cat(String name) {
        super();
        this.name = name;
        satiety = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    public boolean isSatiety() {
        return satiety;
    }

    public int getRequiredAmountOfFeed() {
        return requiredAmountOfFeed;
    }

    public void setRequiredAmountOfFeed(int requiredAmountOfFeed) {
        this.requiredAmountOfFeed = requiredAmountOfFeed;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength > maximumRunningDistance) {
            System.out.println(getName() + " не сможет пробежать такую дистанцию");
        } else if (obstacleLength < 0) {
            System.out.println("Длина препятствия не может быть отрицательной");
        } else {
            System.out.println(getName() + " пробежал(а) " + obstacleLength + "м");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println("Кот не умеет плавать");
    }

    public void eat(int requiredAmountOfFeed, int amountOfFoodInBowl){
        if (amountOfFoodInBowl <=0 ){
            System.out.println("Миска пуста или количество корма не может быть отрицательным числом." + getName() + " остался голодный");
            satiety = false;
        } else if  (amountOfFoodInBowl < requiredAmountOfFeed){
            System.out.println("В миске мало корма." + getName() + " остался голодный");
            satiety = false;
        } else {
            System.out.println(getName() + " поел");
            satiety = true;
        }
    }


}
