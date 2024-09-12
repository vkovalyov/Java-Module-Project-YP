public class Race {

    public static void startRace(Car[] cars, int raceTimeInDays) {

        int fastestCarIndex = 0;
        int maxDistance = cars[0].speed * raceTimeInDays;
        int winnersCount = 1;

        for (int i = 1; i < cars.length; i++) {
            int distance = cars[i].speed * raceTimeInDays;

            if (distance > maxDistance) {
                winnersCount = 1;
                maxDistance = distance;
                fastestCarIndex = i;
            } else if (distance >= maxDistance) {
                winnersCount++;
            }
        }

        if (winnersCount > 1) {
            System.out.println("Ничья");
        } else {
            System.out.println("Самая быстрая машина: " + cars[fastestCarIndex].name);
        }
    }
}
