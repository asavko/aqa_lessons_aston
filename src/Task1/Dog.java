package Task1;

public class Dog extends Animal {

    final int maximumRunningDistance = 500;
    final int maximumSwimmingDistance = 10;
    private String name;

    public Dog(String name) {
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
        if (obstacleLength > maximumSwimmingDistance) {
            System.out.println(getName() + " не сможет проплыть такую дистанцию");
        } else if (obstacleLength < 0) {
            System.out.println("Длина препятствия не может быть отрицательной");
        } else {
            System.out.println(getName() + " проплыл(а) " + obstacleLength + "м");
        }
    }
}
