import java.util.Scanner;

static final int MAX_SPEED = 250;
static final int MIN_SPEED = 0;
static final int RACE_TIME_IN_DAY = 24;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car[] cars = new Car[3];

    for (int i = 0; i < cars.length; i++) {
        System.out.println("Введите название машины №" + (i + 1));
        String name = scanner.next();
        boolean isCorrectSpeed = false;

        while (!isCorrectSpeed) {
            System.out.println("Введите скорость машины №" + (i + 1));
            if (scanner.hasNextInt()) {
                int speed = scanner.nextInt();
                if (checkCorrectSpeed(speed)) {
                    isCorrectSpeed = true;
                    cars[i] = new Car(name, speed);
                } else {
                    System.out.println("Неправильная скорость");
                }
            } else {
                System.out.println("Неправильный тип данных, попробуйте снова!");
                scanner.next();
            }
        }


    }

    Race.startRace(cars,RACE_TIME_IN_DAY);

}

public static boolean checkCorrectSpeed(int speed) {
    return speed > MIN_SPEED && speed <= MAX_SPEED;
}

